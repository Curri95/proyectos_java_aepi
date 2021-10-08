package com.mycompany.codigomorse;

import java.util.Scanner;


public class morse {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        char [] castellano = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                  'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
                  'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                  ',', '.', '?' };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                ".---", "-.-", ".-..", "--", "-.","--.--", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };	
 
        System.out.println("Introduce un texto: ");
        String textousuario= sc.nextLine().toLowerCase();
  
  
        char[] chars = textousuario.toCharArray();

        String str = "";
                for (int i = 0; i < chars.length; i++){
                for (int j = 0; j < castellano.length; j++){

                    if (castellano[j] == chars[i]){
                        str = str + morse[j] + " ";  
            }
        }
    }
    System.out.println(str);
} 
}