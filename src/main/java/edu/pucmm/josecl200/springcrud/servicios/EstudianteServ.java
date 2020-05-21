package edu.pucmm.josecl200.springcrud.servicios;

import edu.pucmm.josecl200.springcrud.entidades.Estudiante;

import java.util.List;

public class EstudianteServ {
    private List<Estudiante> estudiantes;
    public List<Estudiante> listEstudiante(){
        return estudiantes;
    }
    public boolean createEstudiante(Estudiante est){
        if(!estudiantes.contains(est) && estudiantes.add(est))
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
