package by.tms.sportcenter;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
public class Main {
    public static void main(String[] args) {

        SpringApplication.run(Main.class, args);
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


//        ApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
//        UserService userService = ctx.getBean("userServiceImpl", UserService.class);
//
//
//        List<User> users = userService.allUsers();
//        users.forEach(System.out::println);

    }
}