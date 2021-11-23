package demo.repo;

import demo.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    public User getById(Long id) {
        return new User();
    }
}
