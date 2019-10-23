package com.utm.course.web.controller;

import java.util.HashMap;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

  @GetMapping("/user")
  @ResponseBody
  public Map<String, String> user() {
    Map<String, String> user = new HashMap<>();
    user.put("username", "denis");
    return user;
  }

}
