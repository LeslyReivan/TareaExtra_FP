public class Ejercicio16 {
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

        System.out.print("Posición a eliminar (0 a " + (n - 1) + "): ");
        int pos = sc.nextInt();

        if (pos >= 0 && pos < n) {
            System.out.println("Vector resultante:");
            for (int i = 0; i < n; i++) {
                if (i != pos)
                    System.out.print(vector[i] + " ");
            }
        } else {
            System.out.println("Posición inválida.");
        }
    }

    public static void main(String[] args) {
        Ejercicio16 posicion = new Ejercicio16();
        posicion.ImprimirResultado();
    }
}
