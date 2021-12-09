package balkonsky.jdbc.service;

import balkonsky.jdbc.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{

    @Override
    public List<Car> getList(int count, List<Car> cars) {
        if (count > 0 && count < 5) {
            return cars.subList(0, count);
        } else return cars;
    }
}
