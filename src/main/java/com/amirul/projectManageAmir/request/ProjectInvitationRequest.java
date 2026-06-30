package com.amirul.projectManageAmir.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ProjectInvitationRequest {
    private Long projectId;
    private String email;
}
