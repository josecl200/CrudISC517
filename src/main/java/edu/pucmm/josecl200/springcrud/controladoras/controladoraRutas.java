package edu.pucmm.josecl200.springcrud.controladoras;

import edu.pucmm.josecl200.springcrud.entidades.Estudiante;
import edu.pucmm.josecl200.springcrud.servicios.EstudianteServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controladoraRutas {
    @Autowired
    private EstudianteServ service;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("estudiantes", service.listEstudiante());
        return "index";
    }
    @RequestMapping(path = "/create", method = RequestMethod.GET)
    public String create(Model model){
        return "create";
    }

    @RequestMapping(path = "/create", method = RequestMethod.POST)
    public String insertEst(@RequestParam int matricula,@RequestParam String nombre,@RequestParam String apellido,@RequestParam String telefono){
        Estudiante nuveau = new Estudiante(matricula,nombre,apellido,telefono);
        if(service.createEstudiante(nuveau)){
            return "redirect:/";
        }else{
            return "no sirve xd";
        }
    }

    @RequestMapping(path = "/read/{matricula}", method = RequestMethod.GET)
    public String list(Model model, @PathVariable int matricula){
        model.addAttribute("estudiante", service.readEstudiante(matricula));
        return "read";
    }

    @RequestMapping(path = "/update/{matricula}", method = RequestMethod.GET)
    public String update(Model model, @PathVariable int matricula){
        model.addAttribute("estudiante", service.readEstudiante(matricula));
        model.addAttribute("modificar", true);
        return "create";
    }
    @RequestMapping(path = "/update", method = RequestMethod.POST)
    public String updateEst(@RequestParam int matricula,@RequestParam String nombre,@RequestParam String apellido,@RequestParam String telefono){
        Estudiante nuveau = new Estudiante(matricula,nombre,apellido,telefono);
        if(service.updateEstudiante(nuveau)){
            return "redirect:/";
        }else{
            return "no sirve xd";
        }
    }

    @RequestMapping(path = "/delete/{matricula}", method = RequestMethod.POST)
    public String deleteEst(@PathVariable int matricula){
        if(service.deleteEstudiante(matricula)){
            return "redirect:/";
        }else{
            return "no sirve xd";
        }
    }
}
