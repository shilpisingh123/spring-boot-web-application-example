package com.boraji.tutorial.springboot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.boraji.tutorial.springboot.model.User;
@Controller
@RestController
public class RegistrationController {
  @Autowired
  public UserService userService;
  
  @RequestMapping(value = "/register", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	  System.out.println("Hellospringboot");
    ModelAndView mav = new ModelAndView("register");
    System.out.println("Hellospringboot2");
    mav.addObject("user", new User());
    return mav;
  }
  
  @RequestMapping(value = "/registerProcess", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
		 
  @ModelAttribute("user") User user) {
  System.out.println("Got req for registerProcess");
  ModelAndView mav = new ModelAndView("registraion");
      mav.addObject("user", new User());
  return mav;
  
  }}
  
