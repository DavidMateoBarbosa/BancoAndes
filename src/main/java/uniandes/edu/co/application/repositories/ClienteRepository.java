package uniandes.edu.co.application.repositories;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.Update;

import uniandes.edu.co.application.model.Cliente;

public interface ClienteRepository  extends MongoRepository<Cliente, Integer>{
    //Buscar cliente por id
    @Query("{id:'?0'}")
    Cliente buscarClienteId(Integer id);

    //Buscar todos los clientes
    @Query("{}")
    List<Cliente> buscarTodos();

    //Actualizar el cliente
    @Query("{id:'?0'}")
    @Update("{tipoPersona: ?1, nombre: ?2, cedula: ?3}")
    void actualizarCliente(Integer id, String tipoPersona, String nombre, String cedula);

    //Crear cuenta para un cliente
    @Query("{id: ?0}")
    @Update("{$push:{cuentas:{id:?1, tipoCuenta:?2, estadoCuenta:?3, saldo:?4, fechaUltimaTransaccion:?5}}}")
    void aniadirBebidaABar(Integer id, Integer id1, String tipoCuenta,String estadoCuenta, Integer saldo, LocalDateTime horafechaUltimaTransaccionrio);

    //Crear una operacion sobre una cuenta
    @Query("{id: ?0, 'cuentas.id': ?1}")
    @Update("{$push: {operaciones:{'tipoOperacion': ?2, 'fecha': ?3,'puntoAtencionID': ?4}}}")
    void aniadirOperacionACuenta(Integer id0, Integer id1, String tipoOperacion, LocalDateTime fecha, Integer puntoAtencionID);

    //Cambiar el estado de una cuenta
    @Query("{id: ?0, 'cuentas.id': ?1}")
    @Update("{$set: {'cuentas.$.estadoCuenta': ?2}}")
    void actualizarEstadoCuenta(String clienteId, String cuentaId, String nuevoEstado);
}