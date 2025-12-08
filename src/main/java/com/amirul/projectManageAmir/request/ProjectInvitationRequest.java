package com.amirul.projectManageAmir.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ProjectInvitationRequest {

    private Long projectId;
    private String email;
    private String password;
}
