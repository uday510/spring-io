package com.app;
import com.app.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args )
    {

//        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj1 = applicationContext.getBean(Alien.class);
        System.out.println(obj1.getAge());
        obj1.code();

//        Desktop desktop = applicationContext.getBean("desktop", Desktop.class);
//        desktop.compile();
//
//        Desktop desktop1 = applicationContext.getBean("com2", Desktop.class);
//        desktop1.compile();



//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1 = context.getBean("alien", Alien.class);
//        System.out.println(obj1.getAge());
//        obj1.code();


    }
}
