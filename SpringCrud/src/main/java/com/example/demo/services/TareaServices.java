package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.interfaces.ITarea;
import com.example.demo.interfacesServices.ITareaServices;
import com.example.demo.model.Tarea;
@Service
public class TareaServices implements ITareaServices{
	
	@Autowired
	private ITarea data;
	@Override
	public List<Tarea> Listar() {
		return (List<Tarea>)data.findAll();
	}

	@Override
	public Optional<Tarea> ListarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(Tarea t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
