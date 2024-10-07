package com.techforge.easybill.Entity;

public class GlobalUser {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public GlobalUser(User user) {
        this.user = user;
    }

    public GlobalUser(){

    }
}
