package BT7;

public class Address {
    private String country, city, district, street;

    public Address(String country, String city, String district, String street) {
        this.country = country;
        this.city = city;
        this.district = district;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public String getStreet() {
        return street;
    }

    public String toString(){
        return "Country: "+this.country+" City: "+this.city+" District: "+this.district+" Street: "+this.street;
    }
}
