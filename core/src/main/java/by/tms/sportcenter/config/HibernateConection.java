package by.tms.sportcenter.config;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateConection {
private static final EntityManagerFactory emf =
        Persistence.createEntityManagerFactory("UserJpa");

public static EntityManager getEntityManager(){
return emf.createEntityManager();
}
}
