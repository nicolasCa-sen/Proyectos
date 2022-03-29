package Vista;

import Modelo.Euler;
import javax.swing.JOptionPane;

public class R_Euler {

    private static Euler S_euler;

    public R_Euler() {
        S_euler = new Euler();
    }

    public Euler geteuler() {
        return S_euler;
    }

    public void seteuler(Euler S_euler) {
        this.S_euler = S_euler;
    }

    public static void Menu_Euler() {


        double V_euler = -8.5;



        System.out.println("el valor del exponente es :" + V_euler);


    }

    public static void main(String[] args) {
        R_Euler runnere = new R_Euler();
        runnere.Menu_Euler();

    }
}