
public class Ejercicio6 {
    int[] vector;
    int n;

    public void Ejecutar() {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        n = sc.nextInt();
        vector = new int[n];

        int suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = sc.nextInt();
            suma += vector[i];
        }

        double promedio = (double) suma / n;
        System.out.println("---------------------------------");
        System.out.println("El promedio es: " + promedio);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Ejercicio6 promedio = new Ejercicio6();
        promedio.Ejecutar();
    }
}
