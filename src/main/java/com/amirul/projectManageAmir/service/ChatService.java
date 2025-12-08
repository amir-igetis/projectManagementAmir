package com.amirul.projectManageAmir.service;

import com.amirul.projectManageAmir.exception.ChatException;
import com.amirul.projectManageAmir.exception.ProjectException;
import com.amirul.projectManageAmir.model.Chat;

import java.util.List;


public interface ChatService {
    Chat createChat(Chat chat) ;
//
//    Chat getChatsByProjectId(Long projectId) throws ChatException, ProjectException;
//
//	Chat addUsersToChat(Long chatId, List<Long> userIds) throws ChatException;
//
//
//	 List<Chat> searchChatsByName(String name) throws ChatException;
//
////     Other methods as needed
}
