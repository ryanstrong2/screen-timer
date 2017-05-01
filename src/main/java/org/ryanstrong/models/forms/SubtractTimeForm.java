package org.ryanstrong.models.forms;

import org.ryanstrong.models.Time;
import org.ryanstrong.models.User;

import javax.validation.constraints.NotNull;

/**
 * Created by ryanstrong on 4/30/17.
 */
public class SubtractTimeForm {

    @NotNull
    private int timeId;
    private int userId;
    private Time time;

    public SubtractTimeForm(int timeId){
        this.timeId = timeId;
    }
    public SubtractTimeForm(int timeId, Time time){
        this.timeId = timeId;
        this.time =time;
    }

    public SubtractTimeForm(Iterable<User> all, Time time) {
    }

    public int getTimeId() {
        return timeId;
    }

    public void setTimeId(int timeId) {
        this.timeId = timeId;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }


    public int getUserId() {
        return userId;
    }
}

