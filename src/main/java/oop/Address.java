package oop;

public class Address {
    private String city;
    private String street;
    private String country;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (!city.isEmpty())
            this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if (!street.isEmpty())
            this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (!country.isEmpty())
            this.country = country;
    }

    public Address(String city, String street, String country){
        setCity(city);
        setStreet(street);
        setCountry(country);

    }
}
