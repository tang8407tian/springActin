package ttac.cn.controller.event.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: 运行
 * @author: 唐棒
 * @date: 2018/1/23-17:45
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(EventConfig.class);
        EventPublisher publisher = applicationContext.getBean(EventPublisher.class);
        publisher.publicsh("hello word event!");
        applicationContext.close();
    }
}
