package com.example.fbmessages_rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.nio.charset.StandardCharsets.ISO_8859_1;
import static java.nio.charset.StandardCharsets.UTF_8;

@Service
public class MessageServiceImpl implements MessageService {

  MessageRepository messageRepository;
  PeopleRepository peopleRepository;
  private final static String PHOTOPATH = "/media/";


  @Autowired
  public MessageServiceImpl(MessageRepository messageRepository, PeopleRepository peopleRepository) {
    this.messageRepository = messageRepository;
    this.peopleRepository = peopleRepository;
  }

  public void saveAllMessages(Conversation conversation) {
    for (int i = 0; i < conversation.getMessages().size(); i++) {
      if (conversation.getMessages().get(i).getContent() == null) {
        conversation.getMessages().get(i).setContent("EMPTY");
      }
      String content = conversation.getMessages().get(i).getContent();
      String sender = conversation.getMessages().get(i).getSender_name();
      byte[] ptext = content.getBytes(ISO_8859_1);
      byte[] ptext2 = sender.getBytes(ISO_8859_1);
      String value = new String(ptext, UTF_8);
      String valuesender = new String(ptext2, UTF_8);
      conversation.getMessages().get(i).setContent(value);
      conversation.getMessages().get(i).setSender_name(valuesender);
      if (conversation.getMessages().get(i).getPhotos() != null) {
        for (int j = 0; j < conversation.getMessages().get(i).getPhotos().size(); j++) {
          conversation.getMessages().get(i).getPhotos().get(j).setUri(PHOTOPATH + conversation.getMessages().get(i).getPhotos().get(j).getUri());
        }
      }
      messageRepository.save(conversation.getMessages().get(i));
    }
  }

  public Messages getFirstMessage(Conversation conversation) {
    Messages message = conversation.getMessages().get(0);
    return message;
  }

  public List<Messages> allMessages() {
    return messageRepository.findAll();
  }
}
