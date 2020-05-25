package edu.pucmm.josecl200.springcrud.repositorios;

import edu.pucmm.josecl200.springcrud.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstudianteRepo extends JpaRepository<Estudiante,Integer> {

    List<Estudiante> findAllByOrderByMatriculaDesc();
}
