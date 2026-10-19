import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = -1;
        while (numero != 0) {
            System.out.print("Escribe 0: ");
            numero = sc.nextInt();
        }

        while(numero != -1) {
            System.out.print("Escribe -1: ");
            numero = sc.nextInt();
        }

    }
}
