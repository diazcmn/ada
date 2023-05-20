package com.example.EstudiantesCRUD.servicio;

import com.example.EstudiantesCRUD.entidad.Estudiante;
import com.example.EstudiantesCRUD.repositorio.EstudianteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//implements de estudianteserv (herencia) implementa todos los metodos
@Service //lo delaro serv porque trabaja con la extencion de otra clase
public class ImpEstudianteServ implements EstudianteServ{

    @Autowired
    //inyeccion de dependencia autoamticamente
    private EstudianteRepo estudianteRepo;

    @Override
    public List<Estudiante> listarTodosEst() {
        return estudianteRepo.findAll();
        //se llama al objeto que contiene la extension del crud
        // (estudianterepo) punto y el metodo
    }

    @Override
    public Estudiante guardarEst(Estudiante estudiante) {
        return estudianteRepo.save(estudiante);
    }

    @Override
    public Estudiante obtenerEstPorId(Long id) {
        return estudianteRepo.findById(id).get();
        //trabaja en conjunto con get porque los registros se sacan del form
    }

    @Override
    public Estudiante actualizarEst(Estudiante estudiante) {
        return estudianteRepo.save(estudiante);
        //le pasamos por parametro el objeto
    }

    @Override
    public void eliminarEst(long id) {
        //no retorna nada, solo elimina
        //llamamos directamente al objeto repo y le aplicamos el metodo
        estudianteRepo.deleteById(id);

    }



}
