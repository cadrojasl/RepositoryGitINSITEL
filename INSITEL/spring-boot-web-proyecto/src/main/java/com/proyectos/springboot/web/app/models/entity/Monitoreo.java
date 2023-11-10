package com.proyectos.springboot.web.app.models.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Monitoreo")
public class Monitoreo implements Serializable{
	

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		private String nombre;
	    private double latitud;
	    private double longitud;
	    private double temperatura;
	   
	


		public Long getId() {
			return id;
		}




		public void setId(Long id) {
			this.id = id;
		}




		public String getNombre() {
			return nombre;
		}




		public void setNombre(String nombre) {
			this.nombre = nombre;
		}




		public double getLatitud() {
			return latitud;
		}




		public void setLatitud(double latitud) {
			this.latitud = latitud;
		}




		public double getLongitud() {
			return longitud;
		}




		public void setLongitud(double longitud) {
			this.longitud = longitud;
		}




		public double getTemperatura() {
			return temperatura;
		}




		public void setTemperatura(double temperatura) {
			this.temperatura = temperatura;
		}




		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

}
