package edu.pucmm.josecl200.springcrud.entidades;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class Estudiante {
    private int matricula;
    private String nombre;
    private String apellido;
    private String telefono;
}
