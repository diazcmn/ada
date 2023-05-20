package com.example.EstudiantesCRUD.repositorio;

import com.example.EstudiantesCRUD.entidad.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//este es nuestro segundo paquete. extiende jpa la dependencia repositorio, entre corchetitos los parametros la entidad
//y el tipo de datos primario (long id)
@Repository
//la funcion de la clase repositorio jpa es interactuar con la base de datos
//nos da la lista de interacciones (crud) "inyeccion"
public interface EstudianteRepo extends JpaRepository<Estudiante, long> {


}
