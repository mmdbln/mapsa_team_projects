package Services;


import org.example.hiproject.entities.Custoomer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CustoomerService extends BaseService<Custoomer> {


    public CustoomerService(SessionFactory sessionFactory) {
        super(sessionFactory, Custoomer.class);
    }

    @Override
    protected String getEntityName() {
        return "Custoomer";
    }
}
