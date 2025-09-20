package com.test.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    int id;
    String name;
    int age;
    List<Book>  books;

}
