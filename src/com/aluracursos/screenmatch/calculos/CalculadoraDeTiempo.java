package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal; // Atributo para almacenar la suma de las duraciones

    public CalculadoraDeTiempo() {
        this.tiempoTotal = 0;
    }
    
    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionMinutos();
    }
    
    // Método para obtener el tiempo total acumulado (getter)
    public int getTiempoTotal() {
        return tiempoTotal;
    }
}
