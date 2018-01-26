package ttac.cn.controller.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: ${DESCRIPTION}
 * @author: 唐棒
 * @date: 2018/1/25-16:23
 */
public class MainAware {

    public static void main(String[] args){
        // 一、配置类的注册方式是将其传递给 AnnotationConfigApplicationContext 构造函数
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = (AwareService) applicationContext.getBean(AwareService.class);
        awareService.say();
    }
}
