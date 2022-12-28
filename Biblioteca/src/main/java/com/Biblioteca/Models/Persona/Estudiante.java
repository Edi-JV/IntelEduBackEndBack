package com.Biblioteca.Models.Persona;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "estudiante")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Estudiante implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nombre;

    private String Apellido;

    private String email;

    private String contra;
}
