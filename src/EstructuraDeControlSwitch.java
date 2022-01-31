import java.util.Scanner;

public class EstructuraDeControlSwitch {
	public static void main(String[] args) {
	// Estructuras de control nos sirve para controlar el flujo
	// de comportamiento de un programa. Para la toma de decisiones.
	/*
	 switch(condicion_a_evaluar){
	 	case 'valor':
	 		//codigo a ejecutar
	 		//break
	 	case 'n':
	 	 	//codigo a ejecutar
	 	 	//break
	 	 default:
	 	 	//codigo a ejecutar

	 }
	 */
	
	// Solicitarle al usuario un dia de la semana y mostrarle un mensaje.
	System.out.println("Piensa un dia de la semana.");
		
		
	System.out.println("Escribe el dia: ");
	Scanner sc = new Scanner(System.in);
	String dia = sc.nextLine();
	
	switch(dia.toLowerCase()) {
		case "lunes":
			System.out.println("Ya mero es viernes, toma un cafe.");
			break;
		case "martes":
			System.out.println("Solo recuerda que el lunes fue mas pesado.");
			break;
		case "miercoles":
			System.out.println("Ufff, mitad de semana.");
			break;
		case "jueves":
			System.out.println("Mañana es viernes!");
			break;
		case "viernes":
			System.out.println("Viernes de fiesta.");
			break;
		case "sabado":
			System.out.println("Sabado de chelas.");
			break;
		case "domingo":
			System.out.println("Descansa, mañana es lunes.");
			break;
		default:
			System.out.println("Error.");
		
	}
		
	}
	
}
