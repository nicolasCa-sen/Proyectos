package Modelo;

public class Factorial {
	public int calcula_factorial(double n) {
		int f=1;
		for(int i=1;i<=n;i++) {
			f=f*i;
	
		}
		
		return f; 
	}
	

}
