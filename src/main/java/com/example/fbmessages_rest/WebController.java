package com.example.fbmessages_rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

  MessageService messageService;

  @Autowired
  public WebController(MessageService messageService) {
    this.messageService = messageService;
  }

  @GetMapping("/")
  public String homePage(Model model) {
    model.addAttribute("facebookmessage", messageService.allMessages());
    return "index";
  }
}
