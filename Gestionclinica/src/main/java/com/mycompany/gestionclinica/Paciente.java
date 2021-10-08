package com.mycompany.gestionclinica;

public class Paciente {
    
    public String nombre;
    public byte edad;
    public String dni;
    public String sexo;
    public short peso;
    public double altura;
    
    public Paciente(String nombre, byte edad, String dni, String sexo, short peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;   
    }
    
    @Override
    public String toString(){
            return "El paciente se llama " + this.nombre + ", su edad es de " + this.edad + " años, DNI " + this.dni
                    + "; de sexo " + this.sexo + ", con un peso de " + this.peso + ", y una altura de " + this.altura + "m.";
    }   
}