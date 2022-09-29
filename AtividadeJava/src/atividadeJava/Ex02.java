package atividadeJava;

import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        String time1, time2;
        int gT1, gT2;
        
        time1= JOptionPane.showInputDialog(null,"Informe o primeiro time", "Time 1",JOptionPane.INFORMATION_MESSAGE);
        time2= JOptionPane.showInputDialog(null,"Informe o segundo time", "Time 2",JOptionPane.INFORMATION_MESSAGE);
        gT1= Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade de gols do primeiro time", "Gols time 1",JOptionPane.INFORMATION_MESSAGE));
        gT2= Integer.parseInt(JOptionPane.showInputDialog(null,"Informe a quantidade de gols do segundo time", "Gols time 2",JOptionPane.INFORMATION_MESSAGE));
        
        if(gT1==gT2){
            JOptionPane.showMessageDialog(null, "EMPATOU", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(gT1>gT2){
            JOptionPane.showMessageDialog(null, time1 + " foi o vencedor", "Resultado",JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, time2 + " foi o vencedor", "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
}
