package com.mycompany.gestionclinica;

import java.util.ArrayList;

public class Clinica {
    
    private ArrayList<Paciente> listapacientes = new ArrayList<Paciente>();
    
    public String agregarpaciente(String nombre, byte edad, String dni, String sexo, short peso, double altura) {
        Paciente nuevopaciente = new Paciente(nombre, edad, dni, sexo, peso, altura);
        listapacientes.add(nuevopaciente);
        return "Se ha agregado correctamente al paciente.";
    }
    
    public String comprobarpaciente (String nombre){
        for (Paciente paciente : listapacientes){
            if (paciente.nombre.equals(nombre)) {
                return "Se ha encontrado un paciente con ese nombre.";
            }
        }
        return "No se ha encontrado ningún paciente con ese nombre.";    
    }
    
    public String comprobarIMC (String nombre){
        for (Paciente paciente : listapacientes){
            if (paciente.nombre.equals(nombre)) {
                double IMC = (paciente.peso / (paciente.altura * paciente.altura));
                return "El IMC del paciente es " + IMC + ".";    
            }
        }
        return "El paciente no existe, por favor agrégelo.";
    }
    
    public String esmayoredad (String nombre){
        for (Paciente paciente : listapacientes){
            if (paciente.nombre.equals(nombre) && (paciente.edad >= 18)) {
                {
                   return ("El paciente es mayor de edad.");
                }
            }
            else if (paciente.nombre.equals(nombre) && (paciente.edad <= 18)){
                return ("El paciente NO es mayor de edad.");
            }
        }
        return "El paciente no existe, por favor agrégelo.";
    }
    
    public String mostrartodos() {
        String salida = "";
        for (Paciente paciente : listapacientes) {
            salida += paciente.toString() + "\n";
        }
        return salida;
    }
}