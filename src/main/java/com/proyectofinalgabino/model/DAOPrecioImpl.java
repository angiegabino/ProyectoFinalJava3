
package com.proyectofinalgabino.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class DAOPrecioImpl {

    public String obtenerTodos() throws Exception{
        
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
        Session sesion = factory.openSession();
        Transaction tranza = sesion.beginTransaction();
        
        Criteria cri = sesion.createCriteria(Precio.class);
        ArrayList<Precio> artistas = (ArrayList<Precio>)cri.list();
        
        ObjectMapper mapper = new ObjectMapper();
        Map<String, ArrayList<Precio>> singletonMap = Collections.singletonMap("precio", artistas);
        
        tranza.commit();
        sesion.close();
        System.out.println(mapper.writeValueAsString(singletonMap));
        return mapper.writeValueAsString(singletonMap);
        
    }
    
    
        
}


