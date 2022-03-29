package Modelo;

public class Senohiperbolico1929 {
		
	
	
	private double angulo;
	private static double conteo;
	
	public Senohiperbolico1929(){
		this.angulo=0.0;
		this.conteo=0.0;
	}

	public double getAngulo() {
		return angulo;
	}

	public void setAngulo(double angulo) {
		this.angulo = angulo;
	}
	public double getConteo() {
		return conteo;
	}

	public void setConteo(double conteo) {
		this.conteo = conteo;
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
		
		int i=0;
		double totalSerie=0;
		double totalSerie1=0;
		double totalSerie2=0;
		double operacion1 = 0 ;
		double operacion2 =0;
	
		double ang = convertirRadianes1929();
		do{
			double pot1= Math.pow(angulo,i);
			
			double pot2= CalcularFactorial1929(i);
			
			 operacion1 = pot1/pot2;
			totalSerie1 +=operacion1;
		
			 	
			double pot4= Math.pow(angulo,i);
			
			double pot5= CalcularFactorial1929(i);
			
			double pot6 = Math.pow(-1,i);
			
			 operacion2 = pot6*(pot4/pot5);
			totalSerie2 += operacion2;
			i = i+1;
		}while(i <= conteo);
	
		 
		totalSerie =(totalSerie1-totalSerie2)/2;
	
		return totalSerie;
	}
	
	
	
	public String datosFunciones() {
		return "Angulo ("+getAngulo()+")\n"+
				"Seno ("+CalcularSeno1929()+")\n";
	
	
	}
}