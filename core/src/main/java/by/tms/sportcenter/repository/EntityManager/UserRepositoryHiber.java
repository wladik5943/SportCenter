package by.tms.sportcenter.repository.EntityManager;

import by.tms.sportcenter.config.HibernateConection;
import by.tms.sportcenter.entity.User;
import by.tms.sportcenter.enums.UserStatus;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UserRepositoryHiber {

    public void editStatus(UserStatus status){
        EntityManager entityManager = HibernateConection.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createQuery("update from User u set u.status = :status ");
    }

    public void delete(User user){
        EntityManager entityManager = HibernateConection.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.contains(user) ? user : entityManager.merge(user));
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    public void add(User user){

        EntityManager entityManager = HibernateConection.getEntityManager();
        try{
            entityManager.getTransaction().begin();
            entityManager.persist(user);
            entityManager.getTransaction().commit();
        }catch (Exception e){
            entityManager.getTransaction().rollback();
            throw new RuntimeException(e);
        }

    }

    public List<User> all(){
        EntityManager entityManager = HibernateConection.getEntityManager();
        List<User> list = entityManager.createQuery("select u from User u").getResultList();
        entityManager.close();
        return list;
    }
}
