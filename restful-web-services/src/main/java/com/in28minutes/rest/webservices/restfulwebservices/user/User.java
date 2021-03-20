package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.Date;

public class User {
    
    private Integer id;
    private String name;
    private Date birthdate;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthdate() {
        return this.birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public User(Integer id, String name, Date birthdate) {
        super();
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", birthdate='" + getBirthdate() + "'" +
            "}";
    }

}