package com.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    private Long cId;
    private String cEmail;
    private String cName;

    private Long uId;
}
