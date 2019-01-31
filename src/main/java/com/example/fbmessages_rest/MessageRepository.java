package com.example.fbmessages_rest;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MessageRepository extends CrudRepository<Messages, Long> {

  List<Messages> findAll();
}
