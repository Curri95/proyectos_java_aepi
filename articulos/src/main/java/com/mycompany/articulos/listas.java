
package com.mycompany.articulos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class listas {

    public static void main(String[] args) {
         
    HashMap<String,Float> listaarticulos = new HashMap<String,Float>();
    Scanner sc = new Scanner(System.in);
    int opcionElegida = 0;
    float precio;
    String nombre;

    while (opcionElegida != 3) {
        System.out.println("Elige lo que quieres hacer: ");
        System.out.println("1.- Agregar artículo.");
        System.out.println("2.- Mostrar todos los artículos.");
        System.out.println("3.- Eliminar artículos.");
        opcionElegida = sc.nextInt();

        switch (opcionElegida) {
            case 1:
                System.out.println("Introduce el nombre del artículo: ");
                nombre = sc.next();
                System.out.println("Introduce el precio del artículo: ");
                precio = sc.nextFloat();
                guardararticulo(nombre, precio, listaarticulos);
                break;
            case 2:
                mostrararticulos(listaarticulos);
                break;
            case 3:
                System.out.println("Introduce el artículo que quieres eliminar:");
                nombre = sc.next();
                eliminaarticulo(nombre, listaarticulos);
                break;
            default:
                System.out.println("Elige una opción, por favor.");
        }

    }

 }

    public static void guardararticulo(String nombre, float precio, HashMap <String,Float> listaarticulos){
                if (listaarticulos.containsKey(nombre)) {
                    System.out.println("No se puede introducir el artículo porque ya existe.");
                } else {
                    listaarticulos.put(nombre, precio);               
                    }
    }
    
    public static void mostrararticulos(HashMap<String, Float> listaarticulos) {
                String clave;
                Iterator<String> productos = listaarticulos.keySet().iterator();
                System.out.println("Hay los siguientes artículos:");
                while(productos.hasNext()){
                    clave = productos.next();
                    System.out.println(clave + " - " + listaarticulos.get(clave));
                    }        
    }
    
    public static void eliminaarticulo(String nombre, HashMap<String,Float> listaarticulos) {
                if (listaarticulos.containsKey(nombre)) {
                    listaarticulos.remove(nombre);
                } else {
                    System.out.println("No hay ningún artículo con ese nombre.");  
                    }       
    }  
} 