package com.javawebtest.daos;

import com.javawebtest.model.Team;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

/**
 * Created by martinmendez on 8/1/15.
 */
public class TeamDAO implements ITeamDAO {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void Save(Team team) {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(team);
        tx.commit();
        session.close();
    }

    @SuppressWarnings("unchecked")
    public List<Team> List() {
        Session session = this.sessionFactory.openSession();
        List<Team> personList = session.createQuery("from Team").list();
        session.close();
        return personList;
    }
}
