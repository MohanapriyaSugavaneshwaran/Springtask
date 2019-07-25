package com.memorynotfound.controller;

import javax.sql.DataSource;

import com.memorynotfound.Model.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    DataSource datasource;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("message", "welcome ! Spring MVC XML Config Example");
        return "welcome";
    }

    @RequestMapping(value="/login")
    public String login()
    {
           return "login";
    }

    @RequestMapping(value="/loginprocess")
    public ModelAndView loginprocess(@ModelAttribute("login")Login login)
    {
        String sql="insert into student values(?,?)";
        jdbcTemplate.update(sql,new Object[]{login.getName(),login.getPassword()});
        
        ModelAndView mav =new ModelAndView("welcome");
        mav.addObject("name",login.getName());
        return mav;
    }
}