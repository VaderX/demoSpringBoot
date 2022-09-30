package com.abc.demoSpringBoot.Entity.dto;

import lombok.*;

import javax.persistence.Transient;

@Data
public class ProfileDto {
        @Transient
        private int id;
        private String name;
        private String email;
        private String password;
}
