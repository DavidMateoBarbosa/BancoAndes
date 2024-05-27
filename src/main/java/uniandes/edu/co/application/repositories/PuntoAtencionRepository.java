package uniandes.edu.co.application.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import uniandes.edu.co.application.model.PuntoAtencion;

import java.util.Collection;

public interface PuntoAtencionRepository extends MongoRepository<PuntoAtencion, Integer> {
    @Query("{id: ?0}")
    PuntoAtencion encontrar(Integer id);
    @Query("{}")
    Collection<PuntoAtencion> encontrar();

    default void crear(PuntoAtencion puntoAtencion) {
        save(puntoAtencion);
    }
    default void crear(Integer id, String tipoPuntoAtencion, String localizacion) {
        crear(id, tipoPuntoAtencion, localizacion, null);
    }
    default void crear(Integer id, String tipoPuntoAtencion, String localizacion, Integer idOficina) {
        save(new PuntoAtencion(id, tipoPuntoAtencion, localizacion, idOficina));
    }


}
