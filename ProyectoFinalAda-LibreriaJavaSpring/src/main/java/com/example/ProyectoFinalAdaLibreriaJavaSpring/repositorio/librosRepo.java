package com.example.ProyectoFinalAdaLibreriaJavaSpring.repositorio;

import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Autores;
import com.example.ProyectoFinalAdaLibreriaJavaSpring.entidad.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//extendemos jpa repository con su entidad y tipo de dato (parametros)
public interface librosRepo extends JpaRepository<Libros, Integer> {

}
