package com.springbatch.batchprocessing;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "people")
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer person_id;
    
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "first_name")
    private String firstName;
  
    public Person() {
    }
  
    public Person(String firstName, String lastName) {
      this.firstName = firstName;
      this.lastName = lastName;
    }
  
    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }
  
    public String getFirstName() {
      return firstName;
    }
  
    public String getLastName() {
      return lastName;
    }
  
    public void setLastName(String lastName) {
      this.lastName = lastName;
    }
  
    @Override
    public String toString() {
      return "firstName: " + firstName + ", lastName: " + lastName;
    }
  
  }
