package org.ryanstrong.controllers;

import org.ryanstrong.models.Minute;
import org.ryanstrong.models.data.MinuteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;

/**
 * Created by ryanstrong on 5/3/17.
 */

@Controller
@RequestMapping("minute")
public class MinuteController {

    @Autowired
    private MinuteDao minuteDao;

    //    private Integer minuteId;
//    public Integer sum(Model model, @RequestParam int minuteId) {
//
//
//    Minute min = minuteDao.findOne(minuteId); //minute object
//    return "minute"
//    }
    @RequestMapping(value="")
    public String index(Model model){
//                        @RequestParam int minuteId){
//        Minute min = minuteDao.findOne(minuteId);

        model.addAttribute("totalMinutes", minuteDao.findAll());
        model.addAttribute("title", "Minute List Page");
        return "minute/index";
    }
    @RequestMapping(value="add", method = RequestMethod.GET)
    public String add(  Model model){
        model.addAttribute("title", "Add Minute");
        model.addAttribute(new Minute());
        model.addAttribute("minutes", minuteDao.findAll());
        return "minute/add";
    }

    @RequestMapping(value="add", method = RequestMethod.POST)
    public String add(@ModelAttribute @Valid Minute minute,  Minute addMinute,
                      Errors errors,  Model model){
        if (errors.hasErrors()) {
            model.addAttribute("Add Minute");
            return "minute/add";
        }
//        Integer addMinute;
//        minute.setMinute(min);
//        min + minute= minute;
        minuteDao.save(minute);
//        minuteDao.save(totalMinute);
        return "redirect:";

    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String displayRemoveForm(Model model) {
        model.addAttribute("minutes", minuteDao.findAll());
        model.addAttribute("title", "Reduce Time");
        return "minute/add";
    }

    @RequestMapping(value = "index", method = RequestMethod.POST)
    public String processRemoveForm(@RequestParam int[] minuteIds) {

        for (int minuteId : minuteIds) {
            minuteDao.delete(minuteId);
        }

        return "redirect:";
    }

}
