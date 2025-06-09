
public class Ejercicio1 {
    public void Ejecutar() {
        int[] numeros = {4, 7, 1, 9, 3};
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma de los elementos es: " + suma);
    }

    public static void main(String[] args) {
        Ejercicio1 sumar = new Ejercicio1();
        sumar.Ejecutar();
    }
}
