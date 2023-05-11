/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfoliobackend.Service;

import com.portfolio.portfoliobackend.Entity.Persona;
import com.portfolio.portfoliobackend.IPersonaRepository.IPersonaRepository;
import com.portfolio.portfoliobackend.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplementPersonaService implements IPersonaService{

    @Autowired IPersonaRepository ipersonarepository;
            
    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = ipersonarepository.findAll();
        return persona;
        
    }

    @Override
    public void guardarPersona(Persona persona) {
        ipersonarepository.save(persona);
    }

    @Override
    public void eliminarPersona(Long id) {
        ipersonarepository.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
       Persona persona = ipersonarepository.findById(id).orElse(null);
       return persona;
    }
    
}
