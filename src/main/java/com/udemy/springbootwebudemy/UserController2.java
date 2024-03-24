package com.udemy.springbootwebudemy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/api")
public class UserController2 {

  @GetMapping("/details2")
  @ResponseBody
  public Map<String, Object> details() {
    Map<String, Object> body = new HashMap<>();
    body.put("title", "Hello world spring boot!");
    body.put("name", "Leonidas");
    body.put("lastname", "Condori");
    return body;
  }
}
