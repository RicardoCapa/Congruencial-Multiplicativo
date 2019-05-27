/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import javax.swing.JOptionPane;
import static simulacion.Congruencial_Multiplicativo.validarSemilla;

/**
 *
 * @author ricardo
 */
public class Congruencial_Multiplicativo_Binario {

    public static boolean validarSemilla(double semilla) {
        if (semilla % 2 != 0) {
            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        String cad = "";
        double aux = 0;

        //Validar Semilla
        double Xo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la semilla "));
        while (!validarSemilla(Xo)) {
            JOptionPane.showMessageDialog(null, " --> El valor de la semilla tiene que ser un muero impar no divisible para 5 ");
            Xo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la semilla debe ser un numero impar no divsible para 5"));
        }
        
        //Valor de t para calcular el valor de a
        int t = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de t para deternimar el valor de a"));

        //valor de a
        int a = (8 * t) + 3;

        //exponente para el valor de m (modulo)
        int d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de d para deternimar el valor de m"));

        int m = (int) Math.pow(2, d);

        for (int i = 0; i < m; i++) {
            aux = (Xo * a) % m;

            cad = cad + "|" + i + "|"
                    + "  |   " + aux + "   |  "
                    + "\n";
            Xo = aux;
        }

        JOptionPane.showMessageDialog(null, "El resultado es:" + "\n"
                + "|n|" + "  | Xo  |"
                + "\n" + cad);
    }
}
