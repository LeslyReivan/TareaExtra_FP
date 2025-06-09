
public class Ejercicio5 {
    public void Ejecutar() {
        int[] numeros = {1, 3, 5, 7, 9};
        int buscado = 5;
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                encontrado = true;
                break;
            }
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("¿El número " + buscado + " está en el vector?: " + encontrado);
        System.out.println("------------------------------------------------------------");
    }

    public static void main(String[] args) {
        Ejercicio5 buscar = new Ejercicio5();
        buscar.Ejecutar();
    }
}
