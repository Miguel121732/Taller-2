package Triangulo;
import java.util.Scanner;

public class PuntoUno {

	public Scanner sc;

	public void calcularSuperficie(){
		double base;
		double altura;
		double superficie;
		
		sc = new Scanner(System.in);
	
		System.out.print("ingrese base:\t");
		double b = sc.nextDouble();
		
		System.out.print("Ingrese altura:\t");
		double a =sc.nextDouble();
		
		superficie = ((b*a)/2);
		
		System.out.print("El area del triangulo es: " +superficie);					
	}
}
	

