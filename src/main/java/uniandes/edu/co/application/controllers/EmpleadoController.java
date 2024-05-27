package uniandes.edu.co.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uniandes.edu.co.application.model.Empleado;
import uniandes.edu.co.application.repositories.EmpleadoRepository;

import java.util.Collection;

@RestController
public class EmpleadoController {
    @Autowired
    private EmpleadoRepository repository;

    @GetMapping
    public Collection<Empleado> encontrar() {
        return repository.encontrar();
    }
}
