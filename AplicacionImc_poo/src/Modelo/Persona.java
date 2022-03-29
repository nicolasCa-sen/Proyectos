package Modelo;

public class Persona {
	//Constantes 
	
	//Atributos
	
	private String nombre ;
	
	private String identificacion;
	
	private double peso;
	
	private double altura;
	
	private int edad;
	
	//Constructor 
	
	public Persona (String nombre , String identificacion , double peso , double altura, int edad) {
		this.nombre = nombre;
		this.identificacion = identificacion;
		this.peso = peso;
		this.altura = altura;
		this.edad=edad;
	}
	
	//Metodos
	//metodo get retorna el valor de los tributos
	
	//metodo que retorna el nombre de la persona
	public String getNombre() { 
		return this.nombre;
		}
	//metodo set , modificar o cambiar los valores de los atributos 
	//metodo que cambia o modificar el valor del nombre de la persona
	public void setNombre(String nombre) {
	this.nombre=  nombre;
	
		}
	public String getIdentificacion() { 
		return this.identificacion;	
		}	
	public void setIdentificacion(String identificacion) {
	this.identificacion=  identificacion;
	
		}
	public double getPeso() { 
		return this.peso;
		}
	public void setPeso(double peso) {
		this.peso=  peso;
		}
	public double getAltura () { 
		return this.altura;
		}	
	public void setAltura(double altura) {
	this.altura=  altura;
	
		}
	public double getedad () { 
		return this.edad;
		}	
	public void setedad(int edad) {
	this.edad=  edad;
	
		}
	//calcular el imc
	
	//clasificar imc
	
	//validar si un dato es positivo o no 
	
	//otro metodo para devolver una cadena con los datos de la persona 
	
	//pauete vista
	//crear una clase..... runner 
	//ejecutar la aplicacion ... crear metodo main
	//instanciar o crear un objeto de la clase persona
	//persona que tiene que crear :carlos perez , 9845623,peso,65.3,1.96
	// verificar si los datos son positivos o negativos 
	public double imc1 (){
		return peso/Math.pow(altura,2);
	
	}
	public int años (){
		return 2021-edad;
	
	}
	 public  String  clasificacionImc(){
		 double imc2= this.imc1();
         String msg = "";
         if (imc2<16.000) {
		    	msg = "  Delgadez severa ";
		    } else{
		          if (imc2>=16.00 &imc2<=16.99) {
		    msg = "Delgadez moderada";
		   
		              }else{
		                    if (imc2>=17.00 & imc2<=18.49) {
		              msg = " Delgadez aceptable";
		                        }else{ 
		                              if (imc2>=18.50 & imc2<=24.99) {
		    	                 msg = "Peso normal";
		                                 }else{
		                                       if (imc2>=25.00 & imc2<=29.99) {
		    	                         msg =  " Sobrepeso";
		                                            }else{ 
		                                                  if (imc2>=30.00 & imc2<=34.99) {
		                    	                    msg =  "Obesidad tipo I";
		                                                    }else {
		                                                          if (imc2>=35.00 & imc2<=39.99) {
		    	                                            msg =  "Obesidad tipo II";
		                                                              }else{ 
  		                                                                    if (imc2>40.00){
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
}
