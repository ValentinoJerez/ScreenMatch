package com.aluracursos.screenmatch.principal;

//Importaciones para HTTP
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalApi {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 1- Crear un cliente HTTP
        String direccion = "https://www.omdbapi.com/?t=Matrix&apikey=6e683e9c";

        //2- Crear una solicitud HTTP
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(direccion)).build();

        //3- Crear un cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        //4- Enviar solicitud y recibir respuesta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //5- Imprimir el cuerpo de la respuesta
        System.out.println(response.body());
    }
}