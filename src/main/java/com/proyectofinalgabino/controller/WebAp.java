
package com.proyectofinalgabino.controller;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAp extends AbstractAnnotationConfigDispatcherServletInitializer {
    
    @Override 
    protected Class<?>[] getRootConfigClasses() {
            System.out.println("Cargando configuracion de clases config !!");
            return new Class<?>[0];
            }

    @Override
        protected Class<?>[] getServletConfigClasses() {
        System.out.println("Cargando configuracion de Servlets !!");
        return new Class<?>[]{WebApConfig.class};
        }

    @Override
        protected String[] getServletMappings() {
        System.out.println("Cargando configuracion de servicios!!");
        return new String[]{"/servicios/*"};
        }
}
