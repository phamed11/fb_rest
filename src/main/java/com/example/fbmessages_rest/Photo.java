package com.example.fbmessages_rest;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Photo {



  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String uri;
  private Date creation_timestamp;

  public Photo(String uri, Date creation_timestamp) {
    this.uri = uri;
    this.creation_timestamp = creation_timestamp;
  }

  public Photo() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Date getCreation_timestamp() {
    return creation_timestamp;
  }

  public void setCreation_timestamp(Date creation_timestamp) {
    this.creation_timestamp = creation_timestamp;
  }
}
