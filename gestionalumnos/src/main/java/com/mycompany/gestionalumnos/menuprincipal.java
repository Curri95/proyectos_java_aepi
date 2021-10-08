package com.mycompany.gestionalumnos;

import java.io.IOException;
import java.util.Scanner;

public class menuprincipal {

   public static void main(String[] args) throws IOException {
       
        Scanner sc = new Scanner(System.in);   
        academia nuestraacademia = new academia();
        password tucontraseña = new password();
        
        while (true) {
            
            System.out.println("Bienvenidx al Sistema de Gestión de Alumnxos. ");
            System.out.println("1.- Agregar a un alumnx la base de datos.");
            System.out.println("2.- Buscar a un alumnx en la base de datos.");
            System.out.println("3.- Modificar los datos de un alumnx en la base de datos .");
            System.out.println("4.- Eliminar a un alumnx de la base de datos.");
            System.out.println("5.- Mostrar los datos de lxs alumnxs.");
            System.out.println("6.- Cerrar el Sistema.");
            System.out.println("Introduzca una opción: ");
            short opcionElegida = Short.parseShort(sc.nextLine());
        
            String nombre;
            byte edad;
            String dni;
            String clase;
            String email;
  
            switch (opcionElegida) {
                
                case 1:
                    System.out.println("Se van a agregar los datos de un alumno.");
                    System.out.println("Introduzca el nombre del alumno: ");
                    nombre = sc.nextLine();
                    System.out.println("Introduzca la edad del alumno en años: ");
                    edad = Byte.parseByte(sc.nextLine());
                    System.out.println("Introduzca el DNI del alumno: ");
                    dni = sc.nextLine();
                    System.out.println("Introduzca la clase a la cual atiende el alumno: ");
                    clase = sc.nextLine();
                    System.out.println("Introduzca el email del alumno: ");
                    email = sc.nextLine();
                    System.out.println(""); 
                    System.out.println (nuestraacademia.agregaralumno(nombre,edad,dni,clase,email));
                    System.out.println(tucontraseña.generadorcontraseña(8));
                    System.out.println(""); 
                    break;
                    
                case 2:
                    System.out.println("Introduzca el nombre del alumno que quiera saber:");
                    nombre = sc.nextLine();
                    System.out.println(nuestraacademia.buscaralumno(nombre));
                    System.out.println(""); 
                    break;
                    
                case 3:
                    System.out.println("Introduzca el nombre del alumno cuyos datos quiera modificar");
                    nombre = sc.nextLine();
                    System.out.println(nuestraacademia.modificardatos(nombre));
                    System.out.println(""); 
                    break;
   
                case 4:
                    System.out.println("Introduzca el nombre del alumno desee eliminar:");
                    nombre = sc.nextLine();
                    System.out.println(nuestraacademia.eliminaralumno(nombre));
                    System.out.println(""); 
                    break;
                    
                case 5: 
                    System.out.println(nuestraacademia.mostraralumnos());
                    System.out.println(""); 
                    System.out.println(nuestraacademia.listapararchivo());
                    System.out.println(""); 
                    break;
                    
                default:
                    System.out.println("Adiós, gracias por usarme.");
                    System.exit(0);
                    break;
            }   
        }
    }
}   