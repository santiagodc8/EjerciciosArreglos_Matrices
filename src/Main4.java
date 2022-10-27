public class Main4 {
    public static void main(String[] args) {

    int[][] m = new int[10][10];

        for(int i=0; i<m.length; i++){
        for(int j=0; j<m[0].length; j++){
            System.out.print(m[i][j] + " | ");
        }
        System.out.println("");
    }

        for(int i=0; i<m.length; i++){
        for(int j=0; j<m[0].length; j++){
            m[i][j]=((j+1)*(i+1));
        }
    }

        for(int i=0; i<m.length; i++){
        for(int j=0; j<m[0].length; j++){
            System.out.print(m[i][j] + " \t| ");
        }
        System.out.println("");


        }

   }
}
