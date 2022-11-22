package org.example.service;


import org.example.domain.User;
import org.example.repository.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserInfo(long id) {
        return userMapper.getUserById(id);
    }

    @Override
    public void createUser(User user) {
        userMapper.createUser(user);
    }

    @Override
    public void updateUserInfo(User user, long id) {
         userMapper.updateUser(user, id);
    }

    @Override
    public void deleteUser(long id) {
        userMapper.deleteUserById(id);
    }
}
