package com.car.spares.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterControllerImpl implements IRegisterController {

    //@Autowired private RegisterService registerService;
    @GetMapping("/registration")
    @Override
    public String registerUser(Model model) {
        model.addAttribute("registerModel", new RegisterModel());
        return "registration_page";
    }

    @PostMapping("/registration")
    @Override
    public String captureRegistrationDetails(@ModelAttribute("registerModel") RegisterModel registerModel) {
        System.out.println("Email :" + registerModel.getEmail());
        RegisterService registerService = new RegisterService();
        registerService.registerUser(registerModel);
        return "redirect:/";
    }



}
