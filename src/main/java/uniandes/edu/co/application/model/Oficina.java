package uniandes.edu.co.application.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Getter
@Setter
@Document("oficinas")
public class Oficina {
    private String nombre;
    private String direccion;
}
