package org.ryanstrong.models;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.OneToMany;

import org.springframework.data.annotation.Persistent;

import javax.persistence.*;
import javax.persistence.JoinColumn;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * Created by ryanstrong on 4/20/17.
 */
@Entity
@Table
public class User {

    @Persistent
    private Set<Role> roles;
    //    user newCat = new user();
    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min= 3, max=15)
    private String username;
    private String password;
    private String passwordConfirm;
//    @Persistent
//    private Time time;

//    @ManyToMany(mappedBy = "users")
//    private List<third> thirds;

//    public User(String name, String level){
//        this.name = name;
//        this.level = level;
//    }
//    @OneToMany
//    @JoinColumn(name = "category_id")
//    private List<user> users = new ArrayList<>();

    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String name) {
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password=password;
    }
    @Transient
    public String getPasswordConfirm(){
        return passwordConfirm;
    }
    public void setPasswordConfirm(String passwordConfirm){
        this.passwordConfirm = passwordConfirm;
    }
    @ManyToMany
    @JoinTable(name="user_role", joinColumns = @JoinColumn(name="user_id"),
                inverseJoinColumns = @JoinColumn(name="role_id"))
    public Set<Role> getRoles(){
        return roles;
    }
    public void setRoles(Set<Role> roles){
        this.roles=roles;
    }



}
