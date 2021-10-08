package com.mycompany.caesar;

import java.util.Scanner; 

public class cesar {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un texto: ");
        String textousuario= sc.nextLine().toUpperCase();
        
        String textocifrado = "";
        byte desplazamiento = 6;
        String abecedario = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        
        for (char letra : textousuario.toCharArray()){
            byte posicion = (byte)abecedario.indexOf(letra);
            
            if(posicion == -1){
               textocifrado += letra;
            } else {
                    byte nuevaposicion = (byte)(posicion + desplazamiento);
                    
                    while(nuevaposicion >= abecedario.length())
                        nuevaposicion = (byte)(nuevaposicion - abecedario.length()  );
                    
                    textocifrado += abecedario.charAt(nuevaposicion);
                     }   
        }        
  
            System.out.println(textocifrado);
    }
    
    }