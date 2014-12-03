
package com.proyectofinalgabino.model;



public class ProbarDatos {

    public static void main (String args[]) throws Exception {
        DAOArtistaImpl d = new DAOArtistaImpl();
        System.out.println(d.obtenerTodos());
    }
}
