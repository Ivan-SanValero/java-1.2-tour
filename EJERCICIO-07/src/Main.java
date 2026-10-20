public class Main {
    public static void main(String[] args) {

        int numero = 1;
        while (numero <= 5) {
            System.out.println(numero);
            numero++;
        }

        numero = 1;
        while(numero <= 10) {
            System.out.println(numero);
            // Siempre va a imprimir 1, el IDE te avisa de que no sale del bucle. Habria que añadir un numero++
        }

    }
}
