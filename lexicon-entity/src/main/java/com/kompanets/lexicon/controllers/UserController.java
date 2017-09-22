package com.kompanets.lexicon.controllers;

import com.kompanets.lexicon.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserController {
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    //@RequestMapping(method = RequestMethod.GET)
    public User getUser() {
        return new User();
    }

}
