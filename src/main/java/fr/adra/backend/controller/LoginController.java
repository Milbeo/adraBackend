package fr.adra.backend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "bienvenu ton appel à lgin fonctionné";
    }
}
