package Services;

import org.example.hiproject.entities.Branch;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class BranchService extends BaseService<Branch>{


    public BranchService(SessionFactory sessionFactory) {
        super(sessionFactory, Branch.class);
    }

    @Override
    protected String getEntityName() {
        return "Branch";
    }
}
