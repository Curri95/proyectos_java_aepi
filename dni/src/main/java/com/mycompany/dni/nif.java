package com.mycompany.dni;

import java.util.Scanner;

public class nif {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime el número del DNI:  ");
        double numero = sc.nextInt();
        
        for (int i = 0; i < 1; i++)
            dnivalido (numero);
        
}
     
    
    
    private static void dnivalido (double numero ){
    double resto = numero % 23;
    char [] letras = { 'T', 'R', 'W', 'A','G','M','Y','F','P','D','X','B', 'N','J','Z','S','Q','V','H','L','C','K','E' };
    double [] numeros = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
    
    char[] chars;
        chars = letras.toCharArray();
        String str = "";
                for (int i = 0; i < chars.length; i++){
                for (int j = 0; j < letras.length; j++){

                    if (letras[j] == chars[i]){
                        str = str + numeros[j] + " ";  
    
}
}
                }
    }
}