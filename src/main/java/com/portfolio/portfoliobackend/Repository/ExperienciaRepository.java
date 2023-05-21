package com.portfolio.portfoliobackend.Repository;

import com.portfolio.portfoliobackend.Entity.Experiencia;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer> {

    public Optional<Experiencia> findByNombreExperiencia(String nombreExperiencia);

    public boolean existsByNombreExperiencia(String nombreExperiencia);
}
