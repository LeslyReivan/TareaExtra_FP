public class Ejercicio20 {
    int[] vector;
    int n;

    public void Imprimir() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Tamaño del vector: ");
        n = sc.nextInt();
        vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            vector[i] = sc.nextInt();
        }

        System.out.print("Constante multiplicadora: ");
        int k = sc.nextInt();

        System.out.println("Vector resultante:");
        for (int i = 0; i < n; i++) {
            System.out.print((vector[i] * k) + " ");
        }
    }

    public static void main(String[] args) {
        Ejercicio20 multiplicar = new Ejercicio20();
        multiplicar.Imprimir();
    }
}
