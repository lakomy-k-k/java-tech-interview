package com.interview.tech.techinterview.repository;

import com.interview.tech.techinterview.model.Car;
import net.andreinc.mockneat.abstraction.MockUnit;

import java.util.List;
import java.util.Locale;

import static net.andreinc.mockneat.unit.financial.Money.money;
import static net.andreinc.mockneat.unit.misc.Cars.cars;
import static net.andreinc.mockneat.unit.objects.Constructor.constructor;
import static net.andreinc.mockneat.unit.time.LocalDates.localDates;

public class CarRepository {
    private final MockUnit<Car> carsGenerator = constructor(Car.class)
            .params(
                    cars().brands(),
                    localDates(),
                    money().locale(Locale.UK).range(1000, 10000)
            );

    public List<Car> getAvailableCars(int numberOfCars) {
        return carsGenerator.list(numberOfCars).get();
    }


}
