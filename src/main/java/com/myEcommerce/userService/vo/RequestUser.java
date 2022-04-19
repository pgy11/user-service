package com.myEcommerce.userService.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @NotNull(message = "Email can not be null")
    @Size(min = 2, message = "length of email has to be more than 1")
    @Email
    private String email;

    @NotNull(message = "Name can not be null")
    @Size(min = 2, message = "Name has to be more than 1")
    private String name;

    @NotNull(message = "pwd can not be null")
    @Size(min = 8, message = "Password has to be more than 7")
    private String pwd;

}
