package org.technischhols.TECHNIBOOK.Users.API;

import lombok.Data;

@Data
public class CreateUserRequest {
    private String email;
    private String password;

}
