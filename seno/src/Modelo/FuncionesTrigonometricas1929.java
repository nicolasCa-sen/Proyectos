package Modelo;

public class FuncionesTrigonometricas1929 {
		
	
private final static int LIMITE = 40;
	
	private double angulo;
	
	public FuncionesTrigonometricas1929(){
		this.angulo=0.0;
	}

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}
	public double convertirRadianes1929() {
		double rad;
		rad=(this.angulo*Math.PI)/180;
		return rad;
	}
	public double CalcularFactorial1929(int numero) {
		double fact=1;
		for(int i=1; i<=numero; i++ ){
			fact=fact*i;
		}
		return fact;
	}
	public double CalcularSeno1929() {
		int i=1;
		double totalSerie=0;
		double ang = convertirRadianes1929();
		while(i<=LIMITE) {
			double pot1= Math.pow(-1, i+1);
			double pot2= Math.pow(ang, 2*i-1);
			double fac = CalcularFactorial1929(2*i-1);
			double operacion = pot1*(pot2/fac); 
			totalSerie += operacion;;
			i++;
		}
		return totalSerie;
	}
	public double CalcularCoseno1929() {
		int i=1;
		double totalSerie=0;
		double ang = convertirRadianes1929();
		do {
			double pot1= Math.pow(-1, i+1);
			double pot2= Math.pow(ang, 2*i-2);
			double fac = CalcularFactorial1929(2*i-2);
			double operacion = pot1*(pot2/fac); 
			totalSerie += operacion;;
			i++;
		} while (i<=LIMITE);
		return totalSerie;
	}
	public double CalcularTangente1929() {
		double tang;
		tang=CalcularSeno1929()/CalcularCoseno1929();
		return tang;
	}
	public double CalcularCotangente1929() {
		double ctang;
		ctang=CalcularCoseno1929()/CalcularSeno1929();
		return ctang;
	}
	public double CalcularSecante1929() {
		double sec;
		sec=1/CalcularCoseno1929();
		return sec;
	}
	public double CalcularCosecante1929() {
		double Csec;
		Csec=1/CalcularSeno1929();
		return Csec;
	}
	
	
	
	public String datosFunciones() {
		return "Angulo ("+getAngulo()+")\n"+
				"Seno ("+CalcularSeno1929()+")\n"+
				"Coseno ("+CalcularCoseno1929()+")\n"+
				"Tangente ("+CalcularTangente1929()+")\n"+
				"Cotangente ("+CalcularCotangente1929()+")\n"+
				"Secante ("+CalcularSecante1929()+")\n"+
				"Cosecante ("+CalcularCosecante1929()+")\n";
	
	
	}
}