package proyectofinal.gestionacademia;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class opcionesmenu {
    
    public String nombre;
  
    public ArrayList<alumnos> listaalumnos = new ArrayList<alumnos>(10);  

    public String crearestudiante(String nombre, String clase, String asistencia, Float nota1, Float nota2, Float nota3) {
        listaalumnos.add(new alumnos(nombre, clase, asistencia, nota1, nota2, nota3));
        return "Se ha agregado correctamente al alumno. ";
    }
    
    public String mostrarmediaalumno(String nombre) {
        for (alumnos alumno : listaalumnos) {
            if (alumno.nombre.equalsIgnoreCase(nombre)) {
                return "La media del alumno es " + alumno.mediadelalumno() + ".";
            }
        }
        return "No existe ningún alumno con ese nombre.";  
    }
    
   public String mostrarmediaclase(String clase){
        int contaralumnos =0;
        double mediadelalumno =0;

        for(int i=0 ; i < listaalumnos.size();i++){
            if(listaalumnos.get(i).pedirclase().equals(clase)){
                mediadelalumno+=listaalumnos.get(i).mediadelalumno();
                contaralumnos++;

            }
        }
        return "La media de la clase " + clase + " es de " + (mediadelalumno / contaralumnos) + ".";

    }    
    
    public String ModificarAlumno(String nombre, String nuevaclase, String nuevaasistencia, Float nuevanota1, Float nuevanota2, Float nuevanota3) {
        for (int indice = 0; indice < this.listaalumnos.size(); indice++) {
            if (this.listaalumnos.get(indice).nombre.equalsIgnoreCase(nombre)) {
                this.listaalumnos.get(indice).clase = nuevaclase;
                this.listaalumnos.get(indice).asistencia = nuevaasistencia;
                this.listaalumnos.get(indice).nota1 = nuevanota1;
                this.listaalumnos.get(indice).nota1 = nuevanota2;
                this.listaalumnos.get(indice).nota1 = nuevanota3;
                
                return "Se han modificado los datos del alumno.";
            }       
        }
        return "No existe ningún alumno con ese nombre.";
    }
    
    public String buscarestudiante(String nombre) {
        for (alumnos alumno : listaalumnos) {
            if (alumno.nombre.equalsIgnoreCase(nombre)) {
                return alumno.toString();
            }
        }
        return "No existe ningún alumno con ese nombre.";
    }    
        
    public String eliminarestudiante(String nombre) {
        for (alumnos alumno : listaalumnos) {
            if (alumno.nombre.equalsIgnoreCase(nombre)) {
                listaalumnos.remove(alumno);
                return "El alumo ha sido eliminado correctamente.";
            }
        }
        return "El alumno no existe, por favor introduzca un nombre válido.";
    }  
    
    public String mostrardatosalumnoadmin(String nombre){
        for (alumnos alumno : listaalumnos) {
            if (alumno.nombre.equalsIgnoreCase(nombre))
                return alumno.toString();
        }
        return "No existe ningún alumno con ese nombre.";
    }    
    
    public String mostrardatosalumno(String nombre){
        for (alumnos alumno : listaalumnos) {
            if (alumno.nombre.equalsIgnoreCase(nombre))
                return alumno.datosalumno();
        }
        return "No existe ningún alumno con ese nombre.";
    }    
    
    public void guardararchivo() {
        try {
            File datosalumnado = new File("alumnos.csv");
            FileWriter writer = new FileWriter(datosalumnado);
            BufferedWriter bw = new BufferedWriter(writer);
            
            String todosdatos = "";
            for (alumnos alumno : this.listaalumnos) {
                todosdatos += alumno.toCSV() + "\n";
            }            
            bw.write(todosdatos);
            bw.close();
            writer.close();
        }
        catch (Exception error) {   
        }
    }

    public void cargararchivo() {
        try {
        File datosalumnado = new File("alumnos.csv");
        FileReader reader = new FileReader(datosalumnado);
        BufferedReader br = new BufferedReader(reader);
        
        String linea = br.readLine();
            while (linea != null) {
                String[] datos = linea.split(";");
                this.listaalumnos.add( new alumnos(
                    datos[0], 
                    datos[1], 
                    datos[2], 
                    (float)Integer.parseInt(datos [3]), 
                    (float)Integer.parseInt(datos [4]),
                    (float)Integer.parseInt(datos [5])
                    ));
                linea = br.readLine();
            }
        br.close();
        reader.close();
        }
        catch (Exception error) {   
        }
    }   
    
    public String mostraralumnos() {
        String salida = "";
        for (alumnos alumno : listaalumnos) {
            salida += alumno.toString() + "\n";
        }
        return salida;
    }
        
    public String listapararchivo() throws IOException{
        FileWriter writer = new FileWriter("alumnos.txt"); 
        for(alumnos str: listaalumnos) {
        writer.write(str + System.lineSeparator());
        }
        writer.close();
        
        return "Se ha creado correctamente un archivo con los datos de los alumnos.";
    }    
            
}