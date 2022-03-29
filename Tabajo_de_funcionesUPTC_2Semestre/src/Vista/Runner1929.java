package Vista;
import java.util.Scanner;
import Modelo.Seno_x;
import Modelo.coseno_x;
import Modelo.Factorial;
public class Runner1929 {
	public static void main (String[] args) {
		
		double x1929,y1929,z1929,w1929;
		Seno_x seno=new Seno_x();
		Scanner valor= new Scanner (System.in);
		System.out.println("Digite valor Grados =  ");
		double g=valor.nextDouble();
		x1929=g*3.141592/180.0;
		y1929=seno.senx(x1929);
		System.out.println("sen ("+ g +") =  "+ y1929);
		coseno_x coseno = new coseno_x();
		x1929=g*3.141592/180.0;
		w1929=coseno.cosx(x1929);
		System.out.println("Cos ("+ g +") =  "+ w1929);
		System.out.println("Tan ("+ g +") =  "+ y1929/w1929);
		System.out.println("Ctan ("+ g +") =  "+ w1929/y1929);
		System.out.println("Sec ("+ g +") =  "+ 1/w1929);
		System.out.println("Ssec ("+ g +") =  "+ 1/y1929);
		
	}			
}	


