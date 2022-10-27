import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main5 {
    public static void main (String[] args){
        Scanner entrada = new Scanner(System.in);
        int matriz[][],nFilas,nCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));

        matriz = new int[nFilas][nCol];
        for(int i=0;i<matriz.length;i++){
            matriz[i][i]=1;
        }
        for(int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }

    }
}
