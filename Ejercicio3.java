
public class Ejercicio3 {
    public void Ejecutar() {
        int[] numeros = {3, 6, 9, 12, 15};
        System.out.println("Elementos del vector:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Posición " + i + ": " + numeros[i]);
        }
    }

    public static void main(String[] args) {
        
        Ejercicio3 posicion = new Ejercicio3();
        posicion.Ejecutar();
    }
}
