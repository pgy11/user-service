package com.myEcommerce.userService.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class UserDto {

    private String email;
    private String name;
    private String pwd;
    private String userId;
    private LocalDate createdAt;

    private String encryptedPwd;

}
