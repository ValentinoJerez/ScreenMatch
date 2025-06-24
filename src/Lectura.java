import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Por favor, escribe el nombre de tu película favorita:");
        String pelicula = teclado.nextLine();

        System.out.println("Ahora escribe la fecha de lanzamiento:");
        int fechaDeLanzamiento = teclado.nextInt();

        System.out.println("Por último, dinos qué nota le das a esta película:");
        double nota = teclado.nextDouble();

        System.out.println("Tu película favorita es: " + pelicula);
        System.out.println("Fue lanzada en el año: " + fechaDeLanzamiento);
        System.out.println("Tu calificación para la película es: " + nota);

        teclado.close();
    }
}
