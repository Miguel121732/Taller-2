package Autobus;
import java.util.Scanner;

public class PuntoTres {
	
	public Scanner sc;

	public void calcularAutobuses() {
		sc = new Scanner(System.in);
		
		System.out.print("Ingrese el numero de personas que se han apuntado: ");
		int numPersonas = sc.nextInt();
		
		int numAutobuses = numPersonas / 45;
		int numPersonasFurgonetas = numPersonas % 45;
		
		System.out.println("Numero de autobuses necesarios: " + numAutobuses);
		System.out.println("Numero de personas que tendran que viajar en furgoneta: " + numPersonasFurgonetas);	}
	
	
}
