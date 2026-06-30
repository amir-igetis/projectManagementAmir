package com.amirul.projectManageAmir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RestController;

import com.amirul.projectManageAmir.exception.ChatException;
import com.amirul.projectManageAmir.exception.UserException;
import com.amirul.projectManageAmir.model.Message;

@RestController
public class RealTimeChatController {
    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/chat/{groupId}")
    public Message sendToUser(@Payload Message message,

            @DestinationVariable String groupId) throws UserException, ChatException {

        simpMessagingTemplate.convertAndSendToUser(groupId, "/private",
                message);

        return message;
    }

}
