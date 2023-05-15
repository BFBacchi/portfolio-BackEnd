package com.portfolio.portfoliobackend.IPersonaRepository;

import com.portfolio.portfoliobackend.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
