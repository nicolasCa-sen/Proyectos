package prueba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MCI {

static class Main {
	public static boolean validarDato (double numero) {
		boolean dato = false  ;
		if ( numero >= 0) {
			
		}
		
		return dato;
		
	}
  public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		
		double altura,imc1,peso;
		String identificador;
		String nombre;
		
		System.out.println("ingrese su nombre  : ");
		nombre = bufEntrada.readLine();
		
		System.out.println("ingrese su identificacion  : ");
		identificador = bufEntrada.readLine();
		
		System.out.println(" ingrese su peso en kg : ");
		peso = Double.parseDouble(bufEntrada.readLine());
		
		System.out.println("ingrese su altura en M: ");
		altura = Double.parseDouble(bufEntrada.readLine());
		
		imc1 = peso/Math.pow(altura,2);
		System.out.println("IMC = "+imc1);
		
			if (imc1<18.5) {
			System.out.println(nombre+" tiene un  peso bajo ");
			} else {
			}
			if (imc1>=18.5) {
			if (imc1<=24.9) {
			System.out.println(nombre+" tiene un peso normal");
			} else {
			}
			if (imc1>=25) {
			if (imc1<=26.9) {
			System.out.println(nombre+" tiene un  sobrepeso  de grado I");
			} else {
			}
			} else {
			if (imc1>=27) {
			if (imc1<=29.9) {
			System.out.println(nombre+" tiene un sobrepeso grado II");
			} else {
			}
			} else {
			if (imc1>=30) {
			if (imc1<=34.9) {
			System.out.println(nombre+" tiene una obesidad de tipo I");
			} else {
			}
			} else {
			}
			}
			if (imc1>=35) {
			if (imc1<=39.9) {
			System.out.println(nombre+" tiene una obesidad de tipo II");
			} else {
			}
			} else {
			}
			}
			if (imc1>=40) {
			if (imc1<=49.9) {
			System.out.println(nombre+" tiene una obesidad de tipo III(Morbida)");
			} else {
			}
			} else {
			}
			if (imc1>50) {
			System.out.println(nombre+" tiene una obesidad de tipo VI(Extrema)");
			} else {
			}
		}
    }
}

}
