package uniandes.edu.co.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document("puntos-atencion")
public class PuntoAtencion {
    @Id
    private Integer id;
    private String tipoPuntoAtencion;
    private String localizacion;
    private Integer idOficina;
}
