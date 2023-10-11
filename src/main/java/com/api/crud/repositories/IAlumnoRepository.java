package com.api.crud.repositories;

import com.api.crud.models.AlumnoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAlumnoRepository extends JpaRepository<AlumnoModel, Integer> {
}
