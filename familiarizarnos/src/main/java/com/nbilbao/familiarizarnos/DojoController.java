package com.nbilbao.familiarizarnos;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

    @RequestMapping("/{ruta}")
    public String principal(@PathVariable("ruta") String ruta){
        if(ruta.equals("dojo")){
            return "¡El Dojo es increíble!";
        }
        else if(ruta.equals("burbank-dojo")){
            return "El Dojo Burbank está localizado al sur de California";
        }
        else if(ruta.equals("san-jose")){
            return "El Dojo SJ es el cuartel general";
        }

        else{
            return "Ruta inválida!";
        }
    }

}
