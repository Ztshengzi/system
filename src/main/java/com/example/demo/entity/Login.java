package com.example.demo.entity;

import java.io.Serializable;

public class Login implements Serializable {
    private String administrator;
    private String password;

    public String getAdministrator() {
        return administrator;
    }

    public void setAdministrator(String administrator) {
        this.administrator = administrator;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
            ", administrator='" + administrator + '\'' +
            ", password='" + password + '\'' +
            '}';
    }
}
