package br.com.fiap.Apostila7.view;

import javax.swing.*;

public class ExemploCondicao {
    public static void main(String[] args) {

        String alunos = JOptionPane.showInputDialog("quantos alunos estão na sala");
        double ip = Double.parseDouble(alunos);

        double real = ip % 10;

        if (real == 0){
            JOptionPane.showMessageDialog(null,"é possivel fazer um trabalho em dupla");
        } else
            JOptionPane.showMessageDialog(null,"não é possivel fazer a atividade em dupla");
    }
}
