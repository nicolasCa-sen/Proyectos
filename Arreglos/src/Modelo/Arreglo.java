package Modelo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arreglo {

    private final static int TAMANHO = 10;

    private double[] datos;

    public Arreglo() {
        datos = new double[TAMANHO];
        //datos[4] = 89.5;
        //datos[8] = -0.853;

    }

    public double[] getDatos() {
        return datos;
    }

    public void setDatos(int indice, double datos) {
        this.datos[indice] = datos;
    }


    @Override
    public String toString() {

        //for (int i = 0; i < datos.length; i++) {
          //  datos[i] = Math.random() * 100000 + 1;

       // }

        return "Arreglo [datos=" + Arrays.toString(datos) + "]";

    }

    public void datosRandom() {

        /*  int i=0;
        do {
        int numero;
        datos[i]= numero = (int)(Math.random()*10+1);
        i++;
        }while (i==9);*/

        for (int i = 0; i < datos.length; i++) {
            datos[i] = Math.random() * 100000 + 1;

        }

    }


}

