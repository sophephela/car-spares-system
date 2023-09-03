package com.car.spares.signin;

import com.car.spares.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignInControllerImpl implements ISignInController {

    @Autowired private UserService userService;
    @GetMapping("/login")
    @Override
    public String showSignInPage(Model model) {
        model.addAttribute("SignInModel", new SignInModel());
        return "login_page";
    }

    @PostMapping("/login")
    @Override
    public String captureSigninDetails(@ModelAttribute("SignInModel") SignInModel signInModel){
        //userService.getUser(user.getEmail());
        System.out.println("LOGIN: " + signInModel.getEmail());
        return "redirect:/";
    }
}
