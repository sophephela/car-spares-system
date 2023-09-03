package com.car.spares.signin;

import com.car.spares.signin.SignInModel;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

public interface ISignInController {

    String showSignInPage(Model model);
    public String captureSigninDetails( SignInModel signInModel);
}
