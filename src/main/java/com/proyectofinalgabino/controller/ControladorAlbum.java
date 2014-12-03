
package com.proyectofinalgabino.controller;

import com.proyectofinalgabino.model.DAOAlbumImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")

public class ControladorAlbum {
    
    @RequestMapping(value = "/album", method = RequestMethod.GET, headers = {"Accept=Application/jason"})
    public @ResponseBody String todos() throws Exception{ //Preguntar al profe
        DAOAlbumImpl al = new DAOAlbumImpl();
        
        return al.obtenerTodos();
    }
    
}
