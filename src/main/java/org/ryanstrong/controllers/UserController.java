package org.ryanstrong.controllers;

import org.ryanstrong.models.data.TimeDao;
import org.ryanstrong.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ryanstrong on 4/20/17.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private TimeDao timeDao;

    @RequestMapping(value="")
    public String index(Model model){
        model.addAttribute("users", userDao.findAll());
        model.addAttribute("userName", "The Users");
    return "user/index";
    }

    @RequestMapping (value ="add", method= RequestMethod.GET )
    public String display(Model model){
        model.addAttribute("userName", "Add user");
//        model.addAttribute(new User());
        model.addAttribute("times", timeDao.findAll());
        return "user/add";
    }
}
