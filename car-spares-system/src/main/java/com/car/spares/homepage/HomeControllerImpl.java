package com.car.spares.homepage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllerImpl implements IHomeController{
    @GetMapping("/home")
    @Override
    public String showHomePage() {
        return "homePage";
    }
}
