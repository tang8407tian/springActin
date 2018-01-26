package ttac.cn.controller.time.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ttac.cn.controller.BaseController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description: 定时任务
 * @author: 唐棒
 * @date: 2018/1/26-11:24
 */
@Service
public class TimesTaskService extends BaseController{


    private static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 EEE HH时mm分ss秒");

    @Scheduled(fixedRate = 2000)
    public void reportCurrentTime(){
        String format = simpleDateFormat.format(new Date());
        System.out.println("每隔5秒执行一次,这一次执行时间:"+format);
        boolean infoEnabled = logger.isInfoEnabled();
        boolean debugEnabled = logger.isDebugEnabled();
        System.out.println("infoEnabled:"+infoEnabled+" ----debugEnabled"+debugEnabled);
        logger.debug("每隔5秒执行一次,这一次执行时间:[{}]");
        logger.info("每隔5秒执行一次,这一次执行时间:{}");
    }

}
