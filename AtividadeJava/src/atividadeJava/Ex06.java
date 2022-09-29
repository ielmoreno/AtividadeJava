package atividadeJava;

import java.util.Arrays;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Ex06 {

    public static String RetornaMesLicenciamneto(int uDigito, int nTipo) {
        String resp = null;
        if (nTipo == 0) {
            switch (uDigito) {
                case 1:
                    resp = "Abril";
                    break;
                case 2:
                    resp = "Ate Maio";
                    break;
                case 3:
                    resp = "Ate Junho";
                    break;
                case 4:
                    resp = "Ate Julho";
                    break;
                case 5:
                    resp = "Ate Agosto";
                    break;
                case 6:
                    resp = "Ate Agosto";
                    break;
                case 7:
                    resp = "Ate Setembro";
                    break;
                case 8:
                    resp = "Ate Outubro";
                    break;
                case 9:
                    resp = "Ate Novembro";
                    break;
                default:
                    resp = "Ate Dezembro";
            }
        } else {
            if (uDigito == 1 || uDigito == 2) {
                resp = "Ate Setembro";
            } else if (uDigito > 2 && uDigito < 6) {
                resp = "Ate Outubro";
            } else if (uDigito > 5 && uDigito < 9) {
                resp = "Ate Novembro";
            } else {
                resp = "Ate Dezembro";
            }
        }

        return resp;
    }

    public static String[][] add(int l, int c, String matriz[][]) {
        String[][] nMatriz = new String[(l + 2)][c];

        for (int nL = 0; nL < nMatriz.length; nL++) {
            if (nL <= l) {
                for (int nC = 0; nC < c; nC++) {
                    nMatriz[nL][nC] = matriz[nL][nC];
                }
            } else {
                for (int nC = 0; nC < nMatriz[nL].length; nC++) {
                    nMatriz[nL][nC] = "";

                }
            }
        }

        return nMatriz;
    }

    public static void main(String[] args) {
        int uDigito = 0, nTipo = 1, novo = 0, c;
        String[] tVeic = {"Automovel", "Caminhao"};
        String[] campos = {"Placa", "Tipo", "Proprietário", "Licenciamento"};
        String matriz[][] = new String[1][4];

        for (int l = 0; l < matriz.length; l++) {
            for (c = 0; c < matriz[l].length; c++) {
                if (c == 1) {
                    nTipo = JOptionPane.showOptionDialog(null, "Qual o tipo do veiculo", campos[c], JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, tVeic, tVeic[0]);
                    matriz[l][c] = tVeic[nTipo];
                } else if (c == 3) {
                    matriz[l][c]=RetornaMesLicenciamneto(uDigito,nTipo);
                } else {
                    matriz[l][c] = JOptionPane.showInputDialog(null, campos[c], campos[c], JOptionPane.INFORMATION_MESSAGE);
                    if (c == 0) {
                        uDigito = Integer.parseInt(matriz[l][0].substring(matriz[l][0].length() - 1, matriz[l][0].length()));
                    }
                }

            }
            novo = JOptionPane.showConfirmDialog(null, "Cadastrar um novo veiculo?", "Novo Cadastro", JOptionPane.YES_NO_OPTION);
            if (novo == 0) {
                matriz = add(l, c, matriz);

            }

        }
        JTable tabela = new JTable(matriz,campos);
        JOptionPane.showMessageDialog(null,new JScrollPane(tabela),"Tabela",JOptionPane.PLAIN_MESSAGE);

    }
}
