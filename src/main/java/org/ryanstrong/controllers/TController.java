package org.ryanstrong.controllers;

import org.ryanstrong.models.Time;
import org.ryanstrong.models.User;
import org.ryanstrong.models.data.TimeDao;
import org.ryanstrong.models.data.UserDao;
import org.ryanstrong.models.forms.SignUpForm;
import org.ryanstrong.models.forms.SubtractTimeForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

//import org.ryanstrong.models.User;
//import org.ryanstrong.models.data.UserDao;

/**
 * Created by ryanstrong on 3/26/17.
 */
@Controller
@RequestMapping("")
public class TController {

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
    public int add(Model model){
        model.addAttribute("title", "Add Time");
        model.addAttribute("histime", new Time());
        return 7;
    }
    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(@ModelAttribute Time time,
                      Errors errors, Model model){
        if (errors.hasErrors()){

            model.addAttribute("Add Time");
            return "/home";
        }
        timeDao.save(time);
        return "redirect:";
    }
    @RequestMapping(value = "subtract", method = RequestMethod.GET)
    public String displaySubtractTimeForm(Model model) {
        model.addAttribute("times", timeDao.findAll());
        model.addAttribute("title", "Subtract Time");
        model.addAttribute("subtract", new Time());
        return "/subtract";
    }
//        // hard code time options or create array list and set valid amounts
//        // or in html <option value"30" >30<option>
//        // enum of values can be used to add or subtract // add daily
//
//    @RequestMapping(value = "subtract", method = RequestMethod.POST)
//    public String saveSubtractTimeForm(@RequestParam  Model model){
////        for(int timeId : timeIds){
////            timeDao.exists(timeId);
////        }
////        timeDao.save(time);
//        // like cheese or menu
//        return "redirect:";
//        }
@RequestMapping(value = "subtract/{userId}", method = RequestMethod.GET)
public String addItem(Model model, @PathVariable int userId)
{
    Time time = timeDao.findOne(userId);
//    SignUpForm signUpForm= new SignUpForm(userDao.findOne());
    Time form = new Time(
//            userDao.findAll(),
//            time
    );
    model.addAttribute("title", "Decrease time: " + time.getAmount());
    model.addAttribute("form", form);
    return "total";
}
    @RequestMapping(value = "subtract", method = RequestMethod.POST)

    public String addItem(Model model,
                          @ModelAttribute @Valid SubtractTimeForm form, SignUpForm signUpForm, Errors errors
    ){
        if (errors.hasErrors()) {
            model.addAttribute("form", form);
            return "menu/add-item";
        }
        Time theTime = timeDao.findOne(form.getTimeId());
        User theUser = userDao.findOne(form.getUserId());

        theTime.addItem(theUser);
       timeDao.save(theTime);
        return "redirect:/menu/view/" + theTime.getId();
    }
    @RequestMapping(value = "start", method = RequestMethod.GET)
    public String start(Model model) {
        model.addAttribute("start", new SubtractTimeForm());
        return "/start";
    }
    @RequestMapping(value = "end", method = RequestMethod.GET)
    public String stop(Model model){
        model.addAttribute("end", new SubtractTimeForm());
        return "/end";
    }
    @RequestMapping(value = "total", method = RequestMethod.GET)
    public String total(Model model){
        model.addAttribute("total", new SubtractTimeForm());
        return "/total";
    }
//    @RequestMapping(value = "start", method = RequestMethod.GET)
//    public String start(Model model)

    }



