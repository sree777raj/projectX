package com.prakat.projectx.user;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {


    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        // Perform any necessary validation or business logic before saving the user
        // For example, you can check if the email is unique or enforce password requirements

        return userRepository.save(user);
    }

    public User getUserById(Integer id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }
}
