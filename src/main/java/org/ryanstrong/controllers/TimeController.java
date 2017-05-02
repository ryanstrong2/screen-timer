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
@RequestMapping("time")
public class TimeController {





    @Autowired
    private TimeDao timeDao;

//    @Autowired
//    private CategoryDao categoryDao;

//    @ManyToOne
//    private Category category;
    @RequestMapping(value = "")
    public String index(Model model) {

        model.addAttribute("times", timeDao.findAll());
        model.addAttribute("title", "My times");

        return "time/index";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddtimeForm(Model model) {
        model.addAttribute("title", "Add time");
        model.addAttribute(new Time());
        model.addAttribute("times", timeDao.findAll());
        return "time/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String processAddtimeForm(@ModelAttribute @Valid Time newTime,
                                       Errors errors,
//                                     @RequestParam int categoryId,
                                     Model model) {

        if (errors.hasErrors()) {
            model.addAttribute("title", "Add time");
            return "time/add";
        }
//        Category cat = categoryDao.findOne(categoryId); //category object

//        newtime.setCategory(cat);
        timeDao.save(newTime);
        return "redirect:";
    }}


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


