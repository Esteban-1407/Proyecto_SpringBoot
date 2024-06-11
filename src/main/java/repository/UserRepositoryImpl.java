package repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class UserRepositoryImpl implements UserRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> list() {
        String query = "FROM User";
        return entityManager.createQuery(query, User.class).getResultList();
    }

    @Override
    public User searchById(Long id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void save(User user) {
        entityManager.merge(user);
    }

    @Override
    public void deleteById(Long id) {
        User user = searchById(id);
        if (user != null) {
            entityManager.remove(user);
        }
    }
}
