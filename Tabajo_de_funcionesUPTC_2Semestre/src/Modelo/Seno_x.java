package Modelo;

public class Seno_x {
	public double senx(double valor) {
		int	cont=1;
		double potencia1=1;
		double potencia2=3;
		double y;
		double sumaPositiva=0.0;
		double sumaNegativa=0.0;
		
		Factorial fact=new Factorial();
		do {
			sumaPositiva=sumaPositiva+(Math.pow(valor,potencia1))/fact.calcula_factorial(potencia1);
			potencia1+=4;
			sumaNegativa=sumaNegativa-(Math.pow(valor,potencia2))/fact.calcula_factorial(potencia2);
			potencia2+=4;
			cont++;
		}while(cont<4);
		y=sumaPositiva+sumaNegativa;
		return y; 
		
			
	}

}
