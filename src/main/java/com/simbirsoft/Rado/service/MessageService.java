package com.simbirsoft.Rado.service;

import com.simbirsoft.Rado.models.Message;

import java.util.List;

public interface MessageService {
    List<Message> getAllMessages();
    Message getMessageById(int id);
    void saveOrUpdateMessage(Message message);
    void deleteMessageById(int id);
}