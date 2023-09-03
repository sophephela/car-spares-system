package com.car.spares.sparecenter;

import org.springframework.ui.Model;

public interface ISpareCenterRegisterController {

    String showSpareCentreRegPage(Model model);
    String registerSpareCentre(SpareCenterRegisterModel spareCentre);
}
