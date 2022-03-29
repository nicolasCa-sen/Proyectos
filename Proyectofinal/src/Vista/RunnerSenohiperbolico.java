package Vista;

import Modelo.Senohiperbolico1929;

import javax.swing.JOptionPane;

public class RunnerSenohiperbolico {
	
private Senohiperbolico1929 senohiperbolico;
	

	public RunnerSenohiperbolico() {
		senohiperbolico = new Senohiperbolico1929();
	}
	
	public Senohiperbolico1929 getSenohiperbolico() {
		return senohiperbolico;
	}

	public void setSenohiperbolico(Senohiperbolico1929 senohiperbolico) {
		this.senohiperbolico = senohiperbolico;
	}
	public void menu41929() {
		
		int opciones1929 = 0;
		double angulo1929 = 0; 
		int nuevo1929 = 0;
		double conteo1929 = 0;
		
		do {
			opciones1929=Integer.parseInt(JOptionPane.showInputDialog(
		    "Menu \n"
					+ "1. Ingresar Angulo y conteo  (x)\n"
					+ "2. Seno Hiperbolico(x)\n"
					+ "3. Ingresar Otro Angulo y conteo \n"
					+ "4. Salir del Menú\n"));

					
			switch (opciones1929) {
			case 1:
				if (nuevo1929 == 0) {
					
					angulo1929=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del angulo"));
					senohiperbolico.setAngulo(angulo1929);
					do {
						conteo1929=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del conteo"));
						senohiperbolico.setConteo(conteo1929);
						System.out.println();
						if(conteo1929>=20 && conteo1929<=25) {
							continuar2=false;		
						}else {
							JOptionPane.showMessageDialog(null, " el valor de conteo debe ser mayor o igual a 20 y menor o igal a 25 ");
						}
					}while (continuar2) ;
					nuevo1929 = 1;
				}else {
					JOptionPane.showMessageDialog(null, " ya hay un angulo y conteo ingresado ");
				}
				break;
			case 2:
				if(angulo1929!=0) {
					JOptionPane.showMessageDialog(null,"Seno Hiperbolico ("+senohiperbolico.getAngulo()+")= "+senohiperbolico.CalcularSeno1929());
				}
				else {
					JOptionPane.showMessageDialog(null, "El angulo es igual a 0,no valido, ingresa un valor nuevamente ");
				}
				JOptionPane.showMessageDialog(null,senohiperbolico.CalcularSeno1929());
				break;
			case 3:
				if (nuevo1929 ==1) {
					if(angulo1929!=0) {
						JOptionPane.showMessageDialog(null,"Seno ("+senohiperbolico.getAngulo()+")= "+senohiperbolico.CalcularSeno1929());
					}
					else {
						JOptionPane.showMessageDialog(null, "El angulo es igual a 0,no valido, ingresa un valor nuevamente ");
					}
					angulo1929=Double.parseDouble(JOptionPane.showInputDialog("Digite otro angulo"));
					senohiperbolico.setAngulo(angulo1929);
					conteo1929=Double.parseDouble(JOptionPane.showInputDialog("Digite otro valor del conteo"));
					senohiperbolico.setConteo(conteo1929);
				}else {
					JOptionPane.showMessageDialog(null, "ahora no puedes cambiar el valor del angulo y de conteo");
				}
				
				break;
			case 4:int salida =JOptionPane.showConfirmDialog(null,"¿desea salir del algoritmo?");
			if (salida==JOptionPane.YES_OPTION) {
				continuar=false;}
				break;
			default:JOptionPane.showMessageDialog(null, "Opcion no valida");
				break;
			}
			
		} while (continuar);
	}
		boolean continuar = true;
		boolean continuar2 = true;
	
	
}