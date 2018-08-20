package pers.qiyanwang.pojo;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import org.hibernate.criterion.Restrictions;
import pers.qiyanwang.pojo.Product;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestHibernate {
  public static void main(String[] args) {

    SessionFactory sf = new Configuration().configure().buildSessionFactory();

    Session s = sf.openSession();
    s.beginTransaction();


    String name = "iphone";

    Criteria c= s.createCriteria(Product.class);
    c.add(Restrictions.like("name", "%"+name+"%"));
    c.setFirstResult(2);
    c.setMaxResults(5);

    List<Product> ps = c.list();
    for (Product p : ps) {
    }

    s.getTransaction().commit();
    s.close();
    sf.close();
  }
}