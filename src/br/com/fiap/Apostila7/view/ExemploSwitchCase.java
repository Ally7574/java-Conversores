package br.com.fiap.Apostila7.view;

import javax.swing.*;

public class ExemploSwitchCase {
    public static void main(String[] args) {

        String num1 = JOptionPane.showInputDialog("digite o primeiro numero");
        double primeiro = Double.parseDouble(num1);

        String num2 = JOptionPane.showInputDialog("digite o segundo numero");
        double segundo = Double.parseDouble(num2);

        String caso = JOptionPane.showInputDialog("digite a operação (1:soma)(2:divisão)(3:multiplicação)(4:subtração)");
        int operacao = Integer.parseInt(caso);

        switch (operacao) {
            case 1: {
                double resultado = primeiro + segundo;
                JOptionPane.showMessageDialog(null,"resultado: " + resultado);
                break;
            }
            case 2: {
                double resultado = primeiro / segundo;
                JOptionPane.showMessageDialog(null,"resultado: " + resultado);
                break;
            }
            case 3: {
                double resultado = primeiro * segundo;
                JOptionPane.showMessageDialog(null,"resultado: " + resultado);
                break;
            }
            case 4: {
                double resultado = primeiro - segundo;
                JOptionPane.showMessageDialog(null,"resultado: " + resultado);
                break;
            }

        }
    }
}
