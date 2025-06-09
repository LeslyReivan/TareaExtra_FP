public class Ejercicio8 {
    int[] vector;
    int n;

    public void Ejecutar() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        n = sc.nextInt();
        vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
        }

        int mayor = vector[0], menor = vector[0];
        for (int i = 1; i < n; i++) {
            if (vector[i] > mayor) mayor = vector[i];
            if (vector[i] < menor) menor = vector[i];
        }
        System.out.println("------------------------------------------");
        System.out.println("Mayor: " + mayor + ", Menor: " + menor);
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        Ejercicio8 mayor_menor = new Ejercicio8();
        mayor_menor.Ejecutar();
    }
}
