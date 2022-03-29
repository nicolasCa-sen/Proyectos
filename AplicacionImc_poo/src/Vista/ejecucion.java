package Vista;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Modelo.Persona;
import Modelo.persona2;

public class ejecucion {

	public static void main(String[] args) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		// TODO Esbozo de método generado automáticamente
		double altura,peso;
		String identificador;
		String nombre;
		int edad;
		
		System.out.println("ingrese su nombre  : ");
		nombre = bufEntrada.readLine();
		
		System.out.println("ingrese su identificacion  : ");
		identificador = bufEntrada.readLine();
		
		System.out.println(" ingrese su peso en kg : ");
		peso = Double.parseDouble(bufEntrada.readLine());
		
		System.out.println("ingrese su altura en M: ");
		altura = Double.parseDouble(bufEntrada.readLine());
		
		System.out.println("ingrese su año de nacimiento : ");
		edad = Integer.parseInt(bufEntrada.readLine());
		
		Persona persona1 = new Persona(nombre,identificador,peso,altura,edad);
		System.out.println("señor : "+persona1.getNombre());
		System.out.println("identificacion : "+persona1.getIdentificacion());
		System.out.println("altura : "+persona1.getAltura());
		System.out.println("peso : "+persona1.getPeso());
		System.out.println("edad : "+persona1.años());
		System.out.println(persona1.imc1());
		System.out.println ("La clasificación del IMC es : " + persona1.clasificacionImc());
		
		System.out.println ("ejecucion 1 Finalizada");
		
		System.out.println(" ingrese su peso en kg : ");
		peso = Double.parseDouble(bufEntrada.readLine());
		
		System.out.println("ingrese su altura en M: ");
		altura = Double.parseDouble(bufEntrada.readLine());
		
		System.out.println("ingrese su año de nacimiento : ");
		edad = Integer.parseInt(bufEntrada.readLine());
		
		persona2 persona2 =new persona2("Carlos Perez","9845623",peso,altura,edad);
		System.out.println("señor : "+persona2.getNombre());
		System.out.println("identificacion : "+persona2.getIdentificacion());
		System.out.println("altura : "+persona2.getAltura());
		System.out.println("peso : "+persona2.getPeso());
		System.out.println("edad : "+persona2.años());
		System.out.println(persona2.imc1());
		System.out.println ("La clasificación del IMC es : " + persona2.clasificacionImc());
		
		System.out.println ("ejecucion 2 Finalizada");
	}

}
