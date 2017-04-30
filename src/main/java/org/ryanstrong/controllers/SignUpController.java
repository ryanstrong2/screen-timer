package org.ryanstrong.controllers;

import org.ryanstrong.models.User;
import org.ryanstrong.models.data.SignUpDao;
import org.ryanstrong.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by ryanstrong on 4/20/17.
 */
@Controller
@RequestMapping("templates")
public class SignUpController {

    @Autowired
    private SignUpDao signUpDaoDao;
    @Autowired
    private UserDao userDao;

//    @Autowired
//    private TimeDao timeDao;
//    @RequestMapping(value="")
//    public String index(Model model){
//        model.addAttribute("users", userDao.findAll());
//        model.addAttribute("userName", "The Users");
//        return "user/index";
//    }

// TODO SAVE DATA AND LOGIN and verify new user

    @RequestMapping (value ="add", method= RequestMethod.GET )
    public String add(Model model){
        model.addAttribute("userName", "Add user");
        model.addAttribute("password", "Password");
        model.addAttribute(new User());
//        model.addAttribute(new User());
//        model.addAttribute("times", timeDao.findAll());
        return "templates/add";
    }
    @RequestMapping(value="add", method = RequestMethod.POST)
    public String add(@ModelAttribute @Valid User user,
                      Errors errors, Model model){
        if (errors.hasErrors()) {
            model.addAttribute("Add User");
            return "templates/add";
        }
        userDao.save(user);
        return "redirect:";
//    @RequestMapping (value="login", method = RequestMethod.POST)
//    public String loginForm (Model model){
//        model.addAttribute("userName", "Add user");
//        model.addAttribute("password");
//
//    return "login";
//    }
    }
}
