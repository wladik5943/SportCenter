package by.tms.sportcenter;

import by.tms.sportcenter.entity.User;
import by.tms.sportcenter.service.UserServiceImpl;
import by.tms.sportcenter.service.interf.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
@ComponentScan("by.tms.sportcenter")
public class Main {
    public static void main(String[] args) {
//        User user = new User();
//        user.setName("vlad");
//        user.setSurname("zel");
//        user.setBirthday(LocalDate.of(2005,4,23));
////        user.setAge(18);
////        user.setStatus(UserStatus.ACTIVE);
////        user.setSumm(BigDecimal.ZERO);
////        user.setLastVisit(null);
////        user.setPhoneNumber("+43333223");
//        UserRepository userRepository = new UserRepository();
//        userRepository.add(user);
//        UserRepository userRepository = new UserRepository();
//        userRepository.all().forEach(System.out::println);


        ApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
        UserService userService = ctx.getBean("userServiceImpl", UserService.class);


        List<User> users = userService.allUsers();
        users.forEach(System.out::println);

    }
}