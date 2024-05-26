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
@Document("clientes")
public class Cliente {
    @Id
    private Integer id;
    private String tipoPersona;
    private String nombre;
    private String cedula;
    private Collection<Cuenta> cuentas;
}
