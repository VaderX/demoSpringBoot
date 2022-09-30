package com.abc.demoSpringBoot.Entity.dto;

import lombok.Data;

import java.util.Date;

@Data
public class PostDto {
    private int post_id;
    private String post_content;
    private Date post_date;
    private String post_comment;
}
