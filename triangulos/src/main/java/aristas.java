import java.util.Scanner;

public class aristas {

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
     
        System.out.println ("Dime una arista:");
        int aristaA = sc.nextByte();
        System.out.println ("Dime una arista:");
        int aristaB = sc.nextByte();
        System.out.println ("Dime una arista:");
        int aristaC = sc.nextByte();
       
        if (aristaA == aristaC && aristaA == aristaB) 
           System.out.println("El triángulo es equilatero.");
       
        else if (aristaA != aristaC && aristaA == aristaB) 
           System.out.println("El triángulo es isósceles.");
       
        else if (aristaA != aristaC && aristaA != aristaB)
           System.out.println("El triángulo es escaleno.");
       
       
    }
    
}