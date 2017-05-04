package org.ryanstrong.controllers;

import org.ryanstrong.models.Time;
import org.ryanstrong.models.data.TimeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Created by ryanstrong on 5/1/17.
 */
@Controller
@RequestMapping("home")
public class TimeController {
    @Autowired
    private TimeDao timeDao;

    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("times", timeDao.findAll());
        model.addAttribute("title", "My times");

        return "home";
    }

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute("title", "Add time");
        model.addAttribute(new Time());
        model.addAttribute("times", timeDao.findAll());
        return "/";
    }

    @RequestMapping(value = "home", method = RequestMethod.POST)
    public String add(@ModelAttribute @Valid Time time,
                                       Errors errors,
                                     Model model) {
        if (errors.hasErrors()) {
            model.addAttribute("Add time");
            return "/";
        }
//        CategoryController cat = categoryDao.findOne(categoryId); //minute object

//        newtime.setCategory(cat);
        timeDao.save(time);
        return "redirect:";
    }

}


//    @RequestMapping(value = "remove", method = RequestMethod.GET)
//    public String displayRemovetimeForm(Model model) {
//        model.addAttribute("times", timeDao.findAll());
//        model.addAttribute("title", "Remove time");
//        return "time/remove";
//    }

//    @RequestMapping(value = "remove", method = RequestMethod.POST)
//    public String processRemovetimeForm(@RequestParam int[] timeIds) {
//
//        for (int timeId : timeIds) {
//            timeDao.delete(timeId);
//        }

//        return "redirect:";
//    }


