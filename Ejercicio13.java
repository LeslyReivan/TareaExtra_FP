public class Ejercicio13 {
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

        System.out.print("Número a buscar: ");
        int buscar = sc.nextInt();
        boolean encontrado = false;

        for (int i = 0; i < n; i++) {
            if (vector[i] == buscar) {
                System.out.println("Número encontrado en la posición: " + i);
                encontrado = true;
            }
        }

        if (!encontrado)
            System.out.println("Número no encontrado en el vector.");
    }

    public static void main(String[] args) {
        Ejercicio13 encontrado = new Ejercicio13();
        encontrado.ImprimirResultado();
    }
}
