package com.spring.henallux.demo.controller;

import com.spring.henallux.demo.Constant;
import com.spring.henallux.demo.dataAccess.dao.UserDAO;
import com.spring.henallux.demo.model.User;
import com.spring.henallux.demo.service.HobbiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/inscription")
@SessionAttributes({Constant.CURRENT_USER})
public class UserInscriptionController {
    private HobbiesService hobbiesService;
    private UserDAO userDAO;

    @ModelAttribute(Constant.CURRENT_USER)
    public User user() {
        return new User();
    }

    @Autowired
    public UserInscriptionController(HobbiesService hobbiesService, UserDAO userDAO) {
        this.hobbiesService = hobbiesService;
        this.userDAO = userDAO;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
//        model.addAttribute("user", new User());
        model.addAttribute("hobbies", hobbiesService.getHobbies());
        return "integrated:userInscription";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/form")
    public String getFormData(Model model, @Valid @ModelAttribute(value = Constant.CURRENT_USER) User user, final BindingResult error) {
        System.out.println(user.getAge());
        System.out.println(user.getHobby());
        System.out.println(user.getMale());
        System.out.println(user.getName());

        if (error.hasErrors())
            return "redirect:/inscription";
        else
        {
            userDAO.saveUser(user);
            return "redirect:/gift";
        }
    }
}
