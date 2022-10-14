/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Controlador;

import com.example.demo.Modelo.Computer;
import com.example.demo.Servicio.ComputerService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;



/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/api/Computer")

public class ComputerController {
      @Autowired
    private ComputerService computerService;
    
    @GetMapping("/all")
    public List<Computer> getAll(){
        return computerService.getAll();
    }
    
    @GetMapping("/{id}")
    public Optional<Computer> getComputer(@PathVariable("id") int id){
        return computerService.getComputer(id);    
    } 
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computer save (@RequestBody Computer Computer){
        return computerService.save(Computer);
    }
}
