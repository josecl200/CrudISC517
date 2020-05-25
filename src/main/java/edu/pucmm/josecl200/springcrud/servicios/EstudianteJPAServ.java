package edu.pucmm.josecl200.springcrud.servicios;

import edu.pucmm.josecl200.springcrud.entidades.Estudiante;
import edu.pucmm.josecl200.springcrud.repositorios.EstudianteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteJPAServ {

    @Autowired
    private EstudianteRepo estudianteRepo;
    public List<Estudiante> listEstudiante(){
        return estudianteRepo.findAll();
    }

    @Transactional
    public boolean saveEstudiante(Estudiante est){
        if(estudianteRepo.save(est)!=null)
            return true;
        return false;
    }
    public Estudiante readEstudiante(int matricula){
        return estudianteRepo.findById(matricula).get();
    }
    public void deleteEstudiante(int matricula){
        estudianteRepo.deleteById(matricula);
    }

}
