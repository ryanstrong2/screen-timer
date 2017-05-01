package org.ryanstrong.controllers;

import org.ryanstrong.models.Time;
import org.ryanstrong.models.data.TimeDao;
import org.ryanstrong.models.data.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

//import org.ryanstrong.models.User;
//import org.ryanstrong.models.data.UserDao;

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
//    @Autowired
//    public StopWatch stopWatch;
//    public TimeController(StopWatch watch){
//        this.stopWatch=watch;
//    }
    @RequestMapping(value="")
    public String index(Model model){
        model.addAttribute("times", timeDao.findAll());
        model.addAttribute("unit", "Time selector");
        return "/home";
    }
//    @oneToMany
//    @JoinColumn()
//    private List<User> users = new ArrayList<>();

    @RequestMapping(value="add", method =  RequestMethod.GET)
    public String add(Model model){
        model.addAttribute("title", "Add Time");
        model.addAttribute("histime", new Time());
        return "/add";
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute Time time,
                      Errors errors, Model model){
        if (errors.hasErrors()){

            model.addAttribute("Add Time");
            return "/add";
        }
        timeDao.save(time);
        return "redirect:";
    }
    @RequestMapping(value = "subtract", method = RequestMethod.GET)
    public String displaySubtractTimeForm(Model model) {
//        model.addAttribute("times", timeDao.findAll());
//        model.addAttribute("title", "Subtract Time");
        return "/subtract";
    }
        // hard code time options or create array list and set valid amounts
        // or in html <option value"30" >30<option>
        // enum of values can be used to add or subtract // add daily
    @RequestMapping(value = "subtract", method = RequestMethod.POST)
    public String saveSubtractTimeForm(@RequestParam  Model model){
//        for(int timeId : timeIds){
//            timeDao.exists(timeId);
//        }
//        timeDao.save(time);
        // like cheese or menu
        return "redirect:";
        }
    @RequestMapping(value = "start", method = RequestMethod.GET)
    public String start(Model model) {
        return "/start";
    }
    @RequestMapping(value = "end", method = RequestMethod.GET)
    public String stop(Model model){
        return "/end";
    }
    @RequestMapping(value = "total", method = RequestMethod.GET)
    public String total(Model model){
        return "/total";
    }
//    @RequestMapping(value = "start", method = RequestMethod.GET)
//    public String start(Model model)

    }



