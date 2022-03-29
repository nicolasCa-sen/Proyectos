package Vista;

import Modelo.FuncionesTrigonometricas;

public class Runner {

	//Implementar el metodo main
	
	//Instancia de la clase seno
	//Mostrar el valor inicial del angulo de la clase seno
	//Modifican el valor del angulo ....45
	//Mostrar los radianes del angulo
	//Mostrar el factorial 3
	
	public static void main(String[] args) {
		FuncionesTrigonometricas funcionestrigonometricas = new FuncionesTrigonometricas();
		funcionestrigonometricas.setAngulo(40.5);
		System.out.println("Seno(" + funcionestrigonometricas.getAngulo() + ") = " + funcionestrigonometricas.serieSeno());
		System.out.println("Coseno(" + funcionestrigonometricas.getAngulo() + ") = " + funcionestrigonometricas.serieCoseno());
		System.out.println("Tangente(" + funcionestrigonometricas.getAngulo() + ") = " + funcionestrigonometricas.tangente());
	}
	
	//implementar metodo main
	//Instanciar clase seno
	//Ingresar el angulo del seno por teclado
	//Mostrar el calculo del FuncionesTrigonometricas y coseno del angulo
}
