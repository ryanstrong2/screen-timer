package org.ryanstrong.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * Created by ryanstrong on 5/3/17.
 */
@Entity
public class Minute {
    @Id
    @GeneratedValue  //annotations
    private int id; //field

    @NotNull
    private Integer name; //property instance variable

//    public Minute() {
//        this.total = total;
//    }
//
//    public Integer getTotal() {
//        return total;
//    }
//
//    private Integer total;


    public int getId() {
        return id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }}
