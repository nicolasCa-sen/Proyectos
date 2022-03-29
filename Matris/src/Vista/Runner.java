package Vista;


import javax.swing.*;

import Modelo.Matriz;

import java.awt.*;


public class Runner {

    private Matriz matriz;

    private Matriz matriz2;

    private JTextArea area;

    private JScrollPane scroll;



    public Runner(){
        this.matriz =null;
        this.matriz2 = null;
        this.area = new JTextArea(30,60);
        this.scroll = new JScrollPane (area);
    }
 /*
    public Matriz getMatriz() {
        return matriz;
    }

    public void setMatriz(Matriz matriz) {
        this.matriz = matriz;
    }

    public Matriz getMatriz2() {
        return matriz2;
    }

    public void setMatriz2(Matriz matriz2) {
        this.matriz2 = matriz2;
    }

  */

    public int[][] ingresarDatos(int[][] matriz){
        for (int i=0;i<matriz.length;i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int dato = Integer.parseInt(JOptionPane.showInputDialog("Matriz A[ "+i+ "]["+j+"] :"));
                matriz[i][j] = dato;
            }
        }
        return matriz;
    }

    public void MostarDatos(){
        area.setEditable(false);
        int filas = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de filas de la matriz :"));
        int columnas = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de columnas de la matriz :"));
        matriz = new Matriz(filas,columnas);
        matriz2 = new Matriz(filas,columnas);
        //area.setBackground(Color.darkGray);
        area.append("Matriz por defecto  : \n"+  matriz.toString()+"\n"+"\n");
        area.append("\n");
        area.append("Matriz ordenada  : \n"+  matriz.impimirMatriz(matriz.getArray())+"\n"+"\n");
        matriz.setArray(ingresarDatos(matriz.getArray()));
        matriz2.setArray(ingresarDatos(matriz2.getArray()));

        area.append("matriz A: \n" + matriz.impimirMatriz(matriz.getArray())+"\n"+"\n");
        area.append("matriz B: \n" + matriz2.impimirMatriz(matriz2.getArray()) +"\n"+"\n");
        matriz.sumaMatriz(matriz.getArray(),matriz2.getArray());

        //area.append("suma de matrizes: \n" + matriz.sumarMatrices(); +"\n"+"\n");
        area.append("suma de Matriz A y B  : \n" + matriz.impimirMatriz( matriz.sumaMatriz(matriz.getArray(),matriz2.getArray())) );
        area.append("el total de datos negativos es: \n" + matriz.calcularDatosNegativos()+"\n"+"\n");
        area.append("los datos que son primos son : \n" + matriz.algoritmoSeleccion()+"\n"+"\n");

        JOptionPane.showMessageDialog(null,scroll);
    }

    public static void main(String[] args) {
        Runner runner = new Runner();
        runner.MostarDatos();
    }

}
