package Vista;

import Vista.Runner1929;

import javax.swing.JOptionPane;

import Modelo.FuncionesTrigonometricas1929;
import Modelo.imc21929;
import Modelo.Senohiperbolico1929;
public class Runnerprincipal1929 {
	public void menu2() {
		boolean continuar = true;
		do  {
			
		String msj = JOptionPane.showInputDialog(null,"<< Menu Principal>>"+
																							      "\n1 . Indice de masa corporal"+
																							      "\n2 . Funciones trigonometricas"+
																							      "\n3 . Seno Hiperbolico"+
																							      "\n4 . Alcancia"+
																							      "\n5 . salir del menu"+
																							      "\ndigite una opcion :  ");
								
								int opc = Integer.parseInt(msj);
								
								switch (opc) {
								
								case 1 :
								JOptionPane.showMessageDialog( null, "ingreso al menu del IMC : ");
								Runnerimc1929 Imc2 = new Runnerimc1929();
								Runnerimc1929.ingresarDatos();
								break;
								case 2 :
								JOptionPane.showMessageDialog(null, "ingreso al menu de las funciones trigonometricas : ");
								Runner1929 runner = new Runner1929();
								runner.menu1929();

								break;
								case 3 :
									JOptionPane.showMessageDialog(null, "ingreso al menu del seno hiperbolico  : ");
									RunnerSenohiperbolico runner4 = new RunnerSenohiperbolico();
									runner4.menu41929();

								break;
								case 4 :
									JOptionPane.showMessageDialog(null, "ingreso al menu de la Alcancia : ");
									RunnerAlcancia runner2 = new RunnerAlcancia();
									RunnerAlcancia.Menu31929();

								break;
								case 5 :
									JOptionPane.showConfirmDialog(null, "fin del programa  ");
									continuar = false;
								break;
								default:JOptionPane.showConfirmDialog(null, "el valor no corresponde a ninguna opcio del menu ");
								}
			}while(continuar);					
	
		}
	public static void main(String[] args) {
		Runnerprincipal1929 runnerp= new Runnerprincipal1929();
		runnerp.menu2();
	
		 
		}
}
