package com.haroldraja.smart_shop_user.service;

import com.haroldraja.smart_shop_user.entity.User;
import com.haroldraja.smart_shop_user.model.UserDTO;
import com.haroldraja.smart_shop_user.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserDTO> getUserList(){
        return userRepository
                .findAll()
                .stream()
                .map(user -> new UserDTO(user.getId(), user.getFirstName(), user.getLastName()))
                .toList();
    }
}
