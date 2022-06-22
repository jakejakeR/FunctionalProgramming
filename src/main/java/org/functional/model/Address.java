package org.functional.model;

public class Address {

    private final String state;
    private final String city;
    private final String street;
    private final Integer population;

    public Address(String state, String city, String street, Integer population) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.population = population;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", population=" + population +
                '}';
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public Integer getPopulation() {
        return population;
    }
}
