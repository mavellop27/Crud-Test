package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Component
@Entity
@Table(name="tarea")

public class Tarea {
	@Autowired
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id_tarea;
private String nombre;
private String descripcion;

public Tarea() {
	
}

public Tarea(int id_tarea, String nombre, String descripcion) {
	super();
	this.id_tarea = id_tarea;
	this.nombre = nombre;
	this.descripcion = descripcion;
}

public int getId_tarea() {
	return id_tarea;
}

public void setId_tarea(int id_tarea) {
	this.id_tarea = id_tarea;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

}
