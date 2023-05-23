package com.example.Agendacontactos.repositorio;

import com.example.Agendacontactos.entidad.contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//extendemos jpa repository con su entidad y tipo de dato (parametros)
public interface contactoRepo extends JpaRepository<contacto, Integer> {
}
