package Modelo;

public class coseno_x {

	public double cosx(double valor) {
		int	cont=1;
		double potencia1=2;
		double potencia2=4;
		double y;
		double sumaPositiva=0.0;
		double sumaNegativa=0.0;
		
		factorial1 fact=new factorial1();
		do {
			sumaPositiva=sumaPositiva-(Math.pow(valor,potencia1))/fact.calcula_factorial(potencia1);
			potencia1+=4;
			sumaNegativa=sumaNegativa+(Math.pow(valor,potencia2))/fact.calcula_factorial(potencia2);
			potencia2+=4;
			cont++;
		}while(cont<4);
		y=1+sumaPositiva+sumaNegativa;
		return y; 
		
			
	}
	
}
