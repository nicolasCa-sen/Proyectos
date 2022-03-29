package Vista;

import Modelo.FuncionesTrigonometricas;
import javax.swing.JOptionPane;

public class Runner {

	//Atributo
	
	private FuncionesTrigonometricas funcionestrigonometricas;
	
	//constructor 
	public Runner() {
		funcionestrigonometricas = new FuncionesTrigonometricas();
	}
	
	public FuncionesTrigonometricas getFuncionestrigonometricas() {
		return funcionestrigonometricas;
	}

	public void setFuncionestrigonometricas(FuncionesTrigonometricas funcionestrigonometricas) {
		this.funcionestrigonometricas = funcionestrigonometricas;
	}
	public void menu() {
		boolean continuar = true;
		do  {
			
		
								String msj = JOptionPane.showInputDialog(null,"<< Menu >>"+
																							      "\n1 . ingresar Angulo"+
																							      "\n2 . seno (x)"+
																							      "\n3 . coseno(x)"+
																							      "\n4 . tangente(x)"+
																							      "\n5 . salir del menu"+
																							      "\ndigite una opcion :  ");
								
								int opc = Integer.parseInt(msj);
								
								switch (opc) {
								
								case 1 :
									msj = JOptionPane.showInputDialog(null, "ingrese el Angulo : ");
									double angulo = Double.parseDouble(msj);
									funcionestrigonometricas.setAngulo(angulo);
								break;
								case 2 :
									JOptionPane.showConfirmDialog(null, "el valor de x es :  ("+funcionestrigonometricas.getAngulo()+") y el valor de seno es  : "+funcionestrigonometricas.serieSeno());
								break;
								case 3 :
									JOptionPane.showConfirmDialog(null, "el valor de x es :  ("+funcionestrigonometricas.getAngulo()+") y el valor de seno es  : "+funcionestrigonometricas.serieCoseno());
								break;
								case 4 :
									JOptionPane.showConfirmDialog(null, "el valor de x es :  ("+funcionestrigonometricas.getAngulo()+") y el valor de seno es  : "+funcionestrigonometricas.tangente());
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
	Runner runner = new Runner();
	runner.menu();
	}
	
}
