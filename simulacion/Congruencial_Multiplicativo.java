/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import java.util.Scanner;
import javax.swing.JOptionPane;
import static simulacion.Simulacion.validarA;

/**
 *
 * @author ricardo
 */
public class Congruencial_Multiplicativo {

    public static boolean validarSemilla(double semilla) {
        if (semilla % 2 != 0) {
            return true;
        } else {

            return false;
        }
    }

    public static void main(String[] args) {
        // Para decimal
        Object numeros[] = {3, 11, 13, 19, 21, 27, 29, 37, 53, 59, 61, 67, 69, 77, 83, 91};
        double aux = 0;

        //Validar la Semilla
        double Xo = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la semilla "));

        while (!validarSemilla(Xo) || Xo % 5 == 0) {
            JOptionPane.showMessageDialog(null, " --> El valor de la semilla tiene que ser un muero impar no divisible para 5 ");
            Xo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la semilla debe ser un numero impar no divsible para 5"));
        }

        String cad = "";

        //valor de a
        int t = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de t para deternimar el valor de a"));
        Object opcion = JOptionPane.showInputDialog(null, "seleccione el valor de p: ", "Elejir", JOptionPane.QUESTION_MESSAGE, null, numeros, numeros[0]);
        double a = (200 * t) + (Integer) (opcion);

        //modulo
        int m = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el modulo"));

        for (int i = 0; i < m; i++) {
            aux = (Xo * a) % m;

            cad = cad + "|" + i + "|"
                    + "  | " + Xo + " |"
                    + "  |   " + aux + "   |  "
                    + "\n";
            Xo = aux;
        }

        JOptionPane.showMessageDialog(null, "El resultado es:" + "\n"
                + "|n|" + "  | Xo  |"
                + "\n" + cad);
    }
}
