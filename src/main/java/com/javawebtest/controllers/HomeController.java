package com.javawebtest.controllers;

import com.javawebtest.daos.ITeamDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by martinmendez on 7/14/15.
 */
@Controller
public class HomeController {

    private ITeamDAO teamDAO;

    @Autowired(required=true)
    public void setTeamDao(ITeamDAO teamDao){
        this.teamDAO = teamDao;
    }


    @RequestMapping(value="/", method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        model.addAttribute("message", "Hello world");
        return "index";
    }
}
