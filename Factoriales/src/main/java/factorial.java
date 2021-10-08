
import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        long factorial = 1;
        int numero ;
        
        System.out.println("Dime un número: ");
        numero = sc.nextInt();
        
        for (int i = numero; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
        
        
        
        
    