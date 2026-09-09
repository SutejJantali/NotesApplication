package com.secure.notes.services;

import com.secure.notes.Dtos.*;
import com.secure.notes.models.User;

import java.util.List;

public interface UserService {
    void updateUserRole(Long userId, String roleName);
    
    List<User> getAllUsers();
    
    UserDTO getUserById(Long id);
}
