package balkonsky.jdbc.service;
import balkonsky.jdbc.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getList(int count, List<Car> cars);
}
