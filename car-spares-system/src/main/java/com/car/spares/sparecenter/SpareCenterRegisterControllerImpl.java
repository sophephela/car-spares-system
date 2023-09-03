package com.car.spares.sparecenter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SpareCenterRegisterControllerImpl implements ISpareCenterRegisterController {

    @Override
    @GetMapping("/carsparesregistration")
    public String showSpareCentreRegPage(Model model) {
        return "carsparesRegistration_page";
    }

    @Override
    @PostMapping("/carsparesregistration")
    public String registerSpareCentre(SpareCenterRegisterModel spareCentre) {
        return null;
    }
}
