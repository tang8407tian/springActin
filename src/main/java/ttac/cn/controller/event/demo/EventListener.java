package ttac.cn.controller.event.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description: 时间监听者
 * @author: 唐棒
 * @date: 2018/1/23-17:29
 */
// 定义Spring管理Bean
// 添加注册bean的注解
@Component
public class EventListener implements ApplicationListener<EventDemo>{
    private static  final Logger logger = LoggerFactory.getLogger(EventListener.class);
    @Override
    public void onApplicationEvent(EventDemo eventDemo) {
        String msg = eventDemo.getMsg();
        System.out.println("System.out.println--接收到消息："+msg);
        logger.info("logger.info --接收到消息：{}",msg);
        logger.debug("logger.debug --接收到消息");
        logger.error("logger.error --接收到消息");
        logger.warn("logger.warn --接收到消息");


    }
}
