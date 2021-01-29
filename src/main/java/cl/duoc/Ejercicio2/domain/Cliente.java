
package cl.duoc.Ejercicio2.domain;

import lombok.Data;

@Data
public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private String direccion;
    private int edad;
}
