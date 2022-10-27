public class Main {
    public static void main(String[] args) {
        // Arreglo A -> sueldo de los empleados
        // Arreglo B -> asignaciones totales de cada empleado
        // Arreglo C -> deducciones de cada uno
        // Arreglo T -> que contenga el neto a pagar de cada empleado.
        String[] N = {"Arles", "Carlos", "Harvin", "Byron", "Daniela"};
        int[] A = {2000, 3000, 4000, 1500, 600};
        int[] B = {200, 300, 100, 130, 450};
        int[] C = {50, 40, 25, 18, 120};
        int[] T = new int[5];

        //Almacenar en el arreglo T, la operación de sumar el sueldo + asignaciones - deducciones
        for(int i=0; i<N.length; i++){
            T[i] = A[i] + B[i] - C[i];
        }

        for(int i=0; i<T.length; i++){
            System.out.println("Trabajador " + N[i] + " Total Salario: " + T[i]);
        }
    }
}