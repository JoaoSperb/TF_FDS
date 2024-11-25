package trabalhofinal.joaogsperb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class Controller {
    @GetMapping("/servcad")
    @CrossOrigin(origins = "*")
    public String welcomeMessage(){
        return("Bem vindo ao sistema.");
    }
     

    

    
}