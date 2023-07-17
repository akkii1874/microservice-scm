package com.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long uId;
    private String uName;
    private String uMobile;

    List<Contact> contacts = new ArrayList<>();

    public User(Long uId, String uName, String uMobile) {
        this.uId = uId;
        this.uName = uName;
        this.uMobile = uMobile;
    }
}
