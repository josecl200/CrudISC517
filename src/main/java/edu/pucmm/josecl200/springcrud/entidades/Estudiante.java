package edu.pucmm.josecl200.springcrud.entidades;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import javax.persistence.*;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Estudiante implements Serializable{
    @Id
    private int matricula;
    private String nombre;
    private String apellido;
    private String telefono;
}
