
package cl.duoc.Ejercicio2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import cl.duoc.Ejercicio2.domain.Cliente;

@Controller
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(Model modelo){
        
        Cliente c = new Cliente();       
        c.setNombre("Leslie");
        c.setApellido("Aguayo");
        c.setEmail("les.aguayod@gmail.com");
        c.setDireccion("Cochrane 1164");
        c.setEdad(33);
                
        modelo.addAttribute("c", c);
        
        return "index";
    }
    
}
