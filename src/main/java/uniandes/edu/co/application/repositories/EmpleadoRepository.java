package uniandes.edu.co.application.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;
import uniandes.edu.co.application.model.Empleado;
import uniandes.edu.co.application.model.Oficina;

import java.util.ArrayList;
import java.util.Collection;

public interface EmpleadoRepository extends MongoRepository<Empleado, Integer> {
    @Query("{id: ?0}")
    Empleado encontrar(Integer id);
    @Query("{}")
    Collection<Empleado> encontrar();

    default void crear(Empleado empleado) {
        save(empleado);
    }
    default void crear(Integer id, String tipoPersona, String nombre, String cedula, String tipoEmpleado) {
        crear(id, tipoPersona, nombre, cedula, tipoEmpleado, new ArrayList<>());
    }
    default void crear(Integer id, String tipoPersona, String nombre, String cedula, String tipoEmpleado, Collection<Oficina> oficinas) {
        save(new Empleado(id, tipoPersona, nombre, cedula, tipoEmpleado, oficinas));
    }

    default void insertarOficina(Integer id, Oficina oficina) {
        insertarOficina(id, oficina.getId(), oficina.getNombre(), oficina.getDireccion());
    }
    @Query("{id: ?0}")
    @Update("{$push: {id: ?1, nombre: ?2, direccion: ?3}}")
    void insertarOficina(Integer id, Integer oficinaId, String oficinaNombre, String oficinaDireccion);
}
