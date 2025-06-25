public class Pelicula {
    //Atributos del objeto Pelicula
    String nombre;
    int fechaLanzamiento;
    int duracionMinutos;
    boolean incluidoEnPlan;
    double sumaEvaluaciones; //Almacena suma de las notas
    int totalEvaluaciones;

    //Muestro ficha tecnica
    public void muestraFichaTecnica() { //void no retorna nada
        System.out.println("El nombre de la película es: " + nombre);
        System.out.println("Su fecha de lanzamiento es: " + fechaLanzamiento);
        System.out.println("Duración en minutos: " + duracionMinutos);
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
}