package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars = Arrays.asList(
            new Car("Model S", "Tesla", 2020),
            new Car("Mustang", "Ford", 2019),
            new Car("Civic", "Honda", 2018),
            new Car("Camry", "Toyota", 2021),
            new Car("A4", "Audi", 2022)
    );

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
