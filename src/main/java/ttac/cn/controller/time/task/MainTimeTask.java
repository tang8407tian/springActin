package ttac.cn.controller.time.task;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description: ${DESCRIPTION}
 * @author: 唐棒
 * @date: 2018/1/26-11:35
 */
public class MainTimeTask {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TimeTaskConfig.class);
        TimesTaskService bean = applicationContext.getBean(TimesTaskService.class);

    }
}
