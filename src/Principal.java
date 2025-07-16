import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Episodio;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;

public class Principal {
    public static void main(String[] args) {
        //Instancia de clase Pelicula
        Pelicula miPelicula = new Pelicula();

        //Asigno valores a la instancia con Setters
        miPelicula.setNombre("Encanto");
        miPelicula.setFechaLanzamiento(2021);
        miPelicula.setDuracionMinutos(102);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.muestraFichaTecnica();

        miPelicula.evalua(7.8);
        miPelicula.evalua(10);
        miPelicula.evalua(9.5);

        System.out.println("Media de evaluaciones de " + miPelicula.getNombre() + ": " + miPelicula.calculaMedia());
        System.out.println("Total de evaluaciones de " + miPelicula.getNombre() + ": " + miPelicula.getTotalDeEvaluaciones()); 
        System.out.println("------------------------------------");

        //Serie
        Serie miSerie = new Serie();
        miSerie.setNombre("La Casa del Dragón");
        miSerie.setFechaLanzamiento(2022);
        miSerie.setIncluidoEnPlan(true);
        miSerie.setTemporadas(1);
        miSerie.setEpisodiosPorTemporada(10);
        miSerie.setMinutosPorEpisodio(60); // Asumiendo 60 minutos por episodio

        System.out.println("\n--- Ficha Técnica de la Serie ---");
        
        miSerie.muestraFichaTecnica();
        
        // Vamos a imprimir la duración total directamente para ver el resultado de la sobreescritura
        System.out.println("Nombre de la serie: " + miSerie.getNombre());
        System.out.println("Fecha de lanzamiento: " + miSerie.getFechaLanzamiento());
        System.out.println("Temporadas: " + miSerie.getTemporadas());
        System.out.println("Episodios por temporada: " + miSerie.getEpisodiosPorTemporada());
        System.out.println("Minutos por episodio: " + miSerie.getMinutosPorEpisodio());
        System.out.println("Duración total de la serie (calculada): " + miSerie.getDuracionMinutos() + " minutos"); //Llama a getDuracionMinutos()

        System.out.println("\n--- Ficha Técnica de la Serie (usando el método de Titulo) ---");
        miSerie.muestraFichaTecnica();

        miSerie.evalua(9.0);
        miSerie.evalua(8.8);
        System.out.println("Media de evaluaciones de " + miSerie.getNombre() + ": " + miSerie.calculaMedia());

        //Uso calculadora de tiempo
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();

        calculadora.incluye(miPelicula);
        calculadora.incluye(miSerie);

        System.out.println("Tiempo total acumulado: " + calculadora.getTiempoTotal() + " minutos");

        //Filtro de recomendación
        FiltroRecomendacion filtro = new FiltroRecomendacion();
        System.out.println("\n--- Recomendaciones ---");
        System.out.print(miPelicula.getNombre() + ": ");
        filtro.filtra(miPelicula);

        //Episodio
        Episodio episodio = new Episodio(1, "El principio", miSerie);
        episodio.setTotalVisualizaciones(150); // Muchas visualizaciones

        System.out.print(episodio.getNombre() + " de " + miSerie.getNombre() + " (Visitas: " + episodio.getTotalVisualizaciones() + "): ");
        filtro.filtra(episodio); // Pasa un Episodio al filtro (polimorfismo en acción)
        System.out.println("Clasificación del episodio: " + episodio.getClasificacion());

        Episodio episodio2 = new Episodio(2, "El desarrollo", miSerie);
        episodio2.setTotalVisualizaciones(50); // Menos visualizaciones

        System.out.print(episodio2.getNombre() + " de " + miSerie.getNombre() + " (Visitas: " + episodio2.getTotalVisualizaciones() + "): ");
        filtro.filtra(episodio2); // Pasa otro Episodio
        System.out.println("Clasificación del episodio: " + episodio2.getClasificacion());
    }
}