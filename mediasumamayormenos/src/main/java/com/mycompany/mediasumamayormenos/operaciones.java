package com.mycompany.mediasumamayormenos;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class operaciones {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 10 números: ");
        System.out.println("Dime el primer número: ");
        int primero = sc.nextInt();        
        System.out.println("Dime el segundo número: ");
        int segundo= sc.nextInt(); 
        System.out.println("Dime el tercer número: ");
        int tercero = sc.nextInt(); 
        System.out.println("Dime el cuarto número: ");
        int cuarto = sc.nextInt(); 
        System.out.println("Dime el quinto número: ");
        int quinto = sc.nextInt(); 
        System.out.println("Dime el sexto número: ");
        int sexto = sc.nextInt(); 
        System.out.println("Dime el séptimo número: ");
        int septimo = sc.nextInt(); 
        System.out.println("Dime el octavo número: ");
        int octavo = sc.nextInt(); 
        System.out.println("Dime el noveno número: ");
        int noveno = sc.nextInt(); 
        System.out.println("Dime el décimo número: ");
        int decimo = sc.nextInt();       
        
        for (int i = 0; i < 1; i++)
            medianum (primero, segundo, tercero, cuarto, quinto, sexto, septimo, octavo, noveno, decimo);
            sumanum (primero, segundo, tercero, cuarto, quinto, sexto, septimo, octavo, noveno, decimo);
            mayornum (primero, segundo, tercero, cuarto, quinto, sexto, septimo, octavo, noveno, decimo);
            menornum (primero, segundo, tercero, cuarto, quinto, sexto, septimo, octavo, noveno, decimo);
        
}
    
    
    
     public static void medianum(double primero, double segundo, double tercero, double cuarto, double quinto, double sexto, double septimo, double octavo, double noveno, double decimo){
         double media = (primero + segundo + tercero + cuarto + quinto + sexto + septimo + octavo + noveno + decimo)/10;
         System.out.println("La media de los números es: " + media) ;
         }
     
     
     public static void sumanum(double primero, double segundo, double tercero, double cuarto, double quinto, double sexto, double septimo, double octavo, double noveno, double decimo){
         double suma = primero + segundo + tercero + cuarto + quinto + sexto + septimo + octavo + noveno + decimo;
         System.out.println("La suma de los números es: " + suma) ;
         }
     
     
     public static void mayornum(double primero, double segundo, double tercero, double cuarto, double quinto, double sexto, double septimo, double octavo, double noveno, double decimo){
         List<Double> items = Arrays.asList(primero, segundo, tercero, cuarto, quinto, sexto, septimo, octavo, noveno, decimo); 
         double max = items.stream().max(Comparator.naturalOrder()).get();
            System.out.println("El mayor número es: " +  max);
 
         }
     
     
     public static void menornum(double primero, double segundo, double tercero, double cuarto, double quinto, double sexto, double septimo, double octavo, double noveno, double decimo){
        List<Double> items = Arrays.asList(primero, segundo, tercero, cuarto, quinto, sexto, septimo, octavo, noveno, decimo); 
         double min = items.stream().min(Comparator.naturalOrder()).get();
         System.out.println("El número menor es: " + min) ;
         
         }
     
}
     
