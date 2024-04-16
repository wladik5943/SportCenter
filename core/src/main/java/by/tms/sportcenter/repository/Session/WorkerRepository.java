package by.tms.sportcenter.repository.Session;

import by.tms.sportcenter.config.HibernateJavaConfig;
import by.tms.sportcenter.entity.Worker;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class WorkerRepository {
    private final SessionFactory sessionFactory;



    public void add(Worker worker) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(worker);
        session.getTransaction().commit();
        session.close();
    }
}
