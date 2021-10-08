
package com.mycompany.ejercicioclase1;


public class ejercicio {
    
    public static void main(String[] args) {
        
        int[][] ceros = { 
            { 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 0 }, 
            { 0, 0, 0, 0, 0, 0 }
        };

        for (int i = 0; i < ceros.length; i++) {
            for (int j = 0; j < ceros[i].length; j++) {
                System.out.print(ceros[i][j]+ " ");
            }
            System.out.println();
    }
}
}