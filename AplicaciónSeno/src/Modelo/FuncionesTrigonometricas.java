package Modelo;

public class FuncionesTrigonometricas {
	//Constantes
	private final static int LIMITE = 40;
	
	//Atributos
	private double angulo;
	
	//Constructor
	public FuncionesTrigonometricas() {
		this.angulo = 0.0;
	}

	//Métodos
	public double getAngulo() {
		return this.angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}
	
	//Método que retorne los radianes, rad=pi*ang/180, y no tiene parametros 
	public double convertirRadianes() {
		double rad;
		rad = (this.angulo*Math.PI)/180;
		return rad;
		
		//return (this.angulo*Math.PI)/180;
	}
	
	//Método que retorne el factorial de un numero entero, n!=1*2*3...n, y tiene parametro, el numero al cual le calculo el factorial
	public double calcularFactorial(int numero) {
		double fact = 1;
		for(int contador=1;contador<=numero;contador++) { //contador=contador+1  contador+=1
			fact = fact*contador;
		}
		return fact;
	}
	
	//Metodo que retorne el resultado de la sumatoria o serie de taylor del seno, y no tiene parametros
	public double serieSeno() {
		int i = 1;
		double totalserie = 0;
		double ang = convertirRadianes();
		while(i<=LIMITE) {
			double pot1 = Math.pow(-1,i+1);
			double pot2 = Math.pow(ang,2*i-1);
			double fact = calcularFactorial(2*i-1);
			double operacion = pot1*(pot2/fact);
			totalserie += operacion;
			i++;
		}
		return totalserie;
	}
	
	
	//Metodo que retorne el resultado de la sumatoria o serie de taylor del coseno, y no tiene parametros
	public double serieCoseno() {
		int i = 1;
		double totalserie = 0;
		double ang = convertirRadianes();
		do{
			double pot1 = Math.pow(-1,i+1);
			double pot2 = Math.pow(ang,2*i-2);
			double fact = calcularFactorial(2*i-2);
			double operacion = pot1*(pot2/fact);
			totalserie += operacion;
			i++;
		}while(i<=LIMITE);
		return totalserie;
	}
	
	
	public double tangente() {
		double tang = serieSeno()/serieCoseno();
		return tang;
	}
	
	
	
	
	
	//Metodo que retorne un cadena de caracteres con los resultados del seno y coseno del angulo, y no tiene parametros
	
}
