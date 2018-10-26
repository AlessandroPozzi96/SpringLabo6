package com.spring.henallux.demo.controller;

import com.spring.henallux.demo.dataAccess.entity.UtilisateurEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("utilisateurEntity", new UtilisateurEntity());
        return "integrated:login";
    }
}
