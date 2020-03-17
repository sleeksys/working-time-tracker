package com.sleeksys.wttrestapi.model;

import com.sleeksys.wttrestapi.utils.DatabaseTable;

import javax.persistence.*;

@Entity
@Table(name = DatabaseTable.PROJECT)
public class Project {

    @Id
    @GeneratedValue
    private Long id;

    private Long customerId;

    @Column(unique = true)
    private String uniqueName;

    private String name;
}
