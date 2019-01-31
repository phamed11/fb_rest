package com.example.fbmessages_rest;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Messages {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String sender_name;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date timestamp_ms;
  @Column(length = 3000)
  private String content;
  private String type;
  @OneToMany(cascade = {CascadeType.ALL})
  private List<Photo> photos;

  public Messages() {
  }

  public Messages(String sender_name, Date timestamp_ms, String content, String type) {
    this.sender_name = sender_name;
    this.timestamp_ms = timestamp_ms;
    this.content = content;
    this.type = type;
  }

  public String getSender_name() {
    return sender_name;
  }

  public void setSender_name(String sender_name) {
    this.sender_name = sender_name;
  }

  public Date getTimestamp_ms() {
    return timestamp_ms;
  }

  public void setTimestamp_ms(Date timestamp_ms) {
    this.timestamp_ms = timestamp_ms;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<Photo> getPhotos() {
    return photos;
  }

  public void setPhotos(List<Photo> photos) {
    this.photos = photos;
  }
}
