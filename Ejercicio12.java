public class Ejercicio12 {
    int[] vector;
    int n;

    public void ImprimirResultado() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        n = sc.nextInt();
        vector = new int[n];
        boolean ordenado = true;

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + i + ": ");
            vector[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (vector[i] < vector[i - 1]) {
                ordenado = false;
                break;
            }
        }

        if (ordenado)
            System.out.println("El vector está ordenado de forma ascendente.");
        else
            System.out.println("El vector no está ordenado.");
    }

    public static void main(String[] args) {
        Ejercicio12 orden = new Ejercicio12();
        orden.ImprimirResultado();
    }
}
