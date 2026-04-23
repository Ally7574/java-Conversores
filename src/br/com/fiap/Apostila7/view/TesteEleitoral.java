package br.com.fiap.Apostila7.view;

import javax.swing.*;

public class TesteEleitoral {
    public static void main(String[] args) {

        String p1 = JOptionPane.showInputDialog("nome da primeira pessoa: ");
        int idade1 = Integer.parseInt(JOptionPane.showInputDialog("quantos anos a primeira pessoa tem: "));

        if (idade1 < 16) {
            JOptionPane.showMessageDialog(null, p1 + " é não eleitor (abaixo de 16 anos)");
        } else if (idade1 == 16 || idade1 == 17 || idade1 >= 66) {
            JOptionPane.showMessageDialog(null, p1 + " é eleitor facultativo (16 , 17 anos ou maior que 65 anos)");
        } else if (idade1 >= 18 || idade1 <= 65) {
            JOptionPane.showMessageDialog(null, p1 + " é eleitor obrigatório (entre 18 e 65 anos)");
        }

        String p2 = JOptionPane.showInputDialog("nome da segunda pessoa: ");
        int idade2 = Integer.parseInt(JOptionPane.showInputDialog("quantos anos a segunda pessoa tem: "));

        if (idade2 < 16) {
            JOptionPane.showMessageDialog(null, p2 + " é não eleitor (abaixo de 16 anos)");
        } else if (idade2 == 16 || idade2 == 17 || idade2 >= 66) {
            JOptionPane.showMessageDialog(null, p2 + " é eleitor facultativo (16 , 17 anos ou maior que 65 anos)");
        } else if (idade2 >= 18 || idade2 <= 65) {
            JOptionPane.showMessageDialog(null, p2 +  " é eleitor obrigatório (entre 18 e 65 anos)");
        }


        String p3 = JOptionPane.showInputDialog("nome da terceira pessoa: ");
        int idade3 = Integer.parseInt(JOptionPane.showInputDialog("quantos anos a terceira pessoa tem: "));

        if (idade3 < 16) {
            JOptionPane.showMessageDialog(null, p3 + " é não eleitor (abaixo de 16 anos)");
        } else if (idade3 == 16 || idade3 == 17 || idade3 >= 66) {
            JOptionPane.showMessageDialog(null, p3 + " é eleitor facultativo (16 , 17 anos ou maior que 65 anos)");
        } else if (idade3 >= 18 || idade3 <= 65) {
            JOptionPane.showMessageDialog(null, p3 +  " é eleitor obrigatório (entre 18 e 65 anos)");
        }




    }
}
