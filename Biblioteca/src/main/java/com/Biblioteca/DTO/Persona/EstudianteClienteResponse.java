package com.Biblioteca.DTO.Persona;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EstudianteClienteResponse {

    private Long id;

    private String Nombre;

    private String Apellido;

    private String email;

    private String contra;

    private String token;

}
