package cn.lger.test;

import cn.lger.domain.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

/**
 * Code that Changed the World
 * Pro said
 * Created by Pro on 2017-09-15.
 */
public class TestInsertCustomer {

    @Test
    public void test01(){

        Configuration configuration = new Configuration();
        //初始化hibernate的配置，这里默认的是配置根目录下的hibernate.cfg.xml
        //如果不想用这个函数，或者说不想将配置文件放于根目录可以使用configure(String resource)或configure(URL url)....
        configuration.configure();
        //从会话工厂中拿取session
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //打开会话
        Session session = sessionFactory.openSession();
        //开启事务
        Transaction transaction = session.beginTransaction();
        //操作数据库部分
        Customer customer = new Customer();
        customer.setCust_name("张三");
        customer.setCust_mobile("1231222");
        //将customer保存到数据库
        session.save(customer);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }

    @Test
    public void test02(){

        Configuration configuration = new Configuration();
        //初始化hibernate的配置，这里默认的是配置根目录下的hibernate.cfg.xml
        //如果不想用这个函数，或者说不想将配置文件放于根目录可以使用configure(String resource)或configure(URL url)....
        configuration.configure();
        //从会话工厂中拿取session
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //打开会话
        Session session = sessionFactory.openSession();
        //开启事务
        Transaction transaction = session.beginTransaction();

        Customer customer = session.get(Customer.class, 1L);
        System.out.println(customer);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}
