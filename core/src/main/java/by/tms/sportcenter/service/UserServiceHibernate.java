package by.tms.sportcenter.service;

import by.tms.sportcenter.entity.Worker;
import by.tms.sportcenter.repository.EntityManager.UserRepositoryHiber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceHibernate {
    private final UserRepositoryHiber userRepository;

    public UserServiceHibernate() {
        userRepository = new UserRepositoryHiber();
    }
@Autowired
    public UserServiceHibernate(UserRepositoryHiber userRepository) {
        this.userRepository = userRepository;
    }

    public void add(Worker worker){
        userRepository.add(worker);
    }




}
