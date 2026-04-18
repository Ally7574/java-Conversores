package br.com.fiap.Apostila7.view;

import javax.swing.*;

public class Terminal {
    static void main() {

        String numero1 = JOptionPane.showInputDialog("digite um numero");
        int n1 = Integer.parseInt(numero1);

        String funcao = JOptionPane.showInputDialog("soma=1/div=2/mult=3/sub=4");
        int f = Integer.parseInt(funcao);


        String numero2 = JOptionPane.showInputDialog("digite outro numero");
        int n2 = Integer.parseInt(numero2);

        if (f == 1) {
            int soma = n1 + n2;
            System.out.println("resultado: " + soma);
        } else if (f == 2) {
            int div = n1 / n2;
            System.out.println("resultado: " + div);
        } else if (f == 3) {
            int mult = n1 * n2;
            System.out.println("resultado: " + mult);
        } else if (f == 4) {
            int sub = n1 - n2;
            System.out.println("resultado: " + sub);
        }

    }
}
