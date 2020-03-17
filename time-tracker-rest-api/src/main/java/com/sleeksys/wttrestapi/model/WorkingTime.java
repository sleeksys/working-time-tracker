package com.sleeksys.wttrestapi.model;

import com.sleeksys.wttrestapi.utils.DatabaseTable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = DatabaseTable.TIME)
public class WorkingTime {

    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    private Long projectId;

    private Date createdAt;

    public Date dateStart;

    @Column(columnDefinition = "In minutes.")
    private Integer duration;

    private String description;
}
