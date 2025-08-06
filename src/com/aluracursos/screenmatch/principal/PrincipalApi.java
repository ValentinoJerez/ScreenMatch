package com.aluracursos.screenmatch.principal;

//Importaciones para HTTP
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.aluracursos.screenmatch.excepcion.ErrorEnConversionDeDuracionExcepcion;
import com.aluracursos.screenmatch.modelos.Titulo;
import com.aluracursos.screenmatch.modelos.TituloOMDB;
import com.google.gson.FieldNamingPolicy;

public class PrincipalApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        //Entrada de usuario
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba el nombre de una película: ");
        String busqueda = lectura.nextLine();

        try {
            // 1- Crear un cliente HTTP
            String direccion = "https://www.omdbapi.com/?t=" + busqueda.replace(" ", "+") + "&apikey=6e683e9c";
            //2- Crear una solicitud HTTP
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();
            //3- Crear un cliente HTTP
            HttpClient client = HttpClient.newHttpClient();
            //4- Enviar solicitud y recibir respuesta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            //5- Imprimir el cuerpo de la respuesta
            System.out.println(response.body());

            // Conversión del JSON 
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES)
                    .create();
            
            TituloOMDB miTituloOMDB = gson.fromJson(json, TituloOMDB.class);
            System.out.println("DTO: " + miTituloOMDB);
            
            Titulo miTitulo = new Titulo(miTituloOMDB);
            System.out.println("Título ya convertido: " + miTitulo);

        } catch (NumberFormatException e) {
            System.out.println("Ocurrió un error en la conversión de datos. " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Error en la dirección de la URI. " + e.getMessage());
        } catch (ErrorEnConversionDeDuracionExcepcion e) { //Excepción personalizada
            System.out.println(e.getMessage());
        }  catch (Exception e) {
            System.out.println("Ocurrió un error inesperado.");
            e.printStackTrace();
        }

        lectura.close();
    }
}