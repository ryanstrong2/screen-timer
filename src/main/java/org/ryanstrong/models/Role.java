//package org.ryanstrong.models;
//
//import javax.persistence.*;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
//import java.util.Set;
//
///**
// * Created by ryanstrong on 4/29/17.
// */
//@Entity
//@Table(name="role")
//public class Role {
//    @Id
//    @GeneratedValue
//    private int id;
//
//    @NotNull
//    @Size(min= 3, max=15)
//    private String name;
//
//    private Set<User> users;
//
////    @JoinColumn(name = "category_id")
////    private List<User> users = new ArrayList<>();
//
//    public int getId() {
//        return id;
//    }
//    public void setId(int id){
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @ManyToMany(mappedBy = "roles")
//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }
//
//}
