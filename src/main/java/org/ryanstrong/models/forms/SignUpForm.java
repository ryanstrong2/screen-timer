package org.ryanstrong.models.forms;

import org.ryanstrong.models.User;

import javax.validation.constraints.NotNull;

/**
 * Created by ryanstrong on 4/30/17.
 */
public class SignUpForm {

    @NotNull
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;
    public SignUpForm(Integer userId, User user) {
        this.userId = userId;
        this.user = user;
    }

}
