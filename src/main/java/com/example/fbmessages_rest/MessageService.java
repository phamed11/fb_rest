package com.example.fbmessages_rest;

import java.util.List;

public interface MessageService {

  void saveAllMessages(Conversation conversation);
  Messages getFirstMessage(Conversation conversation);
  List<Messages> allMessages();
}
