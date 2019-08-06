package com.zqxsober.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/view",method = RequestMethod.GET)
public class ViewController {

    @RequestMapping(value = "/zqxsober",method = RequestMethod.GET)
    public String view(){
        return "zqxsober";
    }
}
