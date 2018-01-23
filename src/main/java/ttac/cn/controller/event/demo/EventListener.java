package ttac.cn.controller.event.demo;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @Description: 时间监听者
 * @author: 唐棒
 * @date: 2018/1/23-17:29
 */
/*定义Spring管理Bean*/
@Component
public class EventListener implements ApplicationListener<EventDemo>{

    @Override
    public void onApplicationEvent(EventDemo eventDemo) {
        String msg = eventDemo.getMsg();
        System.out.println("接收到消息："+msg);

    }
}
