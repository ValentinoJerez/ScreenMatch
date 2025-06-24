public class Decisiones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double clasificacionPelicula = 8.2;

        String tipoPlan = "plus"; 

         if (fechaDeLanzamiento >= 2025) {
            System.out.println("Películas más populares");
        } else {
            System.out.println("Película retro que aún vale la pena ver");
        }

         if (incluidoEnElPlan == true && clasificacionPelicula > 8.0) {
            System.out.println("Disfruta de esta película de alta calificación incluida en tu plan.");
        } else {
            System.out.println("Esta película podría no estar en tu plan o tener una clasificación más baja.");
        }

        if (incluidoEnElPlan && tipoPlan.equals("plus")) {
            System.out.println("Disfrute de su película (AND)");
        } else {
            System.out.println("Película no disponible para su plan actual (AND)");
        }
    }
}
