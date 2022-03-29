package Modelo;

import java.util.Arrays;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Arreglo1929 {

	//private final static int TAMANHO = 30;

	private double[] datos;



	public Arreglo1929(int tamanho) {
		datos = new double[tamanho];


	}


	public double[] getDatos1929() {
		return this.datos;
	}

	public void setDatos1929(int indice,double datos) {
		this.datos[indice] = datos;
	}


	@Override
	public String toString() {
		return "Arreglo datos\n" + Arrays.toString(datos);
	}

	//Metodo de ordenamiento de forma creciente
	public void intercambioAsc_1929() {
		for(int i = 0; i < datos.length-1; i++) {
			for(int j = i+1; j < datos.length; j++) {
				if(datos[i] > datos[j]) {
					//Intercambio
					double aux = datos[i];
					datos[i] = datos[j];
					datos[j] = aux;
				}
			}
		}
	}

	//Metodo de ordenamiento de forma decreciente
	public void intercambioDesc_1929() {
		for(int i = 0; i < datos.length-1; i++) {
			for(int j = i+1; j < datos.length; j++) {
				if(datos[i] < datos[j]) {
					//Intercambio
					double aux = datos[i];
					datos[i] = datos[j];
					datos[j] = aux;
				}
			}
		}
	}
	//Metodo de ordenamiento tipo burbuja de forma creciente
	public void burbuja_1929() {
		for(int i = 1; i <= datos.length-1; i++) {
			for(int j = 0; j <= datos.length-i-1; j++) {
				if(datos[j] > datos[j+1]) {
					//Intercambio
					double aux = datos[j];
					datos[j] = datos[j+1];
					datos[j+1] = aux;
				}
			}
		}
	}

	//Metodo de ordenamiento de tipo shell
	public void ordenamientoShell1929() {
		int salto,i;
		double aux;
		boolean cambios;

		for (salto = datos.length / 2; salto != 0; salto /= 2) {
			cambios = true;
			while (cambios) {   // Mientras se intercambie alg?n elemento
				cambios = false;
				for (i = salto; i < datos.length; i++)   // se da una pasada
				{
					if (datos[i - salto] > datos[i]) {       // y si est?n desordenados
						aux = datos[i];                  // se reordenan
						datos[i] = datos[i - salto];
						datos[i - salto] = aux;
						cambios = true;              // y se marca como cambio.
					}
				}
			}
		}
	}

	//Metodo que busca un valor en el arreglo
	public int busquedaElemento1929(double buscador) {
		for (int i = 0; i < datos.length; i++) {
			if (datos [i] == buscador)
				return i+1;
		}
		return -1;
	}


	//Metodo que busca un valor del arreglo del metodo Binario
	public int busquedaBinaria1929(int busquedas) {
		int n = datos.length;
		int centro = 0 , inf = 0 , sup = n-1;
		while (inf <= sup) {
			centro = (sup + inf)/2;
			if (datos[centro] == busquedas) {
				return centro;
			}else if(busquedas < datos[centro]){
				sup=centro-1;
			}else {
				inf = centro+1;
			}
		}

		return -1;
	}

	//Metodo que elimina un dato
	public void eliminarDato(int posicion) {
		for(int i=0 ; i<datos.length ; i++) {
			if (datos[i] == posicion) {
				datos[i]=0;

			}
		}
	}
	/*public void eliminarDato(int posicion) {
	for(int i=posicion ; i<datos.length ; i++) {
				datos[i] = datos[i+1];
		}

	}*/


	public void modificarDato(int posicion, int valor) {
		for(int i=0 ; i<datos.length ; i++) {
			if (datos[i] == posicion) {
				datos[i]=valor;

			}
		}
	}


	//Metodo que cuenta cuantas veces hay un elemento en el arreglo
	public int cantidadElementos1929(double buscador) {
		int val=0;
		for (int i = 0; i < datos.length; i++) {
			if (datos [i] == buscador) {
				val++;
			}
		}
		return val;

	}

	//Metodo que devuelve el valor maximo del arreglo
	public String generarMAX1929() {
		double mayor= datos[0];
		for (int i=0 ; i<datos.length ; i++) {
			if (datos[i]>mayor) {
				mayor = (int)Math.round(datos[i]);
			}
		}
		String mayor1 = Double.toString(mayor);
		return mayor1;
	}

	//Metodo que devuelve el valor minimo del arreglo
	public String generarMin1929() {
		double min = datos[0];
		for (int i=0 ; i<datos.length ; i++) {
			if(datos[i]<min) {
				min=datos[i];
			}
		}
		String minimo = Double.toString(min);
		return minimo;
	}

	//Metodo para calcular el promedio de las notas
	public String generarPromedio1929() {
		double acumulador=0;
		for (int i=0 ; i<datos.length ; i++) {
			acumulador=acumulador+datos[i]/datos.length;
		}
		String acu = Double.toString(acumulador);
		return acu;
	}

	//Metodo para calcular el numero de notas por debajo del promedio
	public String notasMenoresProm1929() {
		int minimo=0;
		for (int i=0 ; i<datos.length ; i++) {
			if (datos[i] <= Double.parseDouble(generarPromedio1929()) ) {
				minimo++;
			}
		}
		String min = String.valueOf(minimo);
		return min;
	}

	//Metodo que calcula las notas por encima del promedio
	public String notasMayoresProm1929() {
		int maximo = 0;
		for (int i = 0; i < datos.length; i++) {
			if(datos[i]>=Double.parseDouble(generarPromedio1929())) {
				maximo++;
			}
		}
		String max = String.valueOf(maximo);
		return max;
	}

	//Metodo que calcula las notas que perdio
	public String notasPerdidas1929() {
		int acumulador =0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i]<2) {
				acumulador++;
			}
		}
		String acu = String.valueOf(acumulador);
		return acu;
	}

	//Metodo que calcula las notas que esta en habilitacion
	public String notasHabilitacion1929() {
		int acumulador = 0 ;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i]>=2 && datos[i]<3) {
				acumulador++;
			}
		}
		String acu = String.valueOf(acumulador);
		return acu;
	}

	//Metodo que calcula las notas que fueron aprobadas por encima de 3
	public String notasAprobadas1929() {
		int acumulador = 0 ;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i]>=3) {
				acumulador++;
			}
		}
		String acu = String.valueOf(acumulador);
		return acu;
	}

	//Desarrollar un m?todo para generar un cadena de caracteres donde muestre el arreglo
	public String imprimirArreglo1929() {
		String cadena = "";
		for (int i = 0; i < datos.length; i++) {
			cadena += "Dato No." + (i+1) + " : " + datos[i] + "\n";
		}
		return cadena;
	}







}
