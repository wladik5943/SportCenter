package by.tms.sportcenter.repository.interf;

import by.tms.sportcenter.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    List<User> findAllByNameAndSurname(String name, String surname);

}
