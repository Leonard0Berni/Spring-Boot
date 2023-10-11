package com.api.crud.controllers;

import com.api.crud.models.AlumnoModel;
import com.api.crud.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    @GetMapping
    public ArrayList<AlumnoModel> lista(){
        return this.alumnoService.listaAlumnos();

    }

    @PostMapping
    public AlumnoModel save(@RequestBody AlumnoModel alum){
        return this.alumnoService.saveAlumno(alum);
    }

    @GetMapping(path = "/{id}")
    public Optional<AlumnoModel> getById(@PathVariable int id){
        return this.alumnoService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public AlumnoModel update(@RequestBody AlumnoModel request,@PathVariable("id") int id){
        return this.alumnoService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String delete (@PathVariable("id") int id){
        boolean ok = this.alumnoService.delete(id);
        if(ok){
            return "true";
        }else{
            return "false";
        }
    }

}
