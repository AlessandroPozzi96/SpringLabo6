package com.spring.henallux.demo.controller;

import com.spring.henallux.demo.dataAccess.dao.MagicKeyDAO;
import com.spring.henallux.demo.model.MagicKeyForm;
import org.apache.tomcat.util.log.SystemLogHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

@Controller
@RequestMapping(value = "/hello")
public class WelcomeController {
    private MagicKeyDAO magicKeyDAO;

    @Autowired
    public WelcomeController(MagicKeyDAO magicKeyDAO) {
        this.magicKeyDAO = magicKeyDAO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("title", "Welcome Page");
        model.addAttribute("magicKey", new MagicKeyForm());
        return "integrated:welcome";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/form")
    public String form(Model model, @ModelAttribute(value = "magicKey") MagicKeyForm magicKey)
    {
        ArrayList<String> strings = magicKeyDAO.getMagicKeys();
        if (strings.contains(magicKey.getMagicKey()))
            return "redirect:/inscription";
        else
            return "integrated:welcome";
    }

}
