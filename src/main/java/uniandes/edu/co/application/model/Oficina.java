package uniandes.edu.co.application.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Collection;

@Data
public class Oficina {
    @Id
    private int id;
    private String nombre;
    private String direccion;
    private Collection<Integer> puntosAtencionID;
}
