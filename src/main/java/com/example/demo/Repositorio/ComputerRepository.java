/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Repositorio;

import com.example.demo.Interface.ComputerInterface;
import org.springframework.stereotype.Repository;
import com.example.demo.Modelo.Computer;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
/**
 *
 * @author USUARIO
 */

@Repository

public class ComputerRepository {
     @Autowired
    private ComputerInterface extencionesCrud;
    
    public List<Computer> getAll(){
        return (List<Computer>) extencionesCrud.findAll();
    }
    
    public Optional<Computer> get(int id){
        return extencionesCrud.findById(id);
    }
    
    public Computer save(Computer computer){
        return extencionesCrud.save(computer);
    }

    public Optional<Computer> getComputer(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}