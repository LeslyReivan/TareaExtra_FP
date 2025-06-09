
public class Ejercicio4 {
    public void Ejecutar() {
        int[] numeros = {5, 10, 15, 20, 25};
        int pares = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            }
        }
        System.out.println("---------------------------------");
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Ejercicio4 pares = new Ejercicio4 ();
        pares.Ejecutar();
    }
}
