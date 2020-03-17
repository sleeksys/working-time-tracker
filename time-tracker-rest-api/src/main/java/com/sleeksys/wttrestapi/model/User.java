package com.sleeksys.wttrestapi.model;

import com.sleeksys.wttrestapi.utils.DatabaseTable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = DatabaseTable.USER)
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private Date createdAt;

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String pseudo;

    private String email;

    private String password;
}
