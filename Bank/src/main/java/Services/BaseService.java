package Services;


import com.sun.jdi.LongValue;
import org.hibernate.*;
import org.hibernate.engine.HibernateIterator;
import org.hibernate.query.Query;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.Queue;

public abstract class BaseService <T> {
    SessionFactory sessionFactory;

    Class<T> type;

    public BaseService(SessionFactory sessionFactory, Class<T> type) {
        this.sessionFactory = sessionFactory;
        this.type = type;
    }

    public void add(T t){
        Session session= sessionFactory.openSession();
        session.beginTransaction();
        session.save(t);
        session.getTransaction().commit();
        session.close();
        System.out.println("object added");
    }

    public void update(T t){
        Session session= sessionFactory.openSession();
        session.beginTransaction();
        session.update(t);
        session.getTransaction().commit();
        session.close();
    }

    public T get(Long id){
        Session session= sessionFactory.openSession();
        session.beginTransaction();
        T object=session.get(type,id);
        session.getTransaction().commit();
        session.close();
        return object;
    }

    public void delete(Long id){
        Session session= sessionFactory.openSession();
        session.beginTransaction();
        session.delete(id);
        session.getTransaction().commit();
        session.close();
        System.out.println("object deleted");

    }

    public List<T> getAll(){
        Session session=sessionFactory.openSession();
        Criteria criteria=session.createCriteria(type);
        session.getTransaction().commit();
        session.close();
        return criteria
    }

    public Long countAll(){
        Session session= sessionFactory.openSession();
        Query query= session.createQuery("select u from claz u");
        List<T> objects=query.getResultList();
        session.close();
        return Long.valueOf(objects.size());

    }

    protected abstract String getEntityName();

}
