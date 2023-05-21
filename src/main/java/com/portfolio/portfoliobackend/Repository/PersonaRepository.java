package com.portfolio.portfoliobackend.Repository;

import com.portfolio.portfoliobackend.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

    public Optional<Persona> findByNombrePersona(String nombrePersona);

    public boolean existsByNombrePersona(String nombrePersona);
}
