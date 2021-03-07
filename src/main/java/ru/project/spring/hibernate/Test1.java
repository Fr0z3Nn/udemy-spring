package ru.project.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.project.spring.hibernate.entity.Employee;

public class Test1 {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            session.beginTransaction();
            Employee emp = session.get(Employee.class,1);
            session.delete(emp);
            session.getTransaction().commit();
        }
    }
}
/* emp.setSalary(10000);
            session.createQuery("update Employee set salary = 1000 where name = 'Mike'").executeUpdate();*/
/*session.save(emp);
            session.getTransaction().commit();

            int myId = emp.getId();
            session = factory.getCurrentSession();
           session.beginTransaction();
            Employee employee = session.get(Employee.class,myId);*/
/*// Employee emp = new Employee("Mike", "Thomson", "IT", 500);
            session.beginTransaction();
            //List<Employee> emps = session.createQuery("from Employee").getResultList();
            List<Employee> emps = session.createQuery("from Employee " +
                    "where name = 'Mike'")
                    .getResultList();
            emps.forEach(System.out::println);*/