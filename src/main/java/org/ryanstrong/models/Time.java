package org.ryanstrong.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


/**
 * Created by ryanstrong on 4/22/17.
 */
@Entity
public class Time {


    @Id
    @GeneratedValue  //annotations
    private int id; //field

    @NotNull
//    @Size(min= 1, max=2)
    private int name; //property instance variable
//    private final long start;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Time() {
        
    }

    public void addItem(User theUser) {
    }

//    public Time(Iterable<User> all, Time time){
//        start = System.currentTimeMillis();

//    }
//    public double timeSpent(){
//        long now=System.currentTimeMillis();
//        return (long) ((now-start)/1000.0);

//    }
//    @OneToMany
//    @JoinColumn(username = "time_id")
//    private List<User> users = new ArrayList<>();
//    public int getId() {
//        return id;
//    }
//
//    public int getName() {
//        return name;
//    }
//
//    public void setName(int name) {
//        this.name = name;
    }

//    public long getStart(){return start;}

//        public List<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(List<User> users) {
//        this.users = users;
//    }
//
//    public void addItem(User theUser) {
//    }


// todo add time daily
//}