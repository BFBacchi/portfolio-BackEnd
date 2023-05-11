/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.portfoliobackend.Security.Repository;

import com.portfolio.portfoliobackend.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario, Integer> {
  Optional<Usuario> findByNombre(String nombreUsuario);   
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);

    public Optional<Usuario> findByNombreUsuario(String nombreUsuario);
}
