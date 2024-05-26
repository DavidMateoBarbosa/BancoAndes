package uniandes.edu.co.application.model;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.swing.text.Document;
import java.time.LocalDateTime;
import java.util.Collection;

@Data
public class Cuenta {
    @Id
    private Integer id;
    private String tipoCuenta;
    private String estadoCuenta;
    private Document saldo;
    private LocalDateTime fechaUltimaTransaccion;
    private Collection<OperacionBancaria> operaciones;
}
