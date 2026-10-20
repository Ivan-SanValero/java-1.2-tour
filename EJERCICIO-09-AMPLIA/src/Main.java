public class Main {
    public static void main(String[] args) {
        int[] notas = {7,5,9,4,8};
        int contador = 0;

        for (int i = 0; i < notas.length; i++) {
            if(notas[i] >= 5) {
                System.out.println(notas[i] + " es mayor o igual que 5. Está aprobado.");
                contador++;
            }
        }
        System.out.println("Hay " + contador + " notas aprobadas.");

    }
}
