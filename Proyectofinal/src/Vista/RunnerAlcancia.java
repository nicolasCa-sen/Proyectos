package Vista;

import Modelo.Alcancia1929;
import javax.swing.JOptionPane;

public class RunnerAlcancia {

    
    private static Alcancia1929 alc1929; 
	
    
	public RunnerAlcancia() {
		alc1929 = new Alcancia1929();
	}
	
	

	public static Alcancia1929 getAlcancia1929() {
		return alc1929;
	}



	public static void setAlcancia1929(Alcancia1929 alcancia1929) {
		RunnerAlcancia.alc1929 = alcancia1929;
	}



	public static void Menu31929() {
		int opcion=0,monedaIngresada=0;
		int monedadocientos=0,monedaquinientos=0,monedaMil=0,total=0;
		boolean continuar = true;
		boolean nueva = true;
		
		do {
			opcion=Integer.parseInt(JOptionPane.showInputDialog("1.Ingresar monedas \n"
											  +"2.Mostrar monedas Insertadas  \n"
											  +"3.Total de dinero ahorrado \n"
											  +"4.Romper la alcancia\n"
											  +"5.Crear una nueva alcancia\n"
											  +"6.Salir"));
			switch (opcion) {
			    case 1:{
			    	if(nueva) {
			    		monedaIngresada=Integer.parseInt(JOptionPane.showInputDialog("1.Moneda de $200   \n2.Moneda de $500     \n3.Moneda de $1000"));
					    switch(monedaIngresada) {
						       case 1:{
						    	   monedadocientos=monedadocientos+1;
						    	   alc1929.setMonedadocientos(monedadocientos);
						    	   break;
						       }
						       case 2:{
						    	   monedaquinientos=monedaquinientos+1;
						    	   alc1929.setMonedaquinientos(monedaquinientos);
						           break;	
						        }
						        case 3:{
						        	monedaMil=monedaMil+1;
						        	alc1929.setMonedaMil(monedaMil);
						        	break;
						        }
						        default:{
						        	JOptionPane.showMessageDialog(null,"Opcion incorrecta");
						        	break;
						        }
						 }
			    	}
			    	else {
			    		JOptionPane.showMessageDialog(null,"Has roto tu alcancia, para ingresar Monedas, Cree otra");
			    	}
			    	
			    }
				break;
                case 2:{
                	JOptionPane.showMessageDialog(null,"El total de monedas de $200 ingresadas fueron "+alc1929.getMonedadocientos()+"\n"
                										+"El total de monedas de $500 ingresadas fueron "+alc1929.getMonedaquinientos()+"\n"
                										+"El total de monedas de $1000 ingresadas fueron "+alc1929.getMonedaMil());
				break;
			    }
                case 3:{
                	JOptionPane.showMessageDialog(null,"El valor total de dinero en la alcancia es de: "+alc1929.calcularTotal());
				break;
			    }
                case 4:{
                	JOptionPane.showMessageDialog(null,"El valor total de dinero en la alcancia es de: "+alc1929.calcularTotal()+"\n"
                									+ "Su alcancia no tiene nada, para ingresar mas Monedas tiene que crear otra");
                	alc1929.setMonedadocientos(0);
                	alc1929.setMonedaquinientos(0);
                	alc1929.setMonedaMil(0);
                	nueva = false; 
                break;	
                }
                case 5:{
                	nueva =  true;
                	JOptionPane.showMessageDialog(null,"Haz Creado una nueva alcancia");
                break;
                }
                case 6:{
                	int salir=JOptionPane.showConfirmDialog(null, "Deseas salir ","SALIR",JOptionPane.YES_NO_OPTION);
    				if(salir==0) {
    					JOptionPane.showMessageDialog(null,"Gracias por usar nuestro algoritmo");
    					continuar=false;
    				}
                	break;
                }
			    default:{
			    	JOptionPane.showMessageDialog(null,"Opcion incorrecta");
				break;
			    }
		    }
		}while (continuar);
	}
  }