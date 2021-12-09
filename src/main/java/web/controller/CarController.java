package web.controller;

import balkonsky.jdbc.model.Car;
import balkonsky.jdbc.service.CarService;
import balkonsky.jdbc.service.CarServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String carList (@RequestParam(value = "count", required = false) String count, ModelMap model) {
        CarService carService = new CarServiceImp();
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Civic", "Black", 2007));
        cars.add(new Car("Accord", "Red", 2017));
        cars.add(new Car("Jazz", "Yellow", 2008));
        cars.add(new Car("CR-V", "White", 2021));
        cars.add(new Car("N-Box", "Blue", 2016));

        if (count == null) {
            model.addAttribute("cars", carService.getList(0, cars));
        } else {
            model.addAttribute("cars", carService.getList(Integer.parseInt(count), cars));
        }
        return "cars";
    }
}
