package com.example.estateempires;

abstract class login implements AppInterface {
    String username;
    String password;
    public login() {

    }

    public login(String user, String pass) {
        this.username = user;
        this.password = pass;
    }
}
