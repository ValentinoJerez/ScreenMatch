import java.util.Scanner;

public class GLoops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double notaAcumulada = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Escribe la nota que le darías a la película Matrix:");
            double nota = teclado.nextDouble(); //Lee la nota actual
            notaAcumulada = notaAcumulada + nota; //Suma la nota actual a la acumulada

        double mediaFinal = notaAcumulada / 3;

        System.out.println("La media de evaluaciones para Matrix es: " + mediaFinal);

        teclado.close();
        }
    }
}
