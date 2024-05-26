package uniandes.edu.co.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("empleados")
public class Empleado {
    @Id
    private Integer id;
    private String tipoPersona;
    private String nombre;
    private String cedula;
    private String tipoEmpleado;
    private Collection<Oficina> oficinas;
}
