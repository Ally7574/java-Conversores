package br.com.fiap.Apostila7.view;

import javax.swing.*;

public class ExemploCondicaoEncadeada {
    public static void main(String[] args) {
        String mediaFinal = JOptionPane.showInputDialog("qual é a sua média final?");
        double media = Double.parseDouble(mediaFinal);

        if (media < 4) {
            JOptionPane.showMessageDialog(null,"Retido");
        } else if (media >= 4 && media <= 5.9 ) {
            JOptionPane.showMessageDialog(null,"Exame");
        } else if (media >= 6) {
            JOptionPane.showMessageDialog(null,"Aprovado");
        }
    }
}
