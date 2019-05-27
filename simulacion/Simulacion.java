/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardo
 */
public class Simulacion {

    /**
     * @param args the command line arguments
     */
    public static boolean esPrimo(double numero) {
        int contador = 0;
        for (int i = 0; i <= numero; i++) {
            if ((numero % i) == 0) {
                contador++;
            }

        }
        if (contador <= 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean validarA(double a) {

        if (a % 2 != 0 && a % 3 != 0 && a % 5 != 0) {

            return true;
        } else {

            return false;
        }
    }

    public static boolean validarC(double c) {
        if (c % 2 != 0) {
            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        String cad = "";
        double r = 0;
        double aux = 0;

        double sistemaBinario = Math.pow(2, 32);
        double Xo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la semilla "));
        double a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el multiplicador debe ser un numero impar no divsible para 3 y 5"));
        while (!validarA(a)) {
            JOptionPane.showMessageDialog(null, " --> El valor de a no es correcto ");
            a = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el multiplicador debe ser un numero impar no divsible para 3 y 5"));
        }
        //Comprobar el valor de a
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el constante aditiva"));

        //Comprobar el valor de m
        int m = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el modulo (debe ser un numero primo)"));
        while (!esPrimo(m) || m > sistemaBinario) {
            JOptionPane.showMessageDialog(null, " --> El valor de m debe ser primo");
            m = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el modulo (debe ser un numero primo)"));
        }

        if (Xo > 0 && a > 0 && c > 0
                && m > a && m > Xo && m > c) {
            for (int i = 0; i < m; i++) {

                r = ((Xo * a) + c) / m;
                aux = ((Xo * a) + c) % m;

                long iPart = (long) r;
                double fPart = r - iPart;

                //Cadena para concatenae Resultados
                cad = cad + "|" + i + "|"
                        + "  | " + a + " |"
                        + "  |   " + aux + "   |  "
                        + "|     " + r + "      |"
                        + "|   " + fPart + "   |"
                        + "\n";

                //Presentacion de Resultados
                a = ((Xo * a) + c) % m;

            }
            JOptionPane.showMessageDialog(null, "El resultado es:" + "\n"
                    + "|n|" + "  | Xo  |"
                    + "  | Xn+1 |" + "  |((a*xo)+c)/m|"
                    + "  |Num Aleatorios|"
                    + "\n" + cad);
            
        } else {
            JOptionPane.showMessageDialog(null, "Valores no validos");
        }

    }
}
