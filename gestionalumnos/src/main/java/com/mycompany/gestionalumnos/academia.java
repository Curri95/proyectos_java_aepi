package com.mycompany.gestionalumnos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class academia {
 
    private ArrayList<alumnos> listadealumnos = new ArrayList<alumnos>();
    
    
    public String agregaralumno(String nombre, byte edad, String dni, String clase, String email) {
        alumnos nuevoalumno = new alumnos(nombre, edad, dni, clase, email);
        listadealumnos.add(nuevoalumno);
        return "Se ha agregado correctamente al alumnx." ;
    }
    
    public String buscaralumno (String nombre){
        for (alumnos alumno : listadealumnos){
            if (alumno.nombre.equals(nombre)) {
                return "Se ha encontrado un alumnx con ese nombre.";
            }
        }
        return "No se ha encontrado ningún alumnx con ese nombre.";    
    }
    
    public String modificardatos (String nombre){
         for (alumnos alumno : listadealumnos){
            if (alumno.nombre.equals(nombre)) {
                return "Se han modificado los datos de" + nombre + "correctamente.";
             }    
        }
        return "No se ha encontrado ningún alumnx con ese nombre.";    
    }
    
    public String eliminaralumno (String nombre){
        for (alumnos alumno : listadealumnos){
            if (alumno.nombre.equals(nombre)) {
               listadealumnos.remove(nombre); 
                return "Se ha eliminado al alumnx con éxito.";
            }
        }
        return "No se ha encontrado ningún alumnx con ese nombre.";    
    }
   
    public String mostraralumnos() {
        String salida = "";
        for (alumnos alumno : listadealumnos) {
            salida += alumno.toString() + "\n";
        }
        return salida;
    }
    
    public String listapararchivo() throws IOException{
        FileWriter writer = new FileWriter("alumnos.txt"); 
        for(alumnos str: listadealumnos) {
        writer.write(str + System.lineSeparator());
        }
        writer.close();
        
        return "Se ha creado correctamente un archivo con los datos de los alumnos";
    }
    
    
    
    
    
} 