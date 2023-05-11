/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfoliobackend.IPersonaRepository;

import com.portfolio.portfoliobackend.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author W10-PC
 */
public interface IPersonaRepository extends JpaRepository <Persona, Long> {
    
}