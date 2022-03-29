package Vista;

import Modelo.Arreglo;
import Vista.MainWindow;
import javax.swing.*;


public class Runner {


    public static void main(String[] args) {
        //Runner runner = new Runner();
        //runner.ingrsarMostrarDatos();
        MainWindow vista = new MainWindow();
        vista.vista();
        vista.setVisible(true);

    }
}
