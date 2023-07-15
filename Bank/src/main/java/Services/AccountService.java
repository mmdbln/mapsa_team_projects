package Services;

import org.example.hiproject.entities.Account;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class AccountService extends BaseService<Account> {


    public AccountService(SessionFactory sessionFactory) {
        super(sessionFactory, Account.class);
    }

    @Override
    protected String getEntityName() {
        return "Account";
    }
}
