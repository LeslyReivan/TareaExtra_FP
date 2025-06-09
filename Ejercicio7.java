public class Ejercicio7 {
    int[] vector;
    int n;

    public void Ejecutar() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        n = sc.nextInt();
        vector = new int[n];

        int contador = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            if (vector[i] > 10) contador++;
        }
        System.out.println("------------------------------------------");
        System.out.println("Hay " + contador + " elementos mayores a 10.");
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        Ejercicio7 mayora = new Ejercicio7();
        mayora.Ejecutar();
    }
}
