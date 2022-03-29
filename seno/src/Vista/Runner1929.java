package Vista;

import Modelo.FuncionesTrigonometricas1929;
import javax.swing.JOptionPane;

public class Runner1929 {
	
private FuncionesTrigonometricas1929 funcionestrigonometricas;
	
	public Runner1929() {
		funcionestrigonometricas = new FuncionesTrigonometricas1929();
	}
	
	public FuncionesTrigonometricas1929 getFuncionestrigonometricas() {
		return funcionestrigonometricas;
	}

	public void setFuncionestrigonometricas(FuncionesTrigonometricas1929 funcionestrigonometricas) {
		this.funcionestrigonometricas = funcionestrigonometricas;
	}
	public void menu1929() {
		
		int opciones1929 = 0;
		double angulo1929 = 0; 
		int nuevo1929 = 0;
		
		do {
			opciones1929=Integer.parseInt(JOptionPane.showInputDialog(
		    "Menu \n"
					+ "1. Ingresar Angulo\n"
					+ "2. Seno(x)\n"
					+ "3. Coseno(x)\n"
					+ "4. Tangente(x)\n"
					+ "5. Cotangente(x)\n"
					+ "6. Secante(x)\n"
					+ "7. Cosecante(x)\n"
					+ "8. Ingresar Otro Angulo\n"
					+ "9. Salir del Menú\n"));

					
			switch (opciones1929) {
			case 1:
				if (nuevo1929 == 0) {
					if(angulo1929!=0) {
						JOptionPane.showMessageDialog(null,"Seno ("+funcionestrigonometricas.getAngulo()+")= "+funcionestrigonometricas.CalcularSeno1929());
					}
					else {
						JOptionPane.showMessageDialog(null, "El angulo es igual a 0,no valido, ingresa un valor nuevamente ");
					}
					angulo1929=Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del angulo"));
					funcionestrigonometricas.setAngulo(angulo1929);
					nuevo1929 = 1;
				}else {
					JOptionPane.showMessageDialog(null, " ya hay un angulo ingresado ");
				}
				
				break;
			case 2:
				if(angulo1929!=0) {
					JOptionPane.showMessageDialog(null,"Seno ("+funcionestrigonometricas.getAngulo()+")= "+funcionestrigonometricas.CalcularSeno1929());
				}
				else {
					JOptionPane.showMessageDialog(null, "El angulo es igual a 0,no valido, ingresa un valor nuevamente ");
				}
				JOptionPane.showMessageDialog(null,funcionestrigonometricas.CalcularSeno1929());
				break;
			case 3:
				if(angulo1929!=0) {
					JOptionPane.showMessageDialog(null,"Seno ("+funcionestrigonometricas.getAngulo()+")= "+funcionestrigonometricas.CalcularSeno1929());
				}
				else {
					JOptionPane.showMessageDialog(null, "El angulo es igual a 0,no valido, ingresa un valor nuevamente ");
				}
				JOptionPane.showMessageDialog(null,funcionestrigonometricas.CalcularCoseno1929());
				break;
			case 4:
				if(angulo1929!=0) {
					JOptionPane.showMessageDialog(null,"Seno ("+funcionestrigonometricas.getAngulo()+")= "+funcionestrigonometricas.CalcularSeno1929());
				}
				else {
					JOptionPane.showMessageDialog(null, "El angulo es igual a 0,no valido, ingresa un valor nuevamente ");
				}
				JOptionPane.showMessageDialog(null,funcionestrigonometricas.CalcularTangente1929());
				break;
			case 5:
				if(angulo1929!=0) {
					JOptionPane.showMessageDialog(null,"Seno ("+funcionestrigonometricas.getAngulo()+")= "+funcionestrigonometricas.CalcularSeno1929());
				}
				else {
					JOptionPane.showMessageDialog(null, "El angulo es igual a 0,no valido, ingresa un valor nuevamente ");
				}
				JOptionPane.showMessageDialog(null,funcionestrigonometricas.CalcularCotangente1929());
				break;
			case 6:
				if(angulo1929!=0) {
					JOptionPane.showMessageDialog(null,"Seno ("+funcionestrigonometricas.getAngulo()+")= "+funcionestrigonometricas.CalcularSeno1929());
				}
				else {
					JOptionPane.showMessageDialog(null, "El angulo es igual a 0,no valido, ingresa un valor nuevamente ");
				}
				JOptionPane.showMessageDialog(null,funcionestrigonometricas.CalcularSecante1929());
				break;
			case 7:
				if(angulo1929!=0) {
					JOptionPane.showMessageDialog(null,"Seno ("+funcionestrigonometricas.getAngulo()+")= "+funcionestrigonometricas.CalcularSeno1929());
				}
				else {
					JOptionPane.showMessageDialog(null, "El angulo es igual a 0,no valido, ingresa un valor nuevamente ");
				}
				JOptionPane.showMessageDialog(null,funcionestrigonometricas.CalcularCosecante1929());
				break;
			case 8:
				if (nuevo1929 ==1) {
					if(angulo1929!=0) {
						JOptionPane.showMessageDialog(null,"Seno ("+funcionestrigonometricas.getAngulo()+")= "+funcionestrigonometricas.CalcularSeno1929());
					}
					else {
						JOptionPane.showMessageDialog(null, "El angulo es igual a 0,no valido, ingresa un valor nuevamente ");
					}
					angulo1929=Double.parseDouble(JOptionPane.showInputDialog("Digite otro angulo"));
					funcionestrigonometricas.setAngulo(angulo1929);
				}else {
					JOptionPane.showMessageDialog(null, "ahora no puedes cambiar el valor del angulo");
				}
				
				break;
			case 9:int salida =JOptionPane.showConfirmDialog(null,"¿desea salir del algoritmo?");
			if (salida==JOptionPane.YES_OPTION) {
				continuar=false;}
				break;
			default:JOptionPane.showMessageDialog(null, "Opcion no valida");
				break;
			}
			
		} while (continuar);
	}
		boolean continuar = true;
	public static void main(String[] args) {
		
		Runner1929 runner1929 = new Runner1929();
		runner1929.menu1929();
		
	}
	
}