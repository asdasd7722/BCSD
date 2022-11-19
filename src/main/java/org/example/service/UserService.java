package org.example.service;

import org.example.domain.User;

public interface UserService {
    User getUserInfo(long id);

    void createUser(User user);

    User updateUserInfo(User user);

    void deleteUser(long id);
}
