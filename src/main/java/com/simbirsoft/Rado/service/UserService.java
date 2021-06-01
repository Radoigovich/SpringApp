package com.simbirsoft.Rado.service;

import com.simbirsoft.Rado.models.User;
import com.simbirsoft.Rado.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(int id);
    void saveOrUpdateUser(User user);
    void deleteUser(int id);
}