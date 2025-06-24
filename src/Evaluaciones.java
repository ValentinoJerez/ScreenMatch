import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        System.out.println("Escribe la nota que le darías a la película Matrix (o -1 para salir):");
        nota = teclado.nextDouble();

        while (nota != -1) {
            // Se suman y se cuentan las notas SÓLO SI no es el valor centinela (-1)
            mediaEvaluaciones += nota;      // Equivalente a: mediaEvaluaciones = mediaEvaluaciones + nota;
            totalEvaluaciones++;            // Equivalente a: totalEvaluaciones = totalEvaluaciones + 1;

            // Volvemos a pedir una nota para la siguiente iteración (o para salir)
            System.out.println("Escribe otra nota para la película Matrix (o -1 para salir):");
            nota = teclado.nextDouble();
        }

        if (totalEvaluaciones > 0) {
            double mediaFinal = mediaEvaluaciones / totalEvaluaciones;
            System.out.println("La media de evaluaciones para Matrix es: " + mediaFinal);
        } else {
            System.out.println("No se ingresaron evaluaciones válidas.");
        }

        teclado.close();
    }
}
