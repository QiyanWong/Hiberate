package pers.qiyanwang.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import pers.qiyanwang.pojo.Product;

import java.util.Set;

public class TestHibernate {
  public static void main(String[] args) {

    SessionFactory sf = new Configuration().configure().buildSessionFactory();

    Session s = sf.openSession();
    s.beginTransaction();

    Category c = (Category) s.get(Category.class, 1);
    Set<Product> ps = c.getProducts();
    for (Product p : ps) {
      System.out.println(p.getName());
    }

    s.getTransaction().commit();
    s.close();
    sf.close();
  }
}