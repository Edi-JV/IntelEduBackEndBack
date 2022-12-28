package com.Biblioteca.DTO.Persona;

import lombok.Data;

import java.io.Serializable;

@Data
public class EstudianteClienteRequest implements Serializable {


    private Long id;

    private String Nombre;

    private String Apellido;

    private String email;

    private String contra;


}
