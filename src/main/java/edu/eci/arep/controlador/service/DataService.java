package edu.eci.arep.controlador.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

import com.google.gson.Gson;

import edu.eci.arep.controlador.dto.DataDto;


@Service
public class DataService {
	
	private RestTemplate restTemplate;
	
	@Autowired
	public DataService(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	public void generateData() {
		int numberThreads = 5;	
		List<DataDto> allData=getDataJSON("AREP");
		allData.addAll(getDataJSON("AREP-2"));
		allData.addAll(getDataJSON("AREP-3"));
		allData.addAll(getDataJSON("AREP-4"));
		allData.addAll(getDataJSON("AREP-5"));
		for(int i=0;i<numberThreads;i++) {
			iniciateThread(i,allData);
		}
	}
	
	private List<DataDto> getDataJSON(String fileName) {
		String file = "";
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			InputStream inputStream = classLoader.getResourceAsStream(fileName+".json");
			BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
			String line;
			while ((line = br.readLine()) != null) {
		        file += line;
		    }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Gson gson = new Gson();
		Type listType = new TypeToken<ArrayList<DataDto>>(){}.getType();
		List<DataDto> json = gson.fromJson(file, listType);
		return json;
	
	}
	
	private void iniciateThread(int initialData,List<DataDto> data) {
		Timer timer = new Timer();
		TimerTask TimeForLiberate = new TimerTask() {
			@Override
            public void run() {
				for(int i=0;i<initialData*1000+1000;i++) {
					sentToApiRest(data.get(i));
				}
            }
		};
		
		timer.schedule(TimeForLiberate,0);
	}
	
	private void sentToApiRest(DataDto data) {
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity <DataDto> entity = new HttpEntity<DataDto>(data,headers);
	    restTemplate.exchange("http://localhost:8081/v1/logs", HttpMethod.POST, entity, Void.class);
		
	}

}
