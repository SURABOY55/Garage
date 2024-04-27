package com.example.Garage.model.request;

import com.example.Garage.model.UserRoleModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
@Data
public class UserDataRequestModel {

    @NotBlank(message = "username is mandatory")
    private String username;

    @NotBlank(message = "email is mandatory")
    private String email;

    @NotBlank(message = "fullName is mandatory")
    private String fullName;

    @NotBlank(message = "password is mandatory")
    private String password;

    @NotNull(message = "appUserRole is mandatory")
    private UserRoleModel appUserRole;
}
