package com.amirul.projectManageAmir.service;

import com.amirul.projectManageAmir.exception.MailsException;
import com.amirul.projectManageAmir.model.Invitation;
import jakarta.mail.MessagingException;

public interface InvitationService {

    public void sendInvitation(String email, Long projectId) throws MailsException, MessagingException;

    public Invitation acceptInvitation(String token, Long userId) throws Exception;
    public String getTokenByUserMail(String userEmail);
    public void deleteToken(String token);
}
