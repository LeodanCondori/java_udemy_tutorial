package com.udemy.springbootwebudemy;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
  @GetMapping("/details")
  public String details(Model model) {
    model.addAttribute("title", "Hello world spring boot!");
    model.addAttribute("name", "Leodan");
    model.addAttribute("lastname", "Condori");
    return "details";
  }

  @GetMapping("/details1")
  public String details1(Map<String, Object> model) {
    model.put("title", "Hello world spring boot!");
    model.put("name", "Leo");
    model.put("lastname", "Condori");
    return "details1";
  }
}
