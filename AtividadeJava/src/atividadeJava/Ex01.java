package atividadeJava;

import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {
        float custo, imposto,distribuidor, vFinal;
        imposto = (float) 0.45;
        distribuidor = (float) 0.28;
        
        custo = Float.parseFloat(JOptionPane.showInputDialog(null,"Informe o valor de custo do veículo para o fabricante","Custo do veículo", JOptionPane.QUESTION_MESSAGE));
        vFinal = (float) custo + (custo*imposto)+(custo*distribuidor);
        JOptionPane.showMessageDialog(null,"O valor final do veículo é: R$"+ vFinal, "Valor do veículo", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
