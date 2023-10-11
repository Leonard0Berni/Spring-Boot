package com.api.crud.services;

import com.api.crud.models.AlumnoModel;
import com.api.crud.repositories.IAlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AlumnoService {
    @Autowired
    private IAlumnoRepository alumnoRepository;


    public ArrayList<AlumnoModel> listaAlumnos() {
        return (ArrayList<AlumnoModel>) alumnoRepository.findAll();
    }

    public AlumnoModel saveAlumno(AlumnoModel alum){
        return alumnoRepository.save(alum);
    }

    public Optional<AlumnoModel> getById(int id) {
        return this.alumnoRepository.findById(id);
    }

    public AlumnoModel updateById(AlumnoModel request, int id){
        AlumnoModel alum = this.alumnoRepository.findById(id).get();
        alum.setNombre(request.getNombre());
        alum.setApellido(request.getApellido());
        alum.setEdad(request.getEdad());
        this.alumnoRepository.save(alum);

        return alum;
    }

    public Boolean delete(int id) {
        try{
            this.alumnoRepository.deleteById(id);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
