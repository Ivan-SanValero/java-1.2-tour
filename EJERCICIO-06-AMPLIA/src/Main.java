import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = -1;

        while(edad != 0) {
            System.out.print("Escribe edades y para acabar escribe 0: ");
            edad = sc.nextInt();
        }
        // Va a hacer 4 vueltas, una para 18, otra para 20, otra para 25, y la ultima para 0 y acabar

    }
}
