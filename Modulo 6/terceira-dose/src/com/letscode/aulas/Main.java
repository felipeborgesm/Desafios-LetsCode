package com.letscode.aulas;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int idade = Integer.parseInt(JOptionPane.showInputDialog("insira sua idade"));
        int mesesDoseAnterior = Integer.parseInt(JOptionPane.showInputDialog("há quantos meses tomou a ultima dose?"));

        if (idade < 18 || mesesDoseAnterior < 3) {
            if (idade < 18 && mesesDoseAnterior < 3) {
                JOptionPane.showMessageDialog(null, "Inapto a tomar vacina: Menor idade e segunda dose a menos de 3 meses");
            } else if (mesesDoseAnterior < 3){
                JOptionPane.showMessageDialog(null, "Inapto a tomar vacina: Segunda dose a menor de 3 meses");
            } else {
                JOptionPane.showMessageDialog(null, "Inapto a tomar vacina: Menor idade");
            }
            System.exit(1);
        }

        if (mesesDoseAnterior > 5) {
            JOptionPane.showMessageDialog(null,"Apto a tomar a terceira dose");
        } else {
            JOptionPane.showMessageDialog(null, "Consulte o calendário");
        }

    }
}
