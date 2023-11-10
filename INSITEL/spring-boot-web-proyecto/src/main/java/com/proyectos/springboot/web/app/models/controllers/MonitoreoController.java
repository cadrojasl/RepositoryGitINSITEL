package com.proyectos.springboot.web.app.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.proyectos.springboot.web.app.models.entity.Monitoreo;
import com.proyectos.springboot.web.app.models.services.IMonitoreoService;

@RestController
@RequestMapping("/api/monitoreo")
public class MonitoreoController {

	    @Autowired
	    private IMonitoreoService servMonitoreo;
	    
	    @GetMapping("/buscarTodos")
	    public List<Monitoreo> getTodosLosPuntos() {
	        return servMonitoreo.findAll();
	    }
	    
	    @GetMapping("/buscarporId/{id}")
	    public Monitoreo getCordenada(@PathVariable Long id) {
	    	return servMonitoreo.buscar(id);
	    }
	    
	    @PostMapping("/guardar")
	    @ResponseStatus(HttpStatus.CREATED)
	    public Monitoreo guardarCord(@RequestBody Monitoreo cordenada) {
	    	return servMonitoreo.gurdarCordenada(cordenada);
	    }
	    @PutMapping("/actualizar/{id}")
	    @ResponseStatus(HttpStatus.CREATED)
	    public Monitoreo actualizarCord(@RequestBody Monitoreo cordenada, @PathVariable Long id) {
	    	return servMonitoreo.actualizarCordenada(cordenada, id);
	    }
	    
	    
	    @DeleteMapping("/eliminarId/{id}")
	    @ResponseStatus(HttpStatus.NO_CONTENT)
	    public void eliminar(@PathVariable Long id) {
	    	servMonitoreo.eliminarCordenada(id);
	    }
	    	
	    



}
