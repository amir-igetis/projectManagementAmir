package com.amirul.projectManageAmir.service;

import com.amirul.projectManageAmir.model.PasswordResetToken;

public interface PasswordResetTokenService {

    public PasswordResetToken findByToken(String token);

    public void delete(PasswordResetToken resetToken);
}
