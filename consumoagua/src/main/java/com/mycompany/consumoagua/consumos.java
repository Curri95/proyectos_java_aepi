package com.mycompany.consumoagua;

import java.util.Scanner;

public class consumos {

     public static void main(String[] args) {
           
        Scanner sc = new Scanner(System.in);
        System.out.println ("Introduzca su consumo de agua");
        float consumo = sc.nextFloat();
        
        if (consumo <= 100) {
            float factura = (float) (consumo * 0.15) ;
            System.out.println ("El coste de su consumo es: " + factura );
        }
        else if (consumo <= 500 ){
            float factura =   (float) ((100 * 0.15) + (consumo - 100)* 0.20);
            System.out.println ("El coste de su consumo es: " + factura );
        }    
        else if (consumo <= 1000){
            float factura =   (float) ((100 * 0.15) + (400 * 0.20) + (consumo - 500) * 0.35);
            System.out.println ("El coste de su consumo es: " + factura );
        }  
        else if (consumo > 1000 ){
            float factura =  (float) ((100 * 0.15) + (400 * 0.20) + (500 * 0.35) + (consumo - 1000) * 0.80);
            System.out.println ("El coste de su consumo es: " + factura );   
        }
     
    }
    
}