package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalConListas {
    public static void main(String[] args){
        //Creacion de instancia con constructores
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionMinutos(120);
        miPelicula.evalua(9);
        
        Pelicula otraPelicula = new Pelicula("El Señor de los Anillos: La Comunidad del Anillo", 2001);
        otraPelicula.setDuracionMinutos(178);
        otraPelicula.evalua(10);

        Serie casaDragon = new Serie("La Casa del Dragón", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.setMinutosPorEpisodio(60);

        //Creo arrayList que contiene peliculas y series
        List<Titulo> lista = new ArrayList<>(); 
        lista.add(miPelicula); 
        lista.add(otraPelicula);
        lista.add(casaDragon); 

        //Imprimo lista
        System.out.println("Iterando la lista y mostrando detalles");
        for (Titulo item: lista){
            System.out.println("Título: " + item.getNombre());
            if (item instanceof Pelicula pelicula) {
                System.out.println("  Clasificación (solo películas): " + pelicula.getClasificacion());
            } else {
                System.out.println("  (No es una película, clasificación no aplica)");
            }
        }

        //Referencia a objetos
        Pelicula p1 = miPelicula; // p1 ahora apunta al MISMO objeto que miPelicula
        System.out.println("Nombre original de miPelicula: " + miPelicula.getNombre());
        System.out.println("Nombre de p1 (apunta al mismo objeto): " + p1.getNombre());

        // Modificamos el objeto a través de la referencia p1
        p1.setNombre("Encanto Disney Re-lanzamiento"); 

        System.out.println("--- Después de modificar el nombre a través de p1 ---");
        System.out.println("Nombre de miPelicula ahora: " + miPelicula.getNombre());
        System.out.println("Nombre de p1 ahora: " + p1.getNombre());

        //Ordenando lista de titulos
        Collections.sort(lista);
        System.out.println(lista);

        //Ordenando lista de string
        ArrayList<String> listaDeArtistas = new ArrayList<>();
        listaDeArtistas.add("Penélope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ricardo Darín");
        listaDeArtistas.add("Chris Evans");

        System.out.println("Lista de artistas sin ordenar: " + listaDeArtistas);
        Collections.sort(listaDeArtistas); // String ya implementa Comparable
        System.out.println("Lista de artistas ordenada: " + listaDeArtistas);

        // Se usa el método sort del ArrayList y se le pasa un Comparator para ordenar por fecha de lanzamiento
        lista.sort(Comparator.comparing(Titulo::getFechaLanzamiento));
        System.out.println(lista);
    }
}
