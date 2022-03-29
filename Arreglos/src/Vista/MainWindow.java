package Vista;

import Modelo.Arreglo;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    private Arreglo arreglo;
    private JPanel panel;
    //private JTextArea txt;
    private JLabel txt;

    public MainWindow()  {
        this.setTitle("HOLA");
        setSize(new Dimension(700,700));
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void beginComponents(){
        panel = new JPanel();
        panel.setSize(new Dimension(800,800));
        panel.setBackground(new Color(71, 104, 153));
        txt= new JLabel(  );
        panel.add(txt);
        //add(panel);
        JScrollPane scroll = new JScrollPane(panel);
        scroll.setVisible(true);
        scroll.setBounds(40,60,100,100);
        add(scroll);
    }

    public void vista(){
        beginComponents();
    }

    public Arreglo getArreglo() {
        return arreglo;
    }

    public void setArreglo(Arreglo arreglo) {
        this.arreglo = arreglo;
    }
    public void ingresarMostrarDatos(){
        //arreglo.setDatos(0,-9.83);
        //arreglo.setDatos(10,275.8);
        arreglo.datosRandom();
        arreglo.toString();
    }

}

