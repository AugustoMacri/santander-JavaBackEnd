package dio.aula_spring_data_jpa;

import dio.aula_spring_data_jpa.model.User;
import dio.aula_spring_data_jpa.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.util.List;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;
    @Override

    public void run(String... args) throws Exception{
        List<User> users = repository.filtrarPorNome("Augusto");
        for(User u: users){
            System.out.println(u);
        }
    }

    public void insertUser() {
        User user = new User();
        user.setName("Augusto");
        user.setUsername("Augusto");
        user.setPassword("dio");

        repository.save(user);

        for(User u: repository.findAll()){
            System.out.println(u);
        }
    }

}
