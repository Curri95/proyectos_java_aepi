package com.mycompany.gestionclinica;

import java.util.Scanner;

public class gestionmedica {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);   
        Clinica miclinica = new Clinica();
    
        while (true) {
            
            System.out.println("Bienvenidx al Sistema de Gestión de Pacientes. ");
            System.out.println("1.- Agregar a un paciente la base de datos.");
            System.out.println("2.- Buscar a un paciente en la base de datos.");
            System.out.println("3.- Consultar el IMC de un paciente.");
            System.out.println("4.- Consultar si un paciente es mayor de edad.");
            System.out.println("5.- Mostrar todos los datos de todos los pacientes.");
            System.out.println("6.- Cerrar el Sistema.");
            System.out.println("Introduzca una opción: ");
            short opcionElegida = Short.parseShort(sc.nextLine());
        
            String nombre;
            byte edad;
            String dni;
            String sexo;
            short peso;
            double altura;
  
            switch (opcionElegida) {
                
                case 1:
                    System.out.println("Va a agregar los datos de un paciente.");
                    System.out.println("Introduzca el nombre del paciente: ");
                    nombre = sc.nextLine();
                    System.out.println("Introduzca la edad del paciente en años: ");
                    edad = Byte.parseByte(sc.nextLine());
                    System.out.println("Introduzca el DNI del paciente: ");
                    dni = sc.nextLine();
                    System.out.println("Introduzca el sexo del paciente: ");
                    sexo = sc.nextLine();
                    System.out.println("Introduzca el peso del paciente en kilogramos: ");
                    peso = Short.parseShort(sc.nextLine());
                    System.out.println("Introduzca la altura del paciente en metros: ");
                    altura = Double.parseDouble(sc.nextLine());
                    System.out.println(""); 
                    System.out.println (miclinica.agregarpaciente(nombre,edad,dni,sexo,peso,altura));
                    break;
                    
                case 2:
                    System.out.println("Introduzca el nombre del paciente que quieras buscar:");
                    nombre = sc.nextLine();
                    System.out.println(miclinica.comprobarpaciente(nombre));
                    System.out.println(""); 
                    break;
                    
                case 3:
                    System.out.println("Introduzca el nombre del paciente cuyo IMC quiera calcular:");
                    nombre = sc.nextLine();
                    System.out.println(miclinica.comprobarIMC(nombre));
                    System.out.println(""); 
                    break;
                    
                case 4:
                    System.out.println("Introduzca el nombre del paciente cuya edad quiera saber:");
                    nombre = sc.nextLine();
                    System.out.println(miclinica.esmayoredad(nombre));
                    System.out.println(""); 
                    break;
                    
                case 5:
                    System.out.println(miclinica.mostrartodos());
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