package edu.eci.arep.controlador.service;

import java.util.Timer;
import java.util.TimerTask;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ControladorService {
	
	private RestTemplate restTemplate;
	
	@Autowired
	public ControladorService(RestTemplate restTemplate) {
		this.restTemplate=restTemplate;
	}
	
	public void generateDates() {
		int numberThreads = 8;	
		for(int i=0;i<numberThreads;i++) {
			iniciateThread(i);
		}
	}
	private void getDatesJSON() {
		// parsing file "JSONExample.json"
        //Object ob = new JSONParser().parse(new FileReader("JSONFile.json"));
        
	}
	
	private void iniciateThread(int datoInicial) {
		Timer timer = new Timer();
		TimerTask TimeForLiberate = new TimerTask() {
			@Override
            public void run() {
				for(int i=0;i<(i+1)*1000+1000;i++) {
					System.out.println(i);
				}
            }
		};
		timer.schedule(TimeForLiberate,0);
	}

}
