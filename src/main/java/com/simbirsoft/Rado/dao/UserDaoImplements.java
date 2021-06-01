package com.simbirsoft.Rado.dao;

import org.springframework.beans.factory.annotation.Autowired;
import com.simbirsoft.Rado.models.User;
import org.springframework.stereotype.Repository;

/*
import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class UserDaoImplements implements UserDao {
    private final EntityManager entityManager;

    @Autowired
    public UserDaoImplements(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> getAllUsers() {
        Query query = entityManager.createQuery("from User");
        List<User> list = query.getResultList();
        return list;
    }

    @Override
    public User getUserById(int id) {
        return entityManager.find(User.class, id);
    }

    @Override
    public void saveOrUpdateUser(User user) {
        User returnedFromDBUser = entityManager.merge(user);
        user.setId(returnedFromDBUser.getId());
        user.getRole().setName(returnedFromDBUser.getRole().getName());
    }

    @Override
    public void deleteUser(int id) {
        Query query = entityManager.createQuery("delete from User where id =:userId");
        query.setParameter("userId", id);
        query.executeUpdate();
    }
}
*/
