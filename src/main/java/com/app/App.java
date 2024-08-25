package com.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien = (Alien) context.getBean("alien");
//        alien.setAge(21);
        System.out.println(alien.getAge());
        alien.code();

//        Alien alien2 = (Alien) context.getBean("alien");
//        System.out.println(alien2.getAge());
//        alien2.code();

//        Alien alien3 = (Alien) context.getBean("alien");
//        System.out.println(alien3.getAge());
//        alien3.code();

//        Alien alien4 = (Alien) context.getBean("alien");
//        System.out.println(alien4.getAge());
//        alien4.code();
    }
}
