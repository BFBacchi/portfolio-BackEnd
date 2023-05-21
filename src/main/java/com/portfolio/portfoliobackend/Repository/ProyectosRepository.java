package com.portfolio.portfoliobackend.Repository;

import com.portfolio.portfoliobackend.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectosRepository extends JpaRepository<Proyectos, Integer> {

    public Optional<Proyectos> findByNombreProyecto(String nombreProyecto);

    public boolean existsByNombreProyecto(String nombreProyecto);
}
