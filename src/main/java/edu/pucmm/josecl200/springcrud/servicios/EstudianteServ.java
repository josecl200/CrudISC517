package edu.pucmm.josecl200.springcrud.servicios;

import edu.pucmm.josecl200.springcrud.entidades.Estudiante;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EstudianteServ {
    private List<Estudiante> estudiantes=new ArrayList<>();
    public List<Estudiante> listEstudiante(){
        return estudiantes;
    }
    public boolean createEstudiante(Estudiante est){
        if(estudiantes.add(est))
            return true;
        return false;
    }
    public Estudiante readEstudiante(int matricula){
        for(Estudiante est : estudiantes)
            if (est.getMatricula()==matricula)
                return est;
        return null;
    }
    public boolean updateEstudiante(Estudiante estUp){
          for(Estudiante est:estudiantes)
              if (est.getMatricula()==estUp.getMatricula()) {
                  estudiantes.set(estudiantes.indexOf(est), estUp);
                  return true;
              }
          return false;
    }
    public boolean deleteEstudiante(int matricula){
        for (Estudiante est: estudiantes) {
            if (est.getMatricula()==matricula){
                estudiantes.remove(estudiantes.indexOf(est));
                return true;
            }
        }
        return false;
    }

}
