package br.com.alura.screenmatch.main;


import br.com.alura.screenmatch.exceptions.InvalidYearException;
import br.com.alura.screenmatch.models.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RequestMain {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner s = new Scanner(System.in);
        String reader = "";
        List<Title> titleList = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting()
                .create();
        while (!reader.equalsIgnoreCase("exit")) {
            System.out.println("Enter a movie: ");
            reader = s.nextLine();
            if(reader.equalsIgnoreCase("exit")) {
                System.out.println("Closing...");
                break;
           }
            try {
                HttpClient client = HttpClient.newHttpClient();
                String address = ("https://www.omdbapi.com/?apikey=e0ffa84d&t=" + reader).replace(" ", "%20");
                System.out.println(address);
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(address))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());
                var json = response.body();
                System.out.println(json);
                OmdbTitle omdbTitle = gson.fromJson(json, OmdbTitle.class);
                Title title = new Title(omdbTitle);
                System.out.println(title);
                titleList.add(title);
            } catch (NumberFormatException e) {
                System.out.println("An error occurred:");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Any error in the search, check the url address:");
                System.out.println(e.getMessage());
            } catch (InvalidYearException e) {
                System.out.println(e.getMessage());
            }
        }
        FileWriter writer = new FileWriter("movies.json");
        writer.write(gson.toJson(titleList));
        writer.close();
        System.out.println(titleList);
        System.out.println("Program finished");
    }
}
