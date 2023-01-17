package com.example.estateempires;

abstract class Login implements AppInterface {
    String username;
    String password;
    public Login() {

    }

    public Login(String user, String pass) {
        this.username = user;
        this.password = pass;
    }
}
