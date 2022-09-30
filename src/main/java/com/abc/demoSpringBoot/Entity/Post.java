package com.abc.demoSpringBoot.Entity;


import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POST_ID")
    private int post_id;

    @Column(name = "POST_CONTENT")
    private String post_content;

    @Column(name = "POST_DATE")
    private Date post_date;

    @Column(name = "POST_COMMENT")
    private String post_comment;
}
