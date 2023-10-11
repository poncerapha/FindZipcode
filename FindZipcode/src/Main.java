import models.Address;
import models.AddressDTO;
import models.network.SearchAddress;
import models.utils.FileGenerator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SearchAddress searchAddress = new SearchAddress();
        String search = "";

        System.out.println("Digite um cep ou sair para encerrar o programa");
        search = scanner.nextLine();

        try {
            AddressDTO newAddress = searchAddress.searchAddress(search);
            System.out.println(newAddress);
            FileGenerator fileGenerator = new FileGenerator();
            fileGenerator.saveJson(newAddress);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicacao");
        }
    }
}