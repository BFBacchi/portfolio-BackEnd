/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.portfoliobackend.Entity;




import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.Size;


import lombok.Getter;
import lombok.Setter;


@Entity
@Setter @Getter
public class Persona {

   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    
    @NotNull
    @Size(min=1, max=50, message = "No debe estar vacio")
    private String nombre;
    
    @NotNull
    @Size(min=1, max=50, message = "No debe estar vacio")
    private String apellido;
    
    @Size(min=1, max=50, message = "No debe estar vacio")
    private String imagen;
    
}
