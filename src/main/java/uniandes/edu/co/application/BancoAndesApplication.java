package uniandes.edu.co.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import uniandes.edu.co.application.model.Empleado;
import uniandes.edu.co.application.repositories.EmpleadoRepository;

import java.util.ArrayList;

@SpringBootApplication
@EnableMongoRepositories
public class BancoAndesApplication implements CommandLineRunner {
    @Autowired
    private EmpleadoRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(BancoAndesApplication.class, args);
    }

    @Override
    public void run(String[] args) {
        repository.crear(1, "Tipo", "Nombre", "Cedula", "TipoEmpleado");
        repository.crear(2, "Tipo", "Nombre", "Cedula", "TipoEmpleado");
        repository.crear(3, "Tipo", "Nombre", "Cedula", "TipoEmpleado");
        repository.crear(4, "Tipo", "Nombre", "Cedula", "TipoEmpleado");
        System.out.println(repository.encontrar(1));
        System.out.println(repository.encontrar());
        repository.insertarOficina(1, 1, "NombreOficina", "DireccionOficina");
        repository.insertarOficina(1, 2, "NombreOficina", "DireccionOficina");
        repository.insertarOficina(1, 3, "NombreOficina", "DireccionOficina");
        repository.insertarOficina(1, 4, "NombreOficina", "DireccionOficina");
        repository.insertarPuntoAtencion(1, 1, 100);
        System.out.println(repository.encontrar(1));
    }
}

