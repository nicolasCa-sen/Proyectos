package Modelo;

public class Alcancia1929 {

		public int Monedadocientos1929;
		
		public int Monedaquinientos1929;
		
		public int Monedamil1929;
		
		
		public Alcancia1929() {
			this.Monedadocientos1929=0;
			this.Monedaquinientos1929=0;
			this.Monedamil1929=0;
		}

		public int getMonedadocientos() {
			return Monedadocientos1929;
		}

		public void setMonedadocientos(int monedadocientos) {
			this.Monedadocientos1929 = monedadocientos;
		}

		public int getMonedaquinientos() {
			return Monedaquinientos1929;
		}

		public void setMonedaquinientos(int monedaquinientos) {
			this.Monedaquinientos1929 = monedaquinientos;
		}

		public int getMonedaMil() {
			return Monedamil1929;
		}

		public void setMonedaMil(int monedaMil) {
			this.Monedamil1929 = monedaMil;
		}
		public int calcularTotal() {
			int total=(Monedadocientos1929*200)+(Monedaquinientos1929*500)+(Monedamil1929*1000);;
			return total;
		}
	}