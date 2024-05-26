package uniandes.edu.co.application.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Data
@Getter
@Setter
@Document("puntos-atencion")
public class PuntoAtencion {
    private String tipoAtencion;
    private String direccion;
    private Collection<Empleado> empleados;
}
