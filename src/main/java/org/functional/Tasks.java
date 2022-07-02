package org.functional;

import org.functional.model.Address;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {

        List<Address> addressList = new ArrayList<>();
        addressList.add(new Address("Pomorskie", "Gdansk", "Dluga", 200));
        addressList.add(new Address("Pomorskie", "Gdansk", "Hallera", 1005));
        addressList.add(new Address("Pomorskie", "Gdansk", "Partyzantow", 1000));
        addressList.add(new Address("Malopolskie", "Krakow", "Szeroka", 2000));
        addressList.add(new Address("Mazowieckie", "Warszawa", "Jerozolimskie", 500));
        addressList.add(new Address("Pomorskie", "Pruszcz", "Chopina", 50));
        addressList.add(new Address("Pomorskie", "Gdynia", "Swietojanska", 90));
        addressList.add(new Address("Malopolskie", "Zakopane", "Krupowki", 30));
        addressList.add(new Address("Lodzkie", "Lodz", "Piotrkowska", 100));

        Map<String, List<Address>> collect = addressList.stream().collect(Collectors.groupingBy(Address::getState));
        System.out.println(collect);

        List<String> cities = addressList.stream().map(Address::getCity).distinct().collect(Collectors.toList());
        System.out.println(cities);

        String citiesAsString = addressList.stream().map(Address::getCity).distinct().collect(Collectors.joining(","));
        System.out.println(citiesAsString);
    }
}
