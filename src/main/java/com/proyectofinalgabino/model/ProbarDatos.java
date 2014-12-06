
package com.proyectofinalgabino.model;



public class ProbarDatos {

    public static void main (String args[]) throws Exception {
        DAOArtistaImpl d = new DAOArtistaImpl();
        System.out.println(d.obtenerTodos());
        
        DAOAlbumImpl du = new DAOAlbumImpl();
        System.out.println(du.obtenerTodos());
        
        DAOPrecioImpl duh = new DAOPrecioImpl();
        System.out.println(duh.obtenerTodos());
    }
}
