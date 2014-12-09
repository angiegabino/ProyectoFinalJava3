
package com.proyectofinalgabino.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

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
    
    public String obtenerId(Integer id) throws Exception{
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
        Session sesion = factory.openSession();
        Transaction tranza = sesion.beginTransaction();
        
        Criteria cri = sesion.createCriteria(Precio.class).add(Restrictions.idEq(id));
        Precio precio = (Precio)cri.uniqueResult();
    
        ObjectMapper mapper = new ObjectMapper();
        tranza.commit();
        sesion.close();
        
        return mapper.writeValueAsString(precio);
        
    }
        
}


