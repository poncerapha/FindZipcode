package models.network;

import com.google.gson.Gson;
import models.Address;
import models.AddressDTO;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SearchAddress {

    public AddressDTO searchAddress(String zipcode) {
        URI uri = URI.create("https://viacep.com.br/ws/" + zipcode + "/json");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), AddressDTO.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException ("Não consegui obter o endereço a partir desse CEP.");
        }
    }
}
