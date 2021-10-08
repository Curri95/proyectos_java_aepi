
package com.mycompany.aleatorios;

import java.util.Random;
        
public class aleatorio {

    public static void main(String[] args) {
       
        Random rnd = new Random();
        byte [][] tabla = new byte [6][6];
       
        for(int j= 0; j < tabla.length; j++){
        
            byte [] filaTMP = new byte [6];
        
            for (int i = 0; i < filaTMP.length; i++){
             byte numeroaleatorio = (byte)(rnd.nextInt(89)+10);
            filaTMP [i] = numeroaleatorio;
            }
            tabla[j] = filaTMP;
              }
       
        for (byte[] fila: tabla) {
            for (byte valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
    }
    
}
}
