package com.mycompany.calculoareas;

import java.util.Scanner;

public class areas {

    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int opcionElegida = 0;
        
    while (opcionElegida != 4) {
        System.out.println("Elige lo que quieres hacer: ");
        System.out.println("1.- Calcular área de un circulo.");
        System.out.println("2.- Calcular área de un cuadrado.");
        System.out.println("3.- Calcular área de un rectángulo.");
        System.out.println("4.- Calcular área de un triángulo.");
        opcionElegida = sc.nextInt();

        switch(opcionElegida) {
            case 1: 
                System.out.println("Dime el radio: ");
                double radio= sc.nextDouble(); 
                double pi = 3.14159265;
                areacirculo(radio,pi);
             break;
                
            case 2:
                System.out.println("Dime la longitud de los lados: ");
                double lado= sc.nextDouble();
                areacuadrado(lado);
            break;
            
            case 3: 
                System.out.println("Dime la base: ");
                double base= sc.nextDouble();
                System.out.println("Dime la altura: ");
                double altura= sc.nextDouble(); 
                arearectangulo(base,altura);
             break;  
             
            case 4: 
                System.out.println("Dime la base: ");
                double baset= sc.nextDouble();
                System.out.println("Dime la altura: ");
                double alturat= sc.nextDouble();  
                areatriangulo(baset,alturat);
             break;  
             
            default:
                System.out.println("Elige una opción, por favor.");
            }    
        }
    }
    
    public static void areacirculo(double radio, double pi) {
        double area= pi * radio * radio;
        System.out.println("El área del círculo es " + area); 
}

    
    public static void areacuadrado(double lado){ 
        double area = lado * lado;
        System.out.println("El área del cuadrado es " + area); 
    }
    
    
    public static void arearectangulo(double altura, double base){
        double area= altura * base;
        System.out.println("El área del rectangulo es " + area); 
    }
    
    
    public static void areatriangulo(double baset, double alturat){
        double area= (baset * alturat)/2;
        System.out.println("El área del triángulo es " + area); 
    }        
            
}