package com.amirul.projectManageAmir.service;

import com.amirul.projectManageAmir.exception.ChatException;
import com.amirul.projectManageAmir.exception.ProjectException;
import com.amirul.projectManageAmir.exception.UserException;
import com.amirul.projectManageAmir.model.Message;

import java.util.List;

public interface MessageService {
    Message sendMessage(Long senderId, Long chatId, String content) throws UserException, ChatException, ProjectException;

    List<Message> getMessagesByProjectId(Long projectId) throws ProjectException, ChatException;
}
