package com.cgq.springbootredis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
public class Student implements Serializable {
    private Integer id;
    private String name;
    private Double score;
    private Date birthday;
}
