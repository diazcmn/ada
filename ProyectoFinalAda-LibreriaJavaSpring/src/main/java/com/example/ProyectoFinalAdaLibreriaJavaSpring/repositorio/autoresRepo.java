package com.example.ProyectoFinalAdaLibreriaJavaSpring.repositorio;

import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Autores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//extendemos jpa repository con su entidad y tipo de dato (parametros)
public interface autoresRepo extends JpaRepository<Autores, Integer> {

}
