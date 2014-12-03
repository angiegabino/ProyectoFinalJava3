
package com.proyectofinalgabino.model;

import java.util.ArrayList;
import java.util.Collections;
//import static java.util.Collections.singletonMap;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.criterion.Order;
//import org.hibernate.criterion.Restrictions;


public class DAOArtistaImpl {
    
    public String obtenerTodos() throws Exception {
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
        Session sesion = factory.openSession();
        Transaction tranza = sesion.beginTransaction();
        
        Criteria cri = sesion.createCriteria(Artista.class);
        
        //buscar artistas por list
        ArrayList<Artista> artistas = (ArrayList<Artista>)cri.list();
        Map<String, ArrayList<Artista>> singletonMap = Collections.singletonMap("artista", artistas);
        ObjectMapper mapper = new ObjectMapper();
        
        tranza.commit();
        sesion.close();
        
        return mapper.writeValueAsString(singletonMap);
    }
    
}
