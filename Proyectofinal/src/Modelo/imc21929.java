package Modelo;

import java.util.Scanner;

import javax.swing.JOptionPane;
public class imc21929
{
    
    //metodo 
    
    //metodo que retorne un dato de tipo real que corresponda al indice de masa corporal, tiene 2 parametros 
    public static double calcularImc(double pesoKg, double alturaMt){
        double imc;
        imc = (pesoKg/Math.pow (alturaMt,2));
        return imc;
    }
    
     //metodo que retorne un dato de tipo cadena que corresponda a la clasificación, tiene 1 parametro el cual es imc
     public static String  clasificacionImc(double imc ){
         String msg = "";
         if (imc<16.000) {
		    	msg = "  Delgadez severa ";
		    } else{
		          if (imc>=16.00 & imc<=16.99) {
		    msg = "Delgadez moderada";
		   
		              }else{
		                    if (imc>=17.00 & imc<=18.49) {
		              msg = " Delgadez aceptable";
		                        }else{ 
		                              if (imc>=18.50 & imc<=24.99) {
		    	                 msg = "Peso normal";
		                                 }else{
		                                       if (imc>=25.00 & imc<=29.99) {
		    	                         msg =  " Sobrepeso";
		                                            }else{ 
		                                                  if (imc>=30.00 & imc<=34.99) {
		                    	                    msg =  "Obesidad tipo I";
		                                                    }else {
		                                                          if (imc>=35.00 & imc<=39.99) {
		    	                                            msg =  "Obesidad tipo II";
		                                                              }else{ 
  		                                                                    if (imc>40.00){
		    	                                                      msg =  "Obesidad tipo III";
		                                                                    }
		                                                              }
		                                                    }
		                                            }
		                                 }
		                        }
		              }
		    }
	  return msg;
     }
     
    //metodo que retome verdadero si es positivo falso si no lo es, tiene parametro que es un dato que se va avalidar
    public static boolean validarDato(double numero){
        boolean dato;
        if (numero>=0){
            dato=true;
        }else{ dato=false;
        }
        return dato;
    }
    //metodo que no retorne valor y que no tiene parametros

 
}//fin del proceso