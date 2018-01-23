package ttac.cn.controller.event.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @Description: 事件发布者
 * @author: 唐棒
 * @date: 2018/1/23-17:35
 */
@Component
public class EventPublisher {

    @Autowired
    private EventListener eventListener;

    @Autowired
    private ApplicationContext applicationContext;

    public void publicsh(String msg){
        applicationContext.publishEvent(new EventDemo(this,msg));
    }
}
