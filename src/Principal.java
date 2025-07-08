import com.aluracursos.screenmatch.modelos.Pelicula;

public class Principal {
    public static void main(String[] args) {
        //Instancia de clase Pelicula
        Pelicula miPelicula = new Pelicula();

        //Asigno valores a la instancia con Setters
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaLanzamiento(2021);
        miPelicula.setDuracionMinutos(102);
        miPelicula.setIncluidoEnPlan(true);

        //Muestro ficha técnica
        miPelicula.muestraFichaTecnica();

        //Evaluo pelicula
        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        miPelicula.evalua(9.5);

        //Imprimo
        System.out.println("Media de evaluaciones de " + miPelicula.getNombre() + ": " + miPelicula.calculaMedia());
        System.out.println("Total de evaluaciones de " + miPelicula.getNombre() + ": " + miPelicula.getTotalDeEvaluaciones()); 
        System.out.println("------------------------------------");

        //Instancia de otra película
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix");
        otraPelicula.setFechaLanzamiento(1998);
        otraPelicula.setDuracionMinutos(136);
        otraPelicula.setIncluidoEnPlan(false);
        otraPelicula.setDuracionMinutos(180);

        //Ficha tecnica
        otraPelicula.muestraFichaTecnica();

        //Evaluo
        otraPelicula.evalua(9.0);
        otraPelicula.evalua(8.5);

        System.out.println("Media de evaluaciones de " + otraPelicula.getNombre() + ": " + otraPelicula.calculaMedia());
        System.out.println("Total de evaluaciones de " + otraPelicula.getNombre() + ": " + otraPelicula.getTotalDeEvaluaciones());
    }
}