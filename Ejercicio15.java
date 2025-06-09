public class Ejercicio15 {
    int[] vector;
    int n;

    public void ImprimirResultado() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        n = sc.nextInt();
        vector = new int[n];

        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            vector[i] = sc.nextInt();
            if (i % 2 == 0) suma += vector[i];
        }

        System.out.println("Suma de elementos en posiciones pares: " + suma);
    }

    public static void main(String[] args) {
        Ejercicio15 suma_elementos = new Ejercicio15();
        suma_elementos.ImprimirResultado();
    }
}
