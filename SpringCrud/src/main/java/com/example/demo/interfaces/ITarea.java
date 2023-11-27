package com.example.demo.interfaces;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.model.Tarea;
@Repository
@ComponentScan
public interface ITarea extends JpaRepository<Tarea, Integer> {

}
