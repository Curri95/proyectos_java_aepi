
import java.util.Scanner;


public class vocalconsonante {

    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in);

	System.out.println ("Dime una letra: ");
	char letra=sc.next().charAt(0); 
        
        boolean vocal=false;
        
	switch (letra) {
	   case 'a' :
	   case 'e' :
    	   case 'i' :
	   case 'o' :
	   case 'u' :
	   case 'A' :
	   case 'E' :
	   case 'I' :
	   case 'O' :
	   case 'U' : 
           case 'á' :
           case 'é' :
           case 'í' :
           case 'ó' :
           case 'ú' :
           case 'Á' :
           case 'É' :
           case 'Í' :
           case 'Ó' :
           case 'Ú' :
           case 'Ü' :
           case 'ü' :
           vocal = true;
        }

            if (vocal == true) 
                 System.out.println (letra + " es una vocal.");
            
            else 
                if( (letra >= 'a' && letra <= 'z') || (letra >= 'A' && letra <= 'Z') )
                    System.out.println (letra + " es una consonante.");
                else
                    System.out.println ("No has introducido una letra.");  
    }
}
    

