package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.util.Date;

@Data
@Table(name = "t_person")
public class Person {
    @Id
    private Integer id;
    private String name;
    @Transient
    private Integer age;


    private Date birth;
}
