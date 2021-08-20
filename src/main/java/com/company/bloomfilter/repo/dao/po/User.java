package com.company.bloomfilter.repo.dao.po;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class User {
    private Long id;

    private String name;

    private LocalDate birthday;

    private String phoneNumber;

    private String graduatedSchool;

    private LocalDateTime gmtCreate;

    private LocalDateTime gmtModify;

    private Byte isDeleted;

}