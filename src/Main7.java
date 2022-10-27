public class Main7 {
    public static void main (String[] args){

        //Crear la matriz 4x4
    int[][] m = {{1,2,3,4},
            {5,6,7,8},
            {9,1,3,2},
            {3,4,5,6}};

        for(int i=0; i<m.length; i++){
        for(int j=0; j<m[0].length; j++){
            System.out.print(m[i][j] + " | ");
        }
        System.out.println("");
    }

        for(int i=0; i<m.length; i++){
        for(int j=0; j<m[0].length; j++){
            if(i == j){
                m[i][j]=0;
            }
        }
    }

        System.out.println("------------------------");

        for(int i=0; i<m.length; i++){
        for(int j=0; j<m[0].length; j++){
            System.out.print(m[i][j] + " | ");
        }
        System.out.println("");
    }

}
}
