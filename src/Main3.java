import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite el rango inicial: ");
        int n = teclado.nextInt();

        System.out.print("Digite el rango fianl: ");
        int m = teclado.nextInt();

        for(int i = n; i<=m; i++){
            System.out.println("----Tabla del " + i + "----");
            for(int j = 1; j <=9; j++){
                System.out.println(i + " X " + j + " = " + (i*j));

            }
            System.out.println("");

        }
    }
}
