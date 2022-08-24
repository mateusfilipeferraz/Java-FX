/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio.repita;

import javax.print.attribute.standard.Media;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus Ferraz
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        int n, s = 0, cont = 0;
        int contPar = 0, contImpar = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>informe um número:<br><em> (o valor '0' interompe)</em></html>"));
            if (n % 2 == 0) {
                contPar++;
            }
            else if (n % 2 == 1) {
                contImpar++;

            }
            cont++;
            s+=n;
            double media =s/cont;
        } while (n != 0);

        JOptionPane.showInternalMessageDialog(null, "<html>Resultado final <br><hr>"
                + "<br>Somatorio vale " + s + "<html><br> A quantidade de Números digitados foi " + cont
                + "<html><br> A média dos Números digitados foi " +(Media)
                + "<html><br>Quantidade número Pares " + contPar
                + "<html><br>Quantidade número Impares  " + contImpar);

    }
}
