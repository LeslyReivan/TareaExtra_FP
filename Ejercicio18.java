public class Ejercicio18 {
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

        System.out.print("Número a contar: ");
        int buscar = sc.nextInt();
        int contador = 0;

        for (int i = 0; i < n; i++) {
            if (vector[i] == buscar)
                contador++;
        }

        System.out.println("El número " + buscar + " se repite " + contador + " veces.");
    }

    public static void main(String[] args) {
        Ejercicio18 se_repite = new Ejercicio18();
        se_repite.ImprimirResultado();
    }
}
