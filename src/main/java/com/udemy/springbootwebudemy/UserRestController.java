package com.udemy.springbootwebudemy;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class UserRestController {

  @GetMapping("/details")
  public Map<String, Object> details() {
    Map<String, Object> body = new HashMap<>();
    body.put("title", "Hello world spring boot!");
    body.put("name", "Leo");
    body.put("lastname", "Condori");
    return body;
  }

  @RequestMapping("/details3") // this is GET by default
  public Map<String, Object> details3() {
    Map<String, Object> body = new HashMap<>();
    body.put("title", "Hello world spring boot!");
    body.put("name", "Leito");
    body.put("lastname", "Condori");
    return body;
  }

  @RequestMapping(path = "/details4", method = RequestMethod.GET)
  public Map<String, Object> details4() {
    Map<String, Object> body = new HashMap<>();
    body.put("title", "Hello world spring boot!");
    body.put("name", "Leito pequeñin!");
    body.put("lastname", "Condori");
    return body;
  }
}
