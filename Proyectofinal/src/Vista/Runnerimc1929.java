package Vista;

import Modelo.imc21929;
import javax.swing.JOptionPane;

public class Runnerimc1929 {
    public static void ingresarDatos(){
    	imc21929 Imc2 = new imc21929();
        double  pesoKg, alturaMt, imc;
	    String nombreUsuario, idUsuario;
	   
	    nombreUsuario =  JOptionPane.showInputDialog(null,"Bienvenido, porfavor digite su nombre");
	    
	    idUsuario = JOptionPane.showInputDialog(null,"digite su identificación ");
	    
	    pesoKg = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite su peso en Kg ")) ;
	    if (imc21929.validarDato(pesoKg)){
	    	alturaMt = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite su altura en metros ")) ;
	        
	        if (imc21929.validarDato(alturaMt)){
	            //System.out.println ("Su imc es ");
	            imc = imc21929.calcularImc(pesoKg,alturaMt);
	            
	            JOptionPane.showMessageDialog(null, "Usuario : " + nombreUsuario
	            		+ "\nidentificado con numero :  "+ idUsuario
	            		+" \nSu imc es :" + imc 
	            		+"\nLa clasificación del IMC es : "+imc21929.clasificacionImc(imc));
	            
	           }else{
	        	   JOptionPane.showMessageDialog(null, "ERROR los datos registrados son incopatibles, TIENEN QUE SER POSITIVOS");
	          
	        }
	   }else{
		   JOptionPane.showMessageDialog(null, "ERROR los datos registrados son incopatibles, TIENEN QUE SER POSITIVOS");
	        
	 }
 }
}
