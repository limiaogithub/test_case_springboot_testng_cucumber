package com.github.yt.configuration;

public class DBConnection {

    private String jdbc_username;

    private String jdbc_password;

    public DBConnection(String jdbc_username, String jdbc_password) {
        this.jdbc_username = jdbc_username;
        this.jdbc_password = jdbc_password;
    }

    public String getJdbc_username() {
        return jdbc_username;
    }

    public void setJdbc_username(String jdbc_username) {
        this.jdbc_username = jdbc_username;
    }

    public String getJdbc_password() {
        return jdbc_password;
    }

    public void setJdbc_password(String jdbc_password) {
        this.jdbc_password = jdbc_password;
    }

}
