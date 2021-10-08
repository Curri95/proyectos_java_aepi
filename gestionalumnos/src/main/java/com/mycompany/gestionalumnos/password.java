package com.mycompany.gestionalumnos;

import java.util.Random;

public class password {
    
    int length;
    
    public String generadorcontraseña(int length) {
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "1234567890";
        String combinedChars = mayusculas + minusculas + numeros;
        Random random = new Random();
        char[] contraseña = new char[length];

        contraseña[0] = minusculas.charAt(random.nextInt(minusculas.length()));
        contraseña[1] = mayusculas.charAt(random.nextInt(mayusculas.length()));
        contraseña[2] = numeros.charAt(random.nextInt(numeros.length()));
   
        for(int i = 3; i< length ; i++) {
            contraseña[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        
      return "Su contraseña es " + contraseña + " .";
    }

    public password() {
        this.length = 8;
    }
} 