package atividadeJava;

import javax.swing.JOptionPane;

public class Ex05 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][4];
        int valor, resp,soma=0;
        
        String choice[] = {"Linha","Coluna"};
        
        for(int l=0;l<matriz.length;l++){
            for(int c=0; c<matriz[l].length;c++){
                matriz[l][c]= Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um valor","Posição ["+l+"]["+c+"]",JOptionPane.INFORMATION_MESSAGE));
            }
        }
        resp = JOptionPane.showOptionDialog(null,"Qual a soma que deseja fazer?", "O que somar?", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,null,choice,choice[0]);
        
        if(resp==0){
            do{
            valor=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a linha a ser somada [1 a 5]","Soma linha",JOptionPane.INFORMATION_MESSAGE))-1;
            if(valor>4||valor<0){
                JOptionPane.showMessageDialog(null,"Valor invalido","ERRO", JOptionPane.ERROR_MESSAGE);
            }
            }while(valor<0 || valor>4);
            
            for(int c=0;c<matriz[valor].length;c++){
                soma += matriz[valor][c];
            }
            JOptionPane.showMessageDialog(null,"A soma da linha "+(valor+1)+" é: "+soma, "Soma", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            do{
            valor=Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a coluna a ser somada [1 a 4]","Soma coluna",JOptionPane.INFORMATION_MESSAGE))-1;
            if(valor>3||valor<0){
                JOptionPane.showMessageDialog(null,"Valor invalido","ERRO", JOptionPane.ERROR_MESSAGE);
            }
            }while(valor<0 || valor>3);
            
            for(int l=0; l<matriz.length;l++){
                soma += matriz[l][valor];
            }
            JOptionPane.showMessageDialog(null,"A soma da coluna "+(valor+1)+" é: "+soma, "Soma", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
