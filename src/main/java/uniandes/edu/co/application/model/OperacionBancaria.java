package uniandes.edu.co.application.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
public class OperacionBancaria {
    @Id
    private String id;
    private String tipoOperacion;
    private LocalDateTime fecha;
    private Integer puntoAtencionID;
}
