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
 * Created by ryanstrong on 4/20/17.
 */
@Entity
public class User {
    //    User newCat = new User();
    @Id
    @GeneratedValue  //annotations
    private int id; //field

    @NotNull
    @Size(min= 3, max=15)
    private String name; //property instance variable


    @OneToMany
    @JoinColumn(name = "category_id")
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
//    public List<Cheese> getCheeses() {
//        return cheeses;
//    }

    public void setCheeses(List<Cheese> cheeses) {
        this.cheeses = cheeses;
    }

}
