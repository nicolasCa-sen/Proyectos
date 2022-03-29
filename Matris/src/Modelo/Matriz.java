package Modelo;

import java.util.Arrays;

public class Matriz {

    //private final static int FILAS = 4;
    //private final static int COLUMNAS = 4;



    private int[][] array;

    public Matriz(int filas,int columnas ) {
        array = new int[filas][columnas];
    }


    public int[][] getArray() {
        return array;
    }

    public void setArray(int[][] dato) {
        this.array = dato;
    }

    @Override
    public String toString() {
        return "Matriz [array=" + Arrays.deepToString(array) + "]";
    }

    /*
    public String imprimirArreglo(){
        String cadena="";
        for (int i = 0; i < array.length; i++) {
            cadena +=  array[i][i]+"\n";
        }
        return cadena;
    }
    */

    public String impimirMatriz(int[][] matriz){
        String cadena="";
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz[i].length;j++){
                cadena += matriz[i][j]+" \t";
            }
            cadena += "\n";
        }
        return cadena;
    }

    public int calcularDatosNegativos(){
        int contadorNeg = 0;
        for(int i = 0;i<array.length;i++){
            for (int j = 0;j<array[i].length;j++){
                if (array[i][j]<0){
                    contadorNeg++;
                }
            }
        }
        return contadorNeg;
    }

    public boolean PRIMO(int num) {
        int contador = 0, auxiliar = 2;
        if (num <= 1) {
            return false;
        }
        while (auxiliar <= num){
            if (num % auxiliar == 0) {
                contador++;
            }
            if(contador > 1){
                return false;
            }
            auxiliar++;
        }
        return true;
    }

    public String algoritmoSeleccion() {
        String Msg = "";
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if((PRIMO(array[i][j]))){
                    Msg += "\n El dato con posicion [ "+i+" ][ "+j+" ] :  " +array[i][j]+ "  es un numero primo\n";
                    System.out.println("\n El dato con posicion [ "+i+" ][ "+j+" ] :" +array[i][j]+ "es un numero primo\n");
                }
            }

        }
        return Msg;
    }

    public int[][] sumaMatriz(int[][] matriz1 , int[][] matriz2) {
        int[][] matrizSuma = new int[array.length][array[0].length];
        int suma = 0;
        for (int y = 0; y < matriz1.length; y++) {
            for (int x = 0; x < matriz1[y].length; x++) {
                int numeroMatriz1 = matriz1[y][x];
                int numeroMatriz2 = matriz2[y][x];
                suma = numeroMatriz1 + numeroMatriz2;
                matrizSuma[y][x] = suma;
            }
        }
        return matrizSuma;
    }
}




