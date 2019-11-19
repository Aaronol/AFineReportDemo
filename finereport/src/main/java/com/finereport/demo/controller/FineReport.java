package com.finereport.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/finereport")
public class FineReport {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String showFine() {
        return "show";
    }

}
