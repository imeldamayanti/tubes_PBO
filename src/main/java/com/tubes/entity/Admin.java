package com.tubes.entity;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {
  
  @Override
  public void login(){};  
}
