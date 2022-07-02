package org.functional;

import org.functional.model.Address;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger("App");

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

        // Only addresses which states are Pomorskie
        List<Address> pomorskie = addressList.stream()
                .filter(address -> address.getState().equals("Pomorskie"))
                .collect(Collectors.toList());

        logger.info(pomorskie.toString());

        // Only addresses which cities begin with "Z"
        List<Address> zCities = addressList.stream()
                .filter(address -> address.getCity().startsWith("Z"))
                .collect(Collectors.toList());

        logger.info(zCities.toString());

        // Only cities
        List<String> collectCities = addressList.stream()
                .map(address -> address.getCity())
                .collect(Collectors.toList());

        logger.info(collectCities.toString());
    }
}