package com.Biblioteca.Repository.Persona;

import com.Biblioteca.Models.Persona.Estudiante;
import com.Biblioteca.Models.Persona.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {

    Optional<Estudiante> findByEmail(String email);

    Boolean existsByEmail (String cedula);

}
