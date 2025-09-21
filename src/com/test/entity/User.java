package com.test.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;
@Accessors(chain = true)
@Data
public class User {
    int id;
    String name;
    int age;
    List<Book>  books;

}
