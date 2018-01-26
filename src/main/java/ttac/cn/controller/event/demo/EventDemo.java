package ttac.cn.controller.event.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: 唐棒
 * @date: 2018/1/23-17:23
 */
public class EventDemo extends ApplicationEvent{

    private String msg;


    public EventDemo(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
