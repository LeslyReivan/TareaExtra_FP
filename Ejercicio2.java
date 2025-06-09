
public class Ejercicio2 {
    public void Ejecutar() {
        int[] numeros = {2, 8, 6, 1, 5};
        int max = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > max) {
                max = numeros[i];
            }
        }
        System.out.println("El valor máximo es: " + max);
    }

    public static void main(String[] args) {
        Ejercicio2 maximo = new Ejercicio2();
        maximo.Ejecutar();
    }
}
