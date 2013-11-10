import beans.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.lang.ref.WeakReference;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        /**
         * POJO = Plain Old Java Objects
         *
         * Hibernate - Object relation mapping (ORM - technology)
         * Позволяет связать сервер и СУБД.
         *
         *
         */

        Object obj = new Object();
        WeakReference<Object> weakReferenceObj = new WeakReference<Object>(obj);
        weakReferenceObj.get();

        // Create the SessionFactory from hibernate.cfg.xml
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

        User user = new User();
        user.setName("Olya");
        user.setSurName("Kirkorova");
        user.setAge(13);
        user.setSalary(100);

        //session.save(user);

        //session.getTransaction().commit();

        List cats = session.createCriteria(User.class)
                .add(Restrictions.between("age", 20, 40))
                .list();

        System.out.println(cats);
    }
}
