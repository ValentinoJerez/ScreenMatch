public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido a ScreenMatch");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double clasificacionPelicula = 8.2;

        // Cálculo del promedio de clasificación usando tipo double
        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println("Media de clasificación de Matrix es: " + media);

        String sinopsis; //Declaro el string
        sinopsis = """
                Matrix es una paradoja.
                La mejor película del fin del milenio.
                Fue lanzada en: """ + fechaDeLanzamiento;

        System.out.println(sinopsis);
        
        String menu = """
                Bienvenido al menú de ScreenMatch:

                1. Ver catálogo de películas
                2. Buscar series
                3. Mi lista
                4. Configuración
                """ + "\nDisfruta de nuestra plataforma. Año de lanzamiento de Matrix: " + fechaDeLanzamiento;

        System.out.println(menu);

        //Uso casting implicito para convertir double a int
        int clasificacion = (int) media / 2;
         System.out.println("La clasificación de Matrix en estrellas es: " + clasificacion + " estrellas");
    }
}