package com.example.demo.interfacesServices;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Tarea;
@Service
public interface ITareaServices {
public List<Tarea>Listar();
public Optional<Tarea>ListarId(int id);
public int save(Tarea t);
public void delete(int id);
}
