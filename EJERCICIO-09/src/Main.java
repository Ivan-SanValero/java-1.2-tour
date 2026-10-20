public class Main {
    public static void main(String[] args) {
        int[] notas = {7, 5, 9, 4, 8};
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

        System.out.println();

        for (int i = 0; i < notas.length; i++) {
            if(notas[i] >= 5) { System.out.println(notas[i]);}
        }


    }
}
