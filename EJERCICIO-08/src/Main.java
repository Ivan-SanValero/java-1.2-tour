public class Main {
    public static void main(String[] args) {
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            suma = suma + i;
        }
        System.out.println(suma);

        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0) { contador++; }
        }
        System.out.println(contador);
    }
}
