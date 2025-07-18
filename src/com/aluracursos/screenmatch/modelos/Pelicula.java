package com.aluracursos.screenmatch.modelos;

public class Pelicula extends Titulo implements Clasificable { //Hereda de Titulo
    private String director;

    public String getDirector(){
        return director;
    }

    public void setDirector(String director){
        this.director = director;
    }

    @Override
    public int getClasificacion(){
        if (totalDeEvaluaciones == 0) return 0;
        return (int) (calculaMedia() / 2); 
    }
}