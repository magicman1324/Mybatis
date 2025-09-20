package com.test.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserDetail {
    int id;
    String description;
    Date register;
    String avatar;
}
