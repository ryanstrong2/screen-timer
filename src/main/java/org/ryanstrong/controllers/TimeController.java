package org.ryanstrong.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ryanstrong on 3/26/17.
 */
@Controller
@RequestMapping("")
public class TimeController {

    @RequestMapping(value="")
//    @ResponseBody

    public String index(){
        return "index";

    }

}


