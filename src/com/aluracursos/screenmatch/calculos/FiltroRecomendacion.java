package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Clasificable;

public class FiltroRecomendacion {
    public void filtra(Clasificable clasificable) { // Ahora acepta cualquier objeto Clasificable
        if (clasificable.getClasificacion() >= 4) { 
            System.out.println("Muy bien evaluado en el momento.");
        } else if (clasificable.getClasificacion() == 2) {
            System.out.println("Popular en el momento.");
        } else {
            System.out.println("Colócalo en tu lista para verlo después.");
        }
    }    
}