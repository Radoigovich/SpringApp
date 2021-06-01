package com.simbirsoft.Rado.repository;

import com.simbirsoft.Rado.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}