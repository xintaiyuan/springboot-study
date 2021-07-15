package com.example.springboot.pojo;

import org.springframework.stereotype.Repository;

/**
 * @ClassName User
 * @Desc TODO
 * @Author XinTai-Yuan
 * @Date 2021/7/14 17:14
 * @Version 1.0
 **/
@Repository
public class User {
    private Integer id;
    private String username;
    private Integer age;
    private String address;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User(String username, Integer age, String address) {
        this.username = username;
        this.age = age;
        this.address = address;
    }

    public User() {
    }
}
