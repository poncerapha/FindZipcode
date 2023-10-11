package models.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import models.AddressDTO;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator {

    public void saveJson(AddressDTO addressDTO) throws IOException {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter fileWriter = new FileWriter(addressDTO.cep() + ".json");
        fileWriter.write(gson.toJson(addressDTO));
        fileWriter.close();
    }
}
