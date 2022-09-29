package atividadeJava;

import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
        String matriz[][] = new String [15][3];
        String vetor[] = {"Código", "Preço","Quantidade"};
        float vTotal=0,mPreco=0,vEstoque=0, media;
        int l;
        
        for(l=0;l<matriz.length;l++){
            for(int c=0;c<matriz[l].length;c++){
                matriz[l][c]=JOptionPane.showInputDialog(null,vetor[c],vetor[c],JOptionPane.INFORMATION_MESSAGE);
                if(c==matriz[l].length-1){
                    vEstoque += Float.parseFloat(matriz[l][c])* Float.parseFloat(matriz[l][c-1]);
                }
                if(vetor[c]=="Preço"){
                    vTotal += Float.parseFloat(matriz[l][c]);
                    if(Float.parseFloat(matriz[l][c])>mPreco){
                        mPreco = Float.parseFloat(matriz[l][c]);
                    }
                }
            }
        }
        
        JOptionPane.showMessageDialog(null,"O maior preço lido foi: R$"+ mPreco,"Maior preço", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"A media dos preços é: R$"+ vTotal/(l), "Media de preços", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "O valor de estoque total é: R$"+ vEstoque, "Valor de estoque", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
}
