package com.project.spring_rest_api.user;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();
    private static int usersCount  = 0;
    static {
        users.add(new User(++usersCount, "Hellen", LocalDate.now().minusYears(23)));
        users.add(new User(++usersCount, "Grace", LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount, "Thomas", LocalDate.now().minusYears(35)));
    }

    public List<User> findAll(){
        return users;
    }

    public User findById(Integer id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user){
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

    public void deleteById(int id){
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }
}
