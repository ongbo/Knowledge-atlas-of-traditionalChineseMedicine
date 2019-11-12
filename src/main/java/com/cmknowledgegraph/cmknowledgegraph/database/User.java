package com.cmknowledgegraph.cmknowledgegraph.database;

import javax.persistence.*;

@Entity(name = "user")
@Table(name = "user")
public class User {

    @Id
    private String phonenumber = null;

    @Column(name = "user_name")
    private String username = null;

    @Column(name = "pass_word")
    private String password = null;

    @Column(name = "avatar_url")
    private String avatar_url = null;

    @Column(name = "age")
    private Long age = null;

    @Column(name = "sex")
    private String sex = null;

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public Long getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
