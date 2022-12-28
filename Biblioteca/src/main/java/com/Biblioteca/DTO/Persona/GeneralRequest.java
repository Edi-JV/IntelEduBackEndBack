package com.Biblioteca.DTO.Persona;

import lombok.Data;

import java.io.Serializable;

@Data
public class GeneralRequest implements Serializable {
    private String email, contra;
}
