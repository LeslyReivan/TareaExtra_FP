public class Ejercicio9 {
    int[] vector;
    int n;

    public void ImprimirResultado() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        n = sc.nextInt();
        vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }

        System.out.println("Vector invertido:");
        for (int i = n - 1; i >= 0; i--) {
            
            System.out.print(vector[i] + " ");
            
        }
    }

    public static void main(String[] args) {
        Ejercicio9 invertido = new Ejercicio9();
        invertido.ImprimirResultado();
    }
}
