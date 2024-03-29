package com.ap.ap.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomErrorController implements ErrorController {

  @RequestMapping("/api/error")
  @ResponseBody
  String error(HttpServletRequest request) {
    return "<h1>Error occurred</h1>";
  }

}