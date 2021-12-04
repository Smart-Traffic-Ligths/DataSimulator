package edu.eci.arep.controlador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arep.controlador.service.DataService;

@RestController
@RequestMapping( "/v1/data" )
public class Controller {
	
	private DataService dataService;
	
	@Autowired
	public Controller( DataService dataService ){
        this.dataService = dataService;
    }
	
	@PostMapping
    public void generateData( ){
		dataService.generateData();
    }

	

}
