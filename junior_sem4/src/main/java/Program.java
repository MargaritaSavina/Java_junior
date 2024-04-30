//import com.mysql.cj.xdevapi.SessionFactory;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class Program {

    public static void main(String[] args)   {

        // Создание фабрики сессий
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();


        // Создание сессии
        try (Session session = sessionFactory.getCurrentSession()){


            // Начало транзакции
            session.beginTransaction();

            // Создание объекта
            Course course1 = new Course("курс1", 12);
            Course course2 = new Course("курс2", 9);
            Course course3 = new Course("курс3", 6);
            Course course4 = new Course("курс4", 3);
            Course course5 = new Course("курс5", 1);

            // Сохранение объекта в базе данных
            session.persist(course1);
            session.persist(course2);
            session.persist(course3);
            session.persist(course4);
            session.persist(course5);
            System.out.println("Object student save successfully");


            // Чтение объекта из базы данных
            Course retrievedcourse = session.get(Course.class, course1.getId());
            System.out.println("Object course retrieved successfully");
            System.out.println("Retrieved course object: " + retrievedcourse);

            // Обновление объекта
//            retrievedcourse.updateName();
//            retrievedcourse.updateAge();
            session.update(retrievedcourse);
            System.out.println("Object student update successfully");


            Course retrievedCourse2 = session.get(Course.class, 3);
            // Удаление объекта
            session.delete(retrievedCourse2);
            System.out.println("Object Course delete successfully");

            // Коммит транзакции
            session.getTransaction().commit();
            System.out.println("Transaction commit successfully");
        }
        }
}
