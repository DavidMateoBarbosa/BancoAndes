package uniandes.edu.co.application.model;

import com.mongodb.lang.Nullable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document("empleados")
public class Empleado {
    private String tipoPersona;
    private String nombre;
    private String cedula;
    private String tipoEmpleado;
    private Oficina oficina;
}
