package org.ryanstrong.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
    private final long start;

    public Time(long start) {
        this.start = start;
    }
    public Time(){
        start = System.currentTimeMillis();

    }
    public double timeSpent(){
        long now=System.currentTimeMillis();
        return (long) ((now-start)/1000.0);

    }
    @OneToMany
    @JoinColumn(username = "time_id")
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

    public long getStart(){return start;}

        public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
// todo add time daily
}