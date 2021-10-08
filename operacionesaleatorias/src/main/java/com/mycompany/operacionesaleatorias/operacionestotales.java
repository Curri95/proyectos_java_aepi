package com.mycompany.operacionesaleatorias;

import java.util.Random;
import java.util.Scanner;

public class operacionestotales {

    public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
               
        switch(rnd.nextInt(4)+1)
            {
            case 1 -> {
                int numeroaleatorioA = rnd.nextInt(9) + 1;
                int numeroaleatorioB = rnd.nextInt(9) + 1;
                int resultadojugadorA = 0;
                int sum = (int) numeroaleatorioA + numeroaleatorioB;
                
                System.out.println("¿Cuál es el resultado de " + numeroaleatorioA + "+" + numeroaleatorioB + "?");
                System.out.println("Dime tu respuesta: ");
                resultadojugadorA = sc.nextInt();
                
                if ( sum == resultadojugadorA)
                System.out.println("¡Has acertado!");
                else
                System.out.println("¡Has fallado! El número era " + sum  + ".");
                }
            
            case 2 -> {
                int numeroaleatorioA = rnd.nextInt(9) + 1;
                int numeroaleatorioB = rnd.nextInt(9) + 1;
                int resultadojugadorB = 0;
                int diff = (int) numeroaleatorioA - numeroaleatorioB;
                
                System.out.println("¿Cuál es el resultado de " + numeroaleatorioA + "-" + numeroaleatorioB + "?");
                System.out.println("Dime tu respuesta: ");
                resultadojugadorB = sc.nextInt();
                
                if ( diff == resultadojugadorB)
                System.out.println("¡Has acertado!");
                else
                System.out.println("¡Has fallado! El número era " + diff  + ".");
                }
            
            case 3 -> {
                int numeroaleatorioA = rnd.nextInt(9) + 1;
                int numeroaleatorioB = rnd.nextInt(9) + 1;
                int resultadojugadorA = 0;
                int prod = (int) numeroaleatorioA * numeroaleatorioB;
                
                System.out.println("¿Cuál es el resultado de " + numeroaleatorioA + "*" + numeroaleatorioB + "?");
                System.out.println("Dime tu respuesta: ");
                resultadojugadorA = sc.nextInt();
                
                if ( prod == resultadojugadorA)
                System.out.println("¡Has acertado!");
                else
                System.out.println("¡Has fallado! El número era " + prod  + ".");
                }
            
            case 4 -> {
                double numeroaleatorioA = rnd.nextInt(9) + 1;
                double numeroaleatorioB = rnd.nextInt(9) + 1;
                double resultadojugadorD = 0;
                double division = (double) numeroaleatorioA / numeroaleatorioB;
                
                System.out.println("¿Cuál es el resultado de " + numeroaleatorioA + "/" + numeroaleatorioB + "?");
                System.out.println("Dime tu respuesta: ");
                resultadojugadorD = sc.nextDouble();
                
                if ( division == resultadojugadorD)
                System.out.println("¡Has acertado!");
                else
                System.out.println("¡Has fallado! El número era " + division  + ".");
                }
            }
        
    }   
}