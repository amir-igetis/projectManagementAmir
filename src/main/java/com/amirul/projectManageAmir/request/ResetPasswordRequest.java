package com.amirul.projectManageAmir.request;

import lombok.Data;

@Data
public class ResetPasswordRequest {

    private String password;
    private String token;

}
