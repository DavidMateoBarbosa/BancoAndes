package uniandes.edu.co.application.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class Oficina {
    @Id
    private int id;
    private String nombre;
    private String direccion;
}
