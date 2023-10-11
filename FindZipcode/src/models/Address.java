package models;

public class Address {

    private String zipcode;
    private String address;
    private String neighborhood;
    private String city;
    private String state;

    public Address(AddressDTO addressDTO) {
        this.zipcode = addressDTO.cep();
        this.address = addressDTO.logradouro();
        this.neighborhood = addressDTO.bairro();
        this.city = addressDTO.localidade();
        this.state = addressDTO.uf();
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    @Override
    public String toString() {
        return "Address{" +
                "zipcode='" + zipcode + '\'' +
                ", address='" + address + '\'' +
                ", neighborhood='" + neighborhood + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
