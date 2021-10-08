package proyectofinal.gestionacademia;

import java.io.IOException;
import java.util.Scanner;

public class academia {
  
    public static void main(String[] args) throws IOException {
    
        Scanner sc = new Scanner(System.in);
        
        opcionesmenu misopciones = new opcionesmenu();
        misopciones.cargararchivo();
        
        System.out.println ("Bienvenido al sistema de administración del alumnado, por favor indique su grado.");
        System.out.println ("1.- Soy un Administrador.");
        System.out.println ("2.- Soy un Alumno.");
        System.out.println ("3.- Cerrar el Sistema.");
        System.out.println ("Introduzca una opción: ");
        short opcionElegida = Short.parseShort(sc.nextLine());

        String nombre, clase, asistencia;
        Float nota1, nota2, nota3;
            
        while (true) {
            switch (opcionElegida) {
                
                case 1 -> {
                    System.out.println ("");
                    System.out.println ("Bienvenido Administrador, ¿qué desea hacer?");
                    System.out.println ("1.- Crear datos de un alumno nuevo.");
                    System.out.println ("2.- Modificar los datos de un alumno.");
                    System.out.println ("3.- Ver la media de las notas de una clase.");
                    System.out.println ("4.- Ver la media de las notas de un alumno.");
                    System.out.println ("5.- Buscar los datos de un alumno.");
                    System.out.println ("6.- Eliminar un alumno de la base de datos.");
                    System.out.println ("7.- Mostrar los datos de todos los alumnos.");
                    System.out.println ("8.- Salir de la aplicación.");
                    System.out.println ("");
                    short opcionadmin = Short.parseShort(sc.nextLine());
                    
                    switch (opcionadmin){
                        case 1 -> {
                            System.out.println ("");
                            System.out.println ("Se va a a proceder a crear un alumno.");
                            System.out.println ("Diga el nombre del estudiante:");
                            nombre = sc.nextLine();
                            System.out.println ("Diga la clase del estudiante:");
                            clase = sc.nextLine();
                            System.out.println ("Diga el porcentaje de asistencia del alumno:");
                            asistencia = sc.nextLine();
                            System.out.println ("Diga la primera nota del alumno:");
                            nota1 = Float.parseFloat(sc.nextLine());
                            System.out.println ("Diga la segunda nota del alumno:");
                            nota2 = Float.parseFloat(sc.nextLine());
                            System.out.println ("Diga la tercera nota del alumno:");
                            nota3 = Float.parseFloat(sc.nextLine());
                            System.out.println (misopciones.crearestudiante(nombre, clase, asistencia, nota1, nota2, nota3));
                            misopciones.guardararchivo();
                            System.out.println ("");
                        }
                            
                        case 2 -> {
                            System.out.println ("");
                            System.out.println ("Introduzca el nombre del alumno cuyos datos quiera modificar");
                            nombre = sc.nextLine();
                            System.out.println ("Diga una nueva clase:");
                            clase = sc.nextLine();
                            System.out.println ("Diga el porcentaje de asistencia nuevo:");
                            asistencia = sc.nextLine();
                            System.out.println ("Diga la nueva primera nota del alumno:");
                            nota1 = Float.parseFloat(sc.nextLine());
                            System.out.println ("Diga la nueva segunda nota del alumno:");
                            nota2 = Float.parseFloat(sc.nextLine());
                            System.out.println ("Diga la nueva tercera nota del alumno:");
                            nota3 = Float.parseFloat(sc.nextLine());
                            System.out.println (misopciones.ModificarAlumno(nombre,clase,asistencia, nota1, nota2, nota3));
                            System.out.println ("");
                        }
                        
                        case 3 -> {
                            System.out.println ("");
                            System.out.println ("Introduzca el nombre de la clase cuya media quiera saber:");
                            clase = sc.nextLine();
                            System.out.println (misopciones.mostrarmediaclase(clase));
                            System.out.println ("");
                        }
                        
                        case 4 -> {
                            System.out.println ("");
                            System.out.println ("Introduzca el nombre del alumno cuya media quiera saber:");
                            nombre = sc.nextLine();
                            System.out.println (misopciones.mostrarmediaalumno(nombre));
                            System.out.println ("");
                        }
                        
                        case 5 -> {
                            System.out.println ("");
                            System.out.println ("Introduzca el nombre del alumno cuyos datos quiera saber:");
                            nombre = sc.nextLine();
                            System.out.println (misopciones.buscarestudiante(nombre));
                            System.out.println ("");
                        }
                        case 6 -> {
                            System.out.println ("");
                            System.out.println ("Introduzca el nombre del alumno desee eliminar:");
                            nombre = sc.nextLine();
                            System.out.println (misopciones.eliminarestudiante(nombre));
                            System.out.println ("");
                        }
                        
                        case 7 -> {
                            System.out.println(misopciones.mostraralumnos());
                            System.out.println(""); 
                            System.out.println(misopciones.listapararchivo());
                            System.out.println(""); 
 
                        }
                            
                        default -> {
                            System.out.println ("");
                            System.out.println ("Adiós, gracias por usarme.");
                            System.exit(0);
                        }     
                    }
                }
                    
                case 2 -> {
                    System.out.println ("");
                    System.out.println ("Bienvenido, alumno.");
                    System.out.println ("Por favor, elige qué quieres hacer.");
                    System.out.println ("1.- Ver mis datos.");
                    System.out.println ("2.- Salir del sistema.");
                    short opcionalumno = Short.parseShort(sc.nextLine());
                    
                    
                    if(opcionalumno == 1){
                        System.out.println ("");
                        System.out.println ("Por favor, dime tu nombre.");
                        nombre = sc.nextLine();
                        System.out.println(misopciones.mostrardatosalumno(nombre));
                    }
                    else {
                        System.out.println("");
                        System.out.println("Adiós, gracias por usarme.");
                        System.exit(0);
                    }
                }
                    
                default -> {
                    System.out.println("");
                    System.out.println("Adiós, gracias por usarme.");
                    System.exit(0);
                }
            }   
        }
    }
}   