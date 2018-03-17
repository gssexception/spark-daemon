package com.gss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by DG on 16.05.2015.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home() {
        return "index";
    }
}
