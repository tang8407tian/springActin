package ttac.cn.controller.event.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 事件配置类
 * @author: 唐棒
 * @date: 2018/1/23-17:43
 * @Configuration: 可理解为用spring的时候xml里面的<beans>标签
 * @Bean: 可理解为用spring的时候xml里面的<bean>标签
 */

// 可理解为用spring的时候xml里面的<beans>标签
// @Configuration标注在类上，相当于把该类作为spring的xml配置文件中的<beans>，
// 作用为：配置spring容器(应用上下文)
@Configuration
// 添加自动扫描注解，basePackages为EventPublisher、EventListener包路径  含有：@Component注解的类
@ComponentScan(basePackages = "ttac.cn.controller.event.demo")
public class EventConfig {
    /**
     * @Configuration :
     *
     * 从Spring3.0，@Configuration用于定义配置类，可替换xml配置文件，
     * 被注解的类内部包含有一个或多个被@Bean注解的方法，
     * 这些方法将会被AnnotationConfigApplicationContext
     * 或AnnotationConfigWebApplicationContext类进行扫描，
     * 并用于构建bean定义，初始化Spring容器。
     */
}
