package repository;

import model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface UserRepository  {

        List<User> list();
        User searchById(Long id);
        void save(User user);
        void deleteById(Long id);
    }


