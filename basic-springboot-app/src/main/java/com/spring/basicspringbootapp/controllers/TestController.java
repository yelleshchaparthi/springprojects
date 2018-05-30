package com.spring.basicspringbootapp.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Yelleshs on 5/29/2018.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String testGetCall() {
        return "Yellesh";
    }


    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public String testPOSTCall(@RequestBody String information) {
        return "This is the post info from APi"+information;
    }

}
