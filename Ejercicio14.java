public class Ejercicio14 {
    int[] vector;
    int n;

    public void ImprimirResultado() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        do {
            System.out.print("Tamaño PAR del vector: ");
            n = sc.nextInt();
        } while (n % 2 != 0);

        vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            vector[i] = sc.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = vector[i];
            vector[i] = vector[i + n / 2];
            vector[i + n / 2] = temp;
        }

        System.out.println("Vector después de intercambiar mitades:");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
    }

    public static void main(String[] args) {
        Ejercicio14 intercambiar = new Ejercicio14();
        intercambiar.ImprimirResultado();
    }
}
