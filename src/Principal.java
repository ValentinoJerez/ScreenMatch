public class Principal {
    public static void main(String[] args) {
        //Instancia de clase Pelicula
        Pelicula miPelicula = new Pelicula();
        //Asigno valores a la instancia
        miPelicula.nombre = "Encanto";
        miPelicula.fechaLanzamiento = 2021;
        miPelicula.duracionMinutos = 120;
        miPelicula.incluidoEnPlan = true;

        //Muestro ficha técnica
        miPelicula.muestraFichaTecnica();

        //Evaluo pelicula
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        miPelicula.evalua(9.5);

        //devuelvo la media
        System.out.println("Suma de evaluaciones de " + miPelicula.nombre + ": " + miPelicula.sumaEvaluaciones);
        System.out.println("Total de evaluaciones de " + miPelicula.nombre + ": " + miPelicula.totalEvaluaciones);

        //Imprimo
        System.out.println("Media de evaluaciones de " + miPelicula.nombre + ": " + miPelicula.calculaMedia());
        System.out.println("------------------------------------");

        /* System.out.println("Mi película es: " + miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaLanzamiento);
        System.out.println("Dura: " + miPelicula.duracionMinutos + " minutos");
        System.out.println("Incluida en el plan: " + miPelicula.incluidoEnPlan);
        System.out.println("------------------------------------"); */

        //Instancia de otra película
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Matrix";
        otraPelicula.fechaLanzamiento = 1998;
        otraPelicula.duracionMinutos = 180;
        otraPelicula.incluidoEnPlan = false; 

        //Ficha tecnica
        otraPelicula.muestraFichaTecnica();

        //Evaluo
        otraPelicula.evalua(9.0);
        otraPelicula.evalua(8.5);

        System.out.println("Media de evaluaciones de " + otraPelicula.nombre + ": " + otraPelicula.calculaMedia());

        /* System.out.println("Mi otra película es: " + otraPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaLanzamiento);
        System.out.println("Dura: " + otraPelicula.duracionMinutos + " minutos");
        System.out.println("Incluida en el plan: " + otraPelicula.incluidoEnPlan); */
    }
}