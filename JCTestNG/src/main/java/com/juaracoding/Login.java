package com.juaracoding;

public class Login {

    public boolean isLogin(String username, String password) {
        if (username.equals("admin") && password.equals("Password")) {
            return true;
        } else {
            return false;
        }
    }
}

