package br.com.fiap.Apostila7.view;

import javax.swing.*;

public class PrimeiraAtividade {
    public static void main(String[] args) {

        String p1 = JOptionPane.showInputDialog("nome da primeira pessoa: ");
        String p2 = JOptionPane.showInputDialog("nome da segunda pessoa: ");

        double peso1 = Double.parseDouble(JOptionPane.showInputDialog("peso da primeira pessoa: "));
        double peso2 = Double.parseDouble(JOptionPane.showInputDialog("peso da segunda pessoa: "));

        if (peso1 > peso2) {
            JOptionPane.showMessageDialog(null,p1 + " é mais pesada");
        } else if (peso1 < peso2) {
            JOptionPane.showMessageDialog(null, p2 + " é mais pesada");
        } else if (peso1 == peso2) {
            JOptionPane.showMessageDialog(null, "ambos possuem o mesmo peso");
        }

        double altura1 = Double.parseDouble(JOptionPane.showInputDialog("altura da primeira pessoa: "));
        double altura2 = Double.parseDouble(JOptionPane.showInputDialog("altura da segunda pessoa: "));

        if (altura1 > altura2) {
            JOptionPane.showMessageDialog(null, p1 + " é mais alta");
        } else if (altura1 < altura2) {
            JOptionPane.showMessageDialog(null, p2 + " é mais alta");
        } else if (altura1 == altura2) {
            JOptionPane.showMessageDialog(null, "ambos tem a mesma altura");
        }
    }
}
