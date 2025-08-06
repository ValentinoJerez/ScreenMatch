//SUPER CLASE
package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionExcepcion;
import com.google.gson.annotations.SerializedName;
import java.util.Comparator;

public class Titulo implements Comparable<Titulo>{

    //Atributos del objeto Pelicula
    private String nombre;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnPlan;
    
    protected  double sumaEvaluaciones; //Almacena suma de las notas
    protected  int totalEvaluaciones;

    public Titulo(String nombre, int fechaLanzamiento) {
        this.nombre = nombre;
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public Titulo(TituloOMDB miTituloOMDB) {
        this.nombre = miTituloOMDB.title();
        
        // --- ¡NUEVO CÓDIGO AQUÍ: Validación y lanzamiento de excepción ! ---
        if (miTituloOMDB.year() != null && !miTituloOMDB.year().isEmpty()) {
            this.fechaLanzamiento = Integer.valueOf(miTituloOMDB.year());
        } else {
            this.fechaLanzamiento = 0; // O manejar de otra forma
        }

        if (miTituloOMDB.runtime() != null && !miTituloOMDB.runtime().isEmpty() && miTituloOMDB.runtime().contains("N/A")) {
             throw new ErrorEnConversionDeDuracionExcepcion("No pude convertir la duración porque contiene 'N/A' o caracteres no numéricos.");
        }
        
        // --- Mejoras en la conversión de duración ---
        String duracionString = miTituloOMDB.runtime().replace(" ", "").replace("min", "");
        if (!duracionString.isEmpty()) {
            this.duracionMinutos = Integer.valueOf(duracionString);
        } else {
            this.duracionMinutos = 0;
        }
    }

    //Muestro ficha tecnica
    public void muestraFichaTecnica() { //void no retorna nada
        System.out.println("El nombre del titulo es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaLanzamiento);
        System.out.println("Duración en minutos: " + getDuracionMinutos() + " minutos");
        System.out.println("Incluida en el plan: " + incluidoEnPlan);
    }

    public void evalua(double nota) {
        sumaEvaluaciones += nota;
        totalEvaluaciones++;
    }
    
    public double calculaMedia() {
        if (totalEvaluaciones == 0) {
            return 0.0; 
        }
        return sumaEvaluaciones / totalEvaluaciones;
    }

    //Getter para atributos privados
    public String getNombre(){
        return nombre;
    }
    public int getFechaLanzamiento() {
        return fechaLanzamiento;
    }
    public int getDuracionMinutos() {
        return duracionMinutos;
    }
    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }
    public int getTotalDeEvaluaciones() {
        return totalEvaluaciones;
    }

    //Setters para modificar atributos privados
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFechaLanzamiento(int fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }
    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    @Override
    public String toString() {
        return "Título: " + nombre + " (" + fechaLanzamiento + ")";
    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        // Compara por el nombre del título
        return this.getNombre().compareTo(otroTitulo.getNombre());
    }
}
