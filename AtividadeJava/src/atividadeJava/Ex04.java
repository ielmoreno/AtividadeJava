package atividadeJava;

import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args) {
        int vetor[] = new int[30];
        int valor, cont=0;
        
        for(int c=0; c<vetor.length;c++){
            vetor[c]=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o "+ (c+1)+ " valor", "Valor "+ (c+1), JOptionPane.INFORMATION_MESSAGE));
        }
        valor = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor a ser pesquisado","Consulta",JOptionPane.INFORMATION_MESSAGE));
        
        for(int c=0; c<vetor.length;c++){
            if(valor == vetor[c]){
                cont++;
            }
        }
        JOptionPane.showMessageDialog(null,"O valor "+valor+" aparece "+cont+" vezes no vetor", "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
