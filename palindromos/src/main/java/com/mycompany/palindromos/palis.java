package com.mycompany.palindromos;

import java.util.Scanner;

public class palis {

    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);   
        
      String original, alreves = "";
      
      System.out.println("Dime un texto: ");  
      original = sc.nextLine();   
      
      
      int length = original.length();   
      for ( int i = length - 1; i >= 0; i-- )  
         alreves = alreves + original.charAt(i);  
      
      if (original.equals(alreves))  
         System.out.println("El texto introducido es un palíndromo.");  
      else  
         System.out.println("El texto introducido no es un palíndromo.");   
        
    }
    
}
