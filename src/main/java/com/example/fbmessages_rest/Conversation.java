package com.example.fbmessages_rest;

import java.util.List;

public class Conversation {

  private List<People> participants;
  private List<Messages> messages;
  private String title;
  private boolean is_still_participant;
  private String thread_type;
  private String thread_path;

  public Conversation() {
  }

  public Conversation(List<People> participants, List<Messages> messages, String title, boolean is_still_participant, String thread_type, String thread_path) {
    this.participants = participants;
    this.messages = messages;
    this.title = title;
    this.is_still_participant = is_still_participant;
    this.thread_type = thread_type;
    this.thread_path = thread_path;
  }

  public List<People> getParticipants() {
    return participants;
  }

  public void setParticipants(List<People> participants) {
    this.participants = participants;
  }

  public List<Messages> getMessages() {
    return messages;
  }

  public void setMessages(List<Messages> messages) {
    this.messages = messages;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isIs_still_participant() {
    return is_still_participant;
  }

  public void setIs_still_participant(boolean is_still_participant) {
    this.is_still_participant = is_still_participant;
  }

  public String getThread_type() {
    return thread_type;
  }

  public void setThread_type(String thread_type) {
    this.thread_type = thread_type;
  }

  public String getThread_path() {
    return thread_path;
  }

  public void setThread_path(String thread_path) {
    this.thread_path = thread_path;
  }

}
