package uniandes.edu.co.application.model;

import java.time.LocalDateTime;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document("Cuenta")
@Getter
@Setter
public class Cuenta {
    
    private String tipo_Cuenta;
    private String estado_Cuenta;
    private Integer saldo;
    private LocalDateTime fechaUltimaTransaccion;
    private Cliente cliente;
    public Cuenta( String tipo_Cuenta,String estado_Cuenta,Integer saldo,LocalDateTime fechaUltimaTransaccion, Cliente cliente)
    {
        super();
        this.tipo_Cuenta=tipo_Cuenta;
        this.estado_Cuenta=estado_Cuenta;
        this.saldo=saldo;
        this.fechaUltimaTransaccion=fechaUltimaTransaccion;
        this.cliente=cliente;
    }

    
    
}
