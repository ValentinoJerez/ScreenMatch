//SUPER CLASE
package com.aluracursos.screenmatch.modelos;

public class Titulo {
    //Atributos del objeto Pelicula
    private String nombre;
    private int fechaLanzamiento;
    private int duracionMinutos;
    private boolean incluidoEnPlan;
    
    private double sumaEvaluaciones; //Almacena suma de las notas
    private int totalEvaluaciones;

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
}
