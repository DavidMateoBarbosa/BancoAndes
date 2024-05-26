package uniandes.edu.co.application.model;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document("Operacion_Bancaria")
@Getter
@Setter

public class Operacion_Bancaria {
    
    private String tipo_operacion;
    private LocalDateTime fecha;
    private Cuenta cuenta;
    public Operacion_Bancaria(String tipo_operacion,LocalDateTime fecha,Cuenta cuenta)
    {
        super();
        this.tipo_operacion=tipo_operacion;
        this.fecha=fecha;
        this.cuenta=cuenta;
    }

    
}
