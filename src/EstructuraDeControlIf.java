import java.util.Scanner;

public class EstructuraDeControlIf {
	
	public static void main(String[] args) {
	//Estructuras de control de flujo
		//Nos sirve para la toma de decisiones
		
		//Estructuras de control de flujo nos sirve para
		//cambiar el flujo de nuestro programa
		//evaluando una condicion y a partir de la evaluacion
		//se realiza una accion u otra.
	
	/*
	if(condicion) {
		codigo
	} else {
		codigo
	}
	*/
	
	System.out.println("Introduce tu edad: ");
	Scanner sc = new Scanner(System.in);
	int edad = sc.nextInt();
	
	if(edad >= 18) {
		System.out.println("Eres mayor de edad.");
	} else {
		System.out.println("Eres menor de edad.");
	}
	
	}
}
