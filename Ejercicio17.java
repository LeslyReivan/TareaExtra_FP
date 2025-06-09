public class Ejercicio17 {
    int[] vector;
    int n;

    public void ImprimirResultado() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Tamaño del vector: ");
        n = sc.nextInt();
        vector = new int[n + 1];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            vector[i] = sc.nextInt();
        }

        System.out.print("Número a insertar: ");
        int num = sc.nextInt();
        System.out.print("Posición para insertar (0 a " + n + "): ");
        int pos = sc.nextInt();

        if (pos >= 0 && pos <= n) {
            for (int i = n; i > pos; i--) {
                vector[i] = vector[i - 1];
            }
            vector[pos] = num;

            System.out.println("Vector resultante:");
            for (int i = 0; i <= n; i++) {
                System.out.print(vector[i] + " ");
            }
        } else {
            System.out.println("Posición inválida.");
        }
    }

    public static void main(String[] args) {
        Ejercicio17 insertar = new Ejercicio17();
        insertar.ImprimirResultado();
    }
}
