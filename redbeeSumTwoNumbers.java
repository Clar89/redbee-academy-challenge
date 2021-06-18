import java.util.Scanner;
 
public class redbeeSumTwoNumbers {
 
    public static void main( String args[] ) {
 
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Ingrese el primer numero: " );
        int numUno = teclado.nextInt();
        System.out.print( "Ingrese el segundo numero: " );
        int numDos = teclado.nextInt();
 
        System.out.print( "La suma de ambos numeros es: " );
        System.out.println( numUno+numDos );
    }
}