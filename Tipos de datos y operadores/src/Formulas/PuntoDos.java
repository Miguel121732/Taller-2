package Formulas;
import static java.lang.Math. *;

public class PuntoDos {
	
	
	
	public PuntoDos(){
		int x = 2, y = 4, z = 5;
	
		
	
	PuntoDosA(x);
	PuntoDosB(x,y);
	PuntoDosC(x,z);
	PuntoDosB(x,y);
	PuntoDosE(x, y);
	PuntoDosF(x);
		
	}
 
	

	public void PuntoDosA(int x) {		
		double ecuacion;
		ecuacion = (Math.sqrt(Math.pow(x,5)-6)) / (4);
		System.out.println(ecuacion);	 
	}
	

	public void PuntoDosB(int x, int y) {
		double ecuacion;
		ecuacion = (Math.pow(x,y) - Math.pow(6, x));
		System.out.println(ecuacion);
	}

	public void PuntoDosC(int x, int z) {
		double ecuacion;
		ecuacion = (4 + Math.cos(z / 5) - Math.sin(Math.pow(x, 2)));
		System.out.println(ecuacion);
		
	}

	public void PuntoDosD(int x, int y) {
		double ecuacion;
		ecuacion = (Math.pow(x, 4) - Math.sqrt(6 + x - Math.pow(y, 3)));
		System.out.println(ecuacion);
	}
	
	public void PuntoDosE(int x, int y) {
		double ecuacion;
		ecuacion = (1) / (y- (1)) / (x - Math.pow(2, y));
		System.out.println(ecuacion);
	}

	public void PuntoDosF(int x) {
		double ecuacion;
		ecuacion = (7 + (Math.cos(Math.sqrt(5 - Math.sin(Math.sqrt(3 + x - 4))))));
		System.out.println(ecuacion);
		
	}

	
	}
	


