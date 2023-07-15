package org.example.hiproject.entities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {

    private static SessionFactory sf ;
    public static SessionFactory getSessionFactory(){
        if (sf == null){
            Configuration cfg = new Configuration();
            cfg.addAnnotatedClass(Branch.class);
            cfg.addAnnotatedClass(Bank.class);
            cfg.addAnnotatedClass(Account.class);
            cfg.addAnnotatedClass(Transaction.class);
            cfg.addAnnotatedClass(Custoomer.class);

            sf = cfg.buildSessionFactory();
            return sf ;
        }

        return sf ;
    }
}
