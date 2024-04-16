package by.tms.sportcenter.service;

import by.tms.sportcenter.entity.User;
import by.tms.sportcenter.repository.interf.UserRepository;
import by.tms.sportcenter.service.interf.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUserById(int id) {
        return null;
    }
}
