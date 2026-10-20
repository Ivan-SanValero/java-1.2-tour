public class Main {
    public static void main(String[] args) {
        int multiplos = 0;
        int suma = 0;
        for (int i = 1; i < 30; i++) {
            suma += i;
            if(i % 3 == 0) { multiplos++; }
        }
        System.out.println("Suma: " + suma);
        System.out.println("Multiplos: " + multiplos);
    }
}
