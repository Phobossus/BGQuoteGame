package com.phobossus.bgquotegame.controllers;

import com.phobossus.bgquotegame.registration.RegistrationService;
import com.phobossus.bgquotegame.registration.model.GameUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// @RestController
public class RegistrationController {

    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @GetMapping("/register")
    public String register() {
        GameUser gameUser = new GameUser(); // from params
        registrationService.register(gameUser);
        return "Registration successful";
    }

}
