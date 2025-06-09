public class Ejercicio19 {
    int[] vector;
    int n;

    public void ImprimirResultado() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Tamaño del vector: ");
        n = sc.nextInt();
        vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            vector[i] = sc.nextInt();
        }

        System.out.print("Número a eliminar: ");
        int eliminar = sc.nextInt();

        System.out.println("Vector resultante sin el número:");
        for (int i = 0; i < n; i++) {
            if (vector[i] != eliminar)
                System.out.print(vector[i] + " ");
        }
    }

    public static void main(String[] args) {
        Ejercicio19 vector_resultante = new Ejercicio19();
        vector_resultante.ImprimirResultado();
    }
}
