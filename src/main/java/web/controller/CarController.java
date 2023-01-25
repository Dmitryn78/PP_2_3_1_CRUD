package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servise.CarService;
import web.servise.CarServiceImp;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
   private CarService carService = new CarServiceImp();
    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", required = true, defaultValue = "5") int count, Model model) {
        model.addAttribute("message", carService.getListOfCars(carService.createListOfCars(), count));
        return "cars";
    }
}
