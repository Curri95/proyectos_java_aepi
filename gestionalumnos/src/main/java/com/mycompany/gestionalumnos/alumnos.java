package com.mycompany.gestionalumnos;

public class alumnos {
    
    public String nombre;
    public byte edad;
    public String dni;
    public String clase;
    public String email;
    
    public alumnos(String nombre, byte edad, String dni, String clase, String email) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.clase = clase;
        this.email = email;  
    }
    
    @Override
    
    public String toString(){
            return "El alumno se llama " + this.nombre + ", su edad es de " + this.edad + " años, DNI " + this.dni
                    + "." + "Atiende la clase de " + this.clase + ", y su email de contacto es " + this.email + "." ;
    }   
}