package prueba;

import java.util.Scanner;
public class imc2
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
    public static void ingresarDatos(){
    
            double  pesoKg, alturaMt, imc;
		    String nombreUsuario, idUsuario;
		   
		    Scanner sc = new Scanner(System.in); 
			System.out.println ("Bienvenido, porfavor digite su nombre");
			nombreUsuario=sc.nextLine ();
		    
		    System.out.println ("digite su identificación ");
		    idUsuario = sc.nextLine ();
		    		
		    System.out.println ("Digite su peso en Kg");
		    pesoKg = sc.nextDouble ();
		    if (validarDato(pesoKg)){
		         System.out.println ("Digite su altura en metros");
		         alturaMt= sc.nextDouble ();
		        if (validarDato(alturaMt)){
		            //System.out.println ("Su imc es ");
		            imc = calcularImc(pesoKg,alturaMt);
		            System.out.println( "Su imc es " + imc );
		            //
		            System.out.println (" La clasificación del IMC es: " + clasificacionImc(imc));
		           }else{
		               System.out.println ("ERROR los datos registrados son incopatibles, TIENEN QUE SER POSITIVOS");
		        }
		   }else{
		         System.out.println("ERROR los datos registrados son incopatibles, TIENEN QUE SER POSITIVOS");
		 }
		    
	 }
        
		   
    
    
	public static void main(String[] args) {
         //invocar metodo de ingresar datos
         ingresarDatos();

	}//fin de main
}//fin del proceso