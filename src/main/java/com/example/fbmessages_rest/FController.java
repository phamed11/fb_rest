package com.example.fbmessages_rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FController {
  MessageService messageService;

  @Autowired
  public FController(MessageService messageService) {
    this.messageService = messageService;
  }

  @PostMapping("/face")
  public String uploadMessages(@RequestBody (required = false) Conversation conversation) {
    messageService.saveAllMessages(conversation);
    return "all saved";
  }

  @RequestMapping(value = "/face1", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
  public Messages getFirstMessage(@RequestBody (required = false) Conversation conversation) {
    Messages message = messageService.getFirstMessage(conversation);
    return message;
  }
}
