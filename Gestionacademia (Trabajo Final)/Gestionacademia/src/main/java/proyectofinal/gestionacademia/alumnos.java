package proyectofinal.gestionacademia;

public class alumnos{
    
    public String nombre;
    public String clase;
    public String asistencia;
    public Float nota1;  
    public Float nota2;  
    public Float nota3;
    
   public alumnos(String nombre, String clase, String asistencia, Float nota1, Float nota2, Float nota3) {
        
        this.nombre = nombre;
        this.clase = clase;
        this.asistencia = asistencia;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }    
   public String pedirnombre() {
        return nombre;
    }

    public void ponernombre(String nombre) {
        this.nombre = nombre;
    }

    public String pedirclase() {
        return clase;
    }

    public void ponerclase(String clase) {
        this.clase = clase;
    }

    public Float pedirnota1() {
        return nota1;
    }

    public void ponernota1(Float nota1) {
        this.nota1 = nota1;
    }

    public Float pedirnota2() {
        return nota2;
    }

    public void ponernota2(Float nota2) {
        this.nota2 = nota2;
    }

    public Float pedirnota3() {
        return nota3;
    }

    public void ponernota3(Float nota3) {
        this.nota3 = nota3;
    }

   public Float mediadelalumno(){
       return (nota1+ nota2 + nota3)/3;
   }
   
   @Override
   public String toString(){
        return "Su nombre es " + this.nombre + ", atiende a la clase de " + this.clase + ", su asistencia es del " + this.asistencia +
            ", sus notas son " + this.nota1 + "; " + this.nota2 + "; " + this.nota3 + ". La media del alumno es " + ((nota1 + nota2 + nota3)/3) + "." ;
   } 
   
   public String datosalumno(){
        return "Atiendes a la clase de " + this.clase + ", tu asistencia es del " + this.asistencia +
            ", tus notas son " + this.nota1 + "; " + this.nota2 + "; " + this.nota3 + ". Tu media es " + ((nota1 + nota2 + nota3)/3) + "." ;
   } 

   public String toCSV() {
        return this.nombre + ", " + this.clase + ", " + this.asistencia + ", " + this.nota1 + ", " + this.nota2 + ", " + this.nota3;
    }   
   
}