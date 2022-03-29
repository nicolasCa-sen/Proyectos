package Vista;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import Modelo.Arreglo1929;
public class Runner1929 {

	private Arreglo1929 arreglo;

	private JTextArea area;

	private JScrollPane scroll;


	public Runner1929() {
		this.area = new JTextArea(20,60);
		this.scroll = new JScrollPane(area);
		this.arreglo = null;
	}

	public Arreglo1929 getArreglo() {
		return arreglo;
	}

	public void setArreglo1929(Arreglo1929 arreglo) {
		this.arreglo = arreglo;
	}



	//Desarrollar un m?todo para ingresar los datos al arrreglo (Numeros aleatorios entre [1-100000]
	public void generarAleatorios(Arreglo1929 arreglo) {
		for (int i = 0; i <arreglo.getDatos1929().length; i++) {
			arreglo.setDatos1929(i,(int)(Math.random()*10000+1));
		}
	}
	public void ingresarMostrarDatos1929() {
		int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantida de Datos"));
		if (tamanho>0) {
			Arreglo1929 arreglo = new Arreglo1929(tamanho);
			area.setEditable(false);
			generarAleatorios(arreglo);

			for (int i=1;i<2;i++) {

				area.append("\n" + "             Arreglo datos Usuario\n\n"+"\n");

        	/*area.append(arreglo.toString());
        	area.append("\n	\n	Arreglo metodo del Usuario \n \n" + arreglo.imprimirArreglo1929());

        	arreglo.intercambioAsc_1929();
    		area.append("\nArreglo de ordenamiento de forma creciente: \n" + arreglo.imprimirArreglo1929());
    		arreglo.intercambioDesc_1929();
    		area.append("\nArreglo de ordenamiento de forma decreciente: \n" + arreglo.imprimirArreglo1929());
    		arreglo.burbuja_1929();
    		area.append("\nArreglo organizadas formato burbuja de forma creciente: \n" + arreglo.imprimirArreglo1929());*/

				arreglo.ordenamientoShell1929();
				area.append("\nArreglo organizadas formato shell de forma creciente: \n\n" + arreglo.imprimirArreglo1929());

				area.append("\n Nota mayor: ");
				area.append(arreglo.generarMAX1929()+"\n");

				area.append("\n Nota menor: ");
				area.append(arreglo.generarMin1929()+"\n");

				area.append("\n Promedio: ");
				area.append(arreglo.generarPromedio1929()+"\n");

				area.append("\n Notas mayores al Promedio: ");
				area.append(arreglo.notasMayoresProm1929()+"\n");

				area.append("\n Notas menores al Promedio: ");
				area.append(arreglo.notasMenoresProm1929()+"\n");

				area.append("\n Notas perdidas: ");
				area.append(arreglo.notasPerdidas1929()+"\n");

				area.append("\n Notas en habilitacion: ");
				area.append(arreglo.notasHabilitacion1929()+"\n");

				area.append("\n Notas aprobadas: ");
				area.append(arreglo.notasAprobadas1929()+"\n");



				JOptionPane.showMessageDialog(null,scroll) ;

			}
			for (int i=0;i<20;i++) {
				int accion = Integer.parseInt(JOptionPane.showInputDialog("      Que desea realizar"
						+ "\nOpcion 1: Buscar un dato"
						+ "\nOpcion 2: Modificar un dato"
						+ "\nOpcion 3: Eliminar un dato"
						+ "\nOpcion 4: Ver datos"
						+ "\nOpcion 5: Salir"));
				if (accion == 1 ) {
					Double busqueda = Double.valueOf(JOptionPane.showInputDialog("Digite el dato que desea buscar"));
					if (arreglo.busquedaElemento1929(busqueda) == -1) {
						area.append("\n***************************************");
						area.append("\nEl elemento " + busqueda + " No esta" + "\n");
						JOptionPane.showMessageDialog(null,scroll) ;
					}else {
						area.append("\n***************************************");
						area.append("\n El dato: " + busqueda + " Si esta");
						area.append("\n El numero esta en la posicion: ");
						area.append(arreglo.busquedaElemento1929(busqueda)+"\n");
						area.append(" La cantidad de datos con ese valor son: ");
						area.append(arreglo.cantidadElementos1929(busqueda)+"\n");
						JOptionPane.showMessageDialog(null,scroll) ;
					}
				}
				else if (accion == 2 ) {
					int elem = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que desea modificar"));
					if(elem>0 && elem<tamanho) {
						int cambio = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo valor"));
						arreglo.modificarDato(elem, cambio);
						area.append("\n***************************************");
						area.append("\nDato: " + elem + "  Fue modificado al valor de: " + cambio + "\n");
						area.append(arreglo.imprimirArreglo1929());
						JOptionPane.showMessageDialog(null,scroll) ;
					}
				}else if(accion == 3) {

					int elem2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero que desea eliminar"));
					area.append("\n***************************************");
					area.append("\nDato: " + elem2 + "  Fue eliminado\n");
					arreglo.eliminarDato(elem2);
					area.append(arreglo.imprimirArreglo1929());
					JOptionPane.showMessageDialog(null,scroll) ;
				}else if(accion == 4){
					area.append("\n***************************************");
					area.append("\nDatos actuales\n");
					area.append(arreglo.imprimirArreglo1929());
					JOptionPane.showMessageDialog(null,scroll) ;
				}else if(accion == 5){
					JOptionPane.showMessageDialog(null, "Adios");
					break;
				}else {
					JOptionPane.showMessageDialog(null, "Ingrese un valor valido");
				}

			}
		}else {
			JOptionPane.showMessageDialog(null, "Ingrese una amplitud del arreglo mayor a 0");
		}
	}
    /*public String mostrarBusqueda2() {
    		arreglo.burbuja_1929();;
    		area.append("....... " + arreglo.toString());
    		area.append("\n\nBusqueda Binaria :\n" + mostrarBusquedaBinaria());
    		JOptionPane.showMessageDialog(null,scroll);

    }*/
	public static void main(String[] args) {
		Runner1929 runner = new Runner1929();
		runner.ingresarMostrarDatos1929();

	}


}







