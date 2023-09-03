package com.car.spares.register;

import org.springframework.ui.Model;

public interface IRegisterController {
    String registerUser(Model model);
    String captureRegistrationDetails( RegisterModel registerModel);

}
