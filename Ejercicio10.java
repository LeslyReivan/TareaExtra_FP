public class Ejercicio10 {
    int[] vector;
    int n;

    public void ImprimirResultado() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        n = sc.nextInt();
        vector = new int[n];

        int pares = 0, impares = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            if (vector[i] % 2 == 0) pares++;
            else impares++;
        }
        System.out.println("------------------------------------------");
        System.out.println("Pares: " + pares + ", Impares: " + impares);
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        Ejercicio10 par_impar = new Ejercicio10();
        par_impar.ImprimirResultado();
    }
}
