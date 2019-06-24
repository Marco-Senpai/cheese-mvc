package org.launchcode.cheesemvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("cheese")
public class CheeseController {

    // request path: /cheese
    @RequestMapping(value = "")
    public String index() {
        return "cheese/index";
    }
}
