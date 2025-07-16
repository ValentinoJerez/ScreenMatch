package com.aluracursos.screenmatch.modelos;

public class Episodio implements Clasificable{
    private int numero;
    private String titulo;
    private Serie serie;
    private int totalVisualizaciones;

    //Constructor
    public Episodio(int numero, String nombre, Serie serie) {
        this.numero = numero;
        this.nombre = nombre;
        this.serie = serie;
    }

    //Getters
    public int getNumero() { return numero; }
    public String getNombre() { return nombre; }
    public Serie getSerie() { return serie; }
    public int getTotalVisualizaciones() { return totalVisualizaciones; }

    //Setters
    public void setNumero(int numero) { this.numero = numero; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setSerie(Serie serie) { this.serie = serie; }
    public void setTotalVisualizaciones(int totalVisualizaciones) { this.totalVisualizaciones = totalVisualizaciones; }

    @Override
    public int getClasificacion() {
        if (totalVisualizaciones > 100) {
            return 4; // Muy popular
        } else {
            return 2; // Menos popular
        }
    }
}
