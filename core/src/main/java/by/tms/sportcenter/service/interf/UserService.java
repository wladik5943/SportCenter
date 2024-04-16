package by.tms.sportcenter.service.interf;

import by.tms.sportcenter.entity.User;

import java.util.List;

public interface UserService {

    List<User> allUsers();
    User findUserById(int id);

}
