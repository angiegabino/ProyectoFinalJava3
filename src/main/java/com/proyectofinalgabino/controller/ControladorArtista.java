
package com.proyectofinalgabino.controller;

import com.proyectofinalgabino.model.DAOArtistaImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")

public class ControladorArtista {
    
    @RequestMapping(value="/artista", method = RequestMethod.GET, headers = {"Accept=Application/json"})
    public @ResponseBody String artista() throws Exception{
        DAOArtistaImpl ar = new DAOArtistaImpl();
        
        String artista = ar.obtenerTodos();
        return artista;
    }
    
}
