import java.util.Scanner;

public class numerae {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número romano: ");
        String romano = sc.next();
  
        int i = 0; 
        int segundo = 0;
        int primero = 0;
        int arabigo = 0;
        
        while (i < romano.length()) {

            char letras = romano.charAt(i);
            
                switch (letras) {
                    case ('I'):
                        segundo = 1;
                        break;
                    case ('V'):
                        segundo = 5;
                        break;
                    case ('X'):
                        segundo = 10;
                        break;
                     case ('L'):
                        segundo = 50;
                        break;
                     case ('C'):
                        segundo = 100;
                        break;
                     case ('D'):
                        segundo = 500;
                        break;
                     case ('M'):
                        segundo = 1000;
                        break;
                 }


            if (segundo > primero) 
                arabigo += segundo - (primero * 2);
             else 
                arabigo += segundo;
        primero = segundo; 
        i += 1; 

        }
        
        System.out.println("El número es " + arabigo);

        
    }
}