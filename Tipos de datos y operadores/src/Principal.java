import Autobus.PuntoTres;
import Triangulo.PuntoUno;
import Formulas.PuntoDos;

public class Principal {
	
	public static void main (String[] args) {	    
	
	//Punto Uno
	System.out.println("Punto Uno");
	    PuntoUno sp = new PuntoUno();
	    sp.calcularSuperficie();
	    
	    
	//Punto Dos
	    System.out.println("\n\nPunto Dos");
	        double ecuacion;
			double x = 2;
			double y = 4;
			double z = 5;
			
			ecuacion = (Math.sqrt(Math.pow(x,5)-6)) / (4);
			System.out.println(ecuacion);
			
			ecuacion = (Math.pow(x,y) - Math.pow(6, x));
			System.out.println(ecuacion);
			
			ecuacion = (4 + Math.cos(z / 5) - Math.sin(Math.pow(x, 2)));
			System.out.println(ecuacion);
			
			ecuacion = (Math.pow(x, 4) - Math.sqrt(6 + x - Math.pow(y, 3)));
			System.out.println(ecuacion);
			
			ecuacion = (1) / (y- (1)) / (x - Math.pow(2, y));
			System.out.println(ecuacion);
			
			ecuacion = (7 + (Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 + x - 4))))));
			System.out.println(ecuacion);
			
	    
	    
	    
	//Punto Tres    
	 System.out.println("\n\nPunto Tres ");
	    PuntoTres ab = new PuntoTres();
	    ab.calcularAutobuses();
	       


}
	   

}


