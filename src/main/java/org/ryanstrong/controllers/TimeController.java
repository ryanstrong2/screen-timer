package org.ryanstrong.controllers;

import org.ryanstrong.models.Time;
import org.ryanstrong.models.User;
import org.ryanstrong.models.data.TimeDao;
import org.ryanstrong.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryanstrong on 3/26/17.
 */
@Controller
@RequestMapping("")
public class TimeController {

    @Autowired
    private UserDao userDao;
    @Autowired
    private TimeDao timeDao;

    @RequestMapping(value="")
    public String index(Model model){
        model.addAttribute("times", timeDao.findAll());
        model.addAttribute("name", "Time Available");
        return "time/index";
    }
//    @oneToMany
//    @JoinColumn()
    private List<User> users = new ArrayList<>();

    @RequestMapping(value="add", method =  RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("title", "Add Time");
        model.addAttribute(new Time());
        return "time/add";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute @Valid Time time,
                      Errors errors, Model model){
        if (errors.hasErrors()){
            model.addAttribute("Add Time");
            return "time/add";
        }
        timeDao.save(time);
        return "redirect:";
    }
    @RequestMapping(value = "subtract", method = RequestMethod.GET)
    public String displaySubtractTimeForm(Model model){
        model.addAttribute("times", timeDao.findAll());
        model.addAttribute("title", "Subtract Time");
        return "user/subtract";
//    @RequestMapping(value = "subtract", method = RequestMethod.POST)
//    public String processSubstractTimeForm(@RequestParam int[] timeIds){
//        for(int timeId : timeIds){
//            timeDao.exists(timeId);
//
//        }
//        return "redirect:";
        }

    }



