package com.proyectos.springboot.web.app.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.proyectos.springboot.web.app.models.entity.Monitoreo;

public interface IMonitoreoDao extends CrudRepository<Monitoreo, Long>{

}
