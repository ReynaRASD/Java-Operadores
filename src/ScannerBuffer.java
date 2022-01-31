import java.util.Scanner;

public class ScannerBuffer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// No es necesario NI RECOMENDABLE hacer un Scanner cada que pides datos al usuario.
		
		System.out.println("Introduce un numero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("Introduce otro numero: ");
		int numero2 = sc.nextInt();
		
		sc.nextLine(); //Esto limpia el buffer y es si cambias a String.
		//http://puntocomnoesunlenguaje.blogspot.com/2012/08/java-scanner.html
		
		System.out.println("Dame tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Numero 1: " + numero1 
				+ "\nNumero 2: " + numero2
				+ "\nTu nombre es: " + nombre);
		
		
		
		
		
	}
}
