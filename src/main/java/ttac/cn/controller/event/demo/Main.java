package ttac.cn.controller.event.demo;

import javafx.application.Application;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: 运行
 * @author: 唐棒
 * @date: 2018/1/23-17:45
 */
@SuppressWarnings("all")
public class Main {

    public static void main(String[] args){
        // @Configuration注解的spring容器加载方式，
        // 用AnnotationConfigApplicationContext替换ClassPathXmlApplicationContext
        // 一、配置类的注册方式是将其传递给 AnnotationConfigApplicationContext 构造函数
         AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EventConfig.class);
        // 根据class 获取bean
        // EventPublisher publisher = (EventPublisher) applicationContext.getBean(EventPublisher.class);

        // 根据 bean id 获取bean
        EventPublisher publisher = (EventPublisher) applicationContext.getBean("eventPublisher");
        publisher.publicsh("hello word event!");



        applicationContext.close();


        // 如果加载spring-context.xml文件：
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");


    }
}
