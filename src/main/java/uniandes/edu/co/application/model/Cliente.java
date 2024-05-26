package uniandes.edu.co.application.model;




import org.springframework.data.mongodb.core.mapping.Document;


import lombok.Getter;

import lombok.Setter;

@Document("Cliente")
@Getter
@Setter

public class Cliente {
    private String Tipo_Persona;
    private String Nombre;
    private Integer Cedula;
    public Cliente(String Tipo_Persona,String Nombre,Integer Cedula)
    {
        super();
        this.Tipo_Persona=Tipo_Persona;
        this.Nombre=Nombre;
        this.Cedula=Cedula;
    }
    

}
