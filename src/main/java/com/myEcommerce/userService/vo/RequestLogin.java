package com.myEcommerce.userService.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestLogin {
    @NotNull(message = "Email can't be null")
    @Size(min = 2, message = "Email not be less than two characters")
    @Email
    private String email;

    @NotNull(message = "Password can't be null")
    @Size(min = 8, message = "Password not be less than 8")
    private String password;
}
