package com.sleeksys.wttrestapi.model;

import com.sleeksys.wttrestapi.utils.DatabaseTable;

import javax.persistence.*;

@Entity
@Table(name = DatabaseTable.CUSTOMER)
public class Customer {

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String company;

    private String website;

    private String contactPerson;

    private String contactPersonEmailAddress;
}
