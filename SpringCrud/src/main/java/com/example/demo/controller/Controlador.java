package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.interfacesServices.ITareaServices;
import com.example.demo.model.Tarea;
 
@Controller
@RequestMapping
public class Controlador {
	@Autowired
	private ITareaServices service;
	
	@GetMapping("/listar")
public String listar(Model model) {
	List<Tarea>Tareas=service.Listar();
	model.addAttribute("Tareas", Tareas);
	return "index";
}
	@GetMapping("/new")
	public String agregar(Model model) {
	model.addAttribute("tareas",new Tarea());
	return "form";
	}
	@PostMapping("/save")
	public String save(Tarea t,Model model) {
	service.save(t);
	return "redirect:/listar";
	}
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Tarea>tarea=service.ListarId(id);
		model.addAttribute("tarea", tarea);
		return "form";
	}
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}
