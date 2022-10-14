/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.Servicio;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Modelo.Computer;
import com.example.demo.Repositorio.ComputerRepository;
/**
 *
 * @author USUARIO
 */

@Service

public class ComputerService {
      @Autowired
    private ComputerRepository computerRepository;
    
    public List<Computer> getAll(){
        return computerRepository.getAll();
    }
    
    public Optional<Computer> getComputer(int id){
        return computerRepository.getComputer(id);
    }
    
    public Computer save (Computer computer){
        if (computer.getId() == null){
            return computerRepository.save(computer);
        } else {
            Optional<Computer> computerl = computerRepository.getComputer(computer.getId());
            if(computerl.isEmpty()){
                return computerRepository.save(computer);
            } else {
                return computer;
            }
        }
    }
}
