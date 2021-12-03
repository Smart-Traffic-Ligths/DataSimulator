package edu.eci.arep.controlador.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.eci.arep.controlador.service.ControladorService;

@RestController
@RequestMapping( "/v1/controlador" )
public class Controller {
	
	private ControladorService controladorService;
	
	@Autowired
	public Controller( ControladorService controladorService ){
        this.controladorService = controladorService;
    }
	
	@PostMapping
    public void generateDates( ){
		controladorService.generateDates();
    }

	

}
