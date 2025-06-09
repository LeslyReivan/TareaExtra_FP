public class Ejercicio11 {
    int[] A, B, C;
    int n;

    public void ImprimirResultado() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Tamaño de los vectores: ");
        n = sc.nextInt();
        A = new int[n];
        B = new int[n];
        C = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("Vector suma:");
        for (int i = 0; i < n; i++) {
            System.out.print(C[i] + " ");
        }
    }

    public static void main(String[] args) {
        Ejercicio11 vec_suma = new Ejercicio11();
        vec_suma.ImprimirResultado();
    }
}
