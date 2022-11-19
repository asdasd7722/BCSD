package org.example.repository;

import org.example.domain.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    void createUser(User user);

    User getUserById(Long id);

    User updateUser(User user);

    void deleteUserById(Long id);
}
