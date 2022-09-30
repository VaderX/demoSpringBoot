package com.abc.demoSpringBoot.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "GROUPS")
public class Groups {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "GROUP_ID")
    private int group_id;

    @Column(name = "GROUP_SIZE")
    private int group_size;
}
