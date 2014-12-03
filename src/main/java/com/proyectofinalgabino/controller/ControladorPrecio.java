
package com.proyectofinalgabino.controller;

import com.proyectofinalgabino.model.DAOPrecioImpl;
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

public class ControladorPrecio {
    
   @RequestMapping(value = "/precio", method = RequestMethod.GET, headers = {"Accept=Application/json"})
   public @ResponseBody String todos() throws Exception{ //Preguntar al profesor
       DAOPrecioImpl pr = new DAOPrecioImpl();
       
       return pr.obtenerTodos();
   }
    
}
