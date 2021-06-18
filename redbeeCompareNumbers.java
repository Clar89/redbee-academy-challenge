import java.util.Scanner;
 
public class redbeeCompareNumbers {
 
    public static void main( String args[] ) {
 
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Ingrese el primer numero: " );
        int numUno = teclado.nextInt();
        System.out.print( "Ingrese el segundo numero: " );
        int numDos = teclado.nextInt();

        System.out.print( "Ingrese el tercer numero: " );
        int numTres = teclado.nextInt();

        if ( numUno>numDos && numUno>numTres)   {

        System.out.print( "El numero mayor es: "+numUno );
        
        }
        else if (numDos>numUno && numDos>numTres) {
        	System.out.println("El numero mayor es:"+numDos);
        	
        } else {
        	System.out.println("El numero mayor es:"+numTres);
        }
    }
}