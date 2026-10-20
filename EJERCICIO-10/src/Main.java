public class Main {
    public static void main(String[] args) {
        int[] notas = {7,4,8,3,6};
        int aprobados = 0;
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            if (notas[i] >= 5) { aprobados++; }
        }

        aprobados = 0;
        int suspensos = 0;
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] >= 5) {aprobados++;}
            else {suspensos++;}
        }
        System.out.println("Hay " + aprobados + " aprobados y " + suspensos + " suspensos.");

    }
}
