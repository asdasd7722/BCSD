package org.example.service;

import org.example.domain.User;

public interface UserService {
    User getUserInfo(long id);

    void createUser(User user);

    void updateUserInfo(User user, long id);

    void deleteUser(long id);
}
