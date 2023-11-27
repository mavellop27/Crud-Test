package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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
}
