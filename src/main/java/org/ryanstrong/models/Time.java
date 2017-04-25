package org.ryanstrong.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by ryanstrong on 4/22/17.
 */
@Entity
public class Time {


    @Id
    @GeneratedValue  //annotations
    private int id; //field

    @NotNull
    @Size(min= 3, max=15)
    private String name; //property instance variable


//    @OneToMany
//    @JoinColumn(name = "time_id")
    private List<User> users = new ArrayList<>();


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

}