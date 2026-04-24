package br.com.fiap.Apostila7.view;

import javax.swing.*;

public class TesteEleitoral {
    public static void main(String[] args) {

        int eleitoresObrigatorios = 0;
        for (int i = 1; i < 4; i++) {

            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do eleitor" + i));
            if (idade < 16) {
                JOptionPane.showMessageDialog(null, "não eleitor");
            } else if (idade >= 18 && idade <= 65) {
                JOptionPane.showMessageDialog(null,"Eleitor obrigatorio");
                eleitoresObrigatorios ++;
            } else
                JOptionPane.showMessageDialog(null,"Eleitor facultativo");
        }
        JOptionPane.showMessageDialog(null,"eleitores obrigatorio: " + eleitoresObrigatorios);






    }
}
