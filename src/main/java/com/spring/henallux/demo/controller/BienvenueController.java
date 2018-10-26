package com.spring.henallux.demo.controller;

import com.spring.henallux.demo.dataAccess.dao.UtilisateurDAO;
import com.spring.henallux.demo.model.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/bienvenue")
public class BienvenueController {
    private UtilisateurDAO utilisateurDAO;

    @Autowired
    public BienvenueController(UtilisateurDAO utilisateurDAO) {
        this.utilisateurDAO = utilisateurDAO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("utilisateur", new Utilisateur());
        return "integrated:bienvenue";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/form")
    public String register(Model model, @ModelAttribute(value = "utilisateur") Utilisateur utilisateur, final BindingResult error) {
        if (error.hasErrors()) {
            System.out.println("Controller Bienvenue : méthode POST : Binding échoué !");
            return "redirect:/bienvenue";
        }
        else
        {
            System.out.println("Controller Bienvenue : méthode POST : Binding réussi");
            utilisateurDAO.saveUtilisateur(utilisateur);
            return "integrated:authenticated";
        }
    }
}
