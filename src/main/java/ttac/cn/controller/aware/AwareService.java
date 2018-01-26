package ttac.cn.controller.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import ttac.cn.controller.BaseController;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Description: 让bean获取spring容器测试
 * @author: 唐棒
 * @date: 2018/1/25-15:09
 */
@Service
public class AwareService extends BaseController implements BeanNameAware,ResourceLoaderAware {

    private String beanName;
    private ResourceLoader loader;

    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;

    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.loader = resourceLoader;
    }

    public void say(){
        logger.info("bean的名称:{}",beanName);

        Resource loaderResource = loader.getResource("classpath:ttac/cn/controller/aware/resource.txt");
        DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader();
        Resource resource = defaultResourceLoader.getResource("I:/Java/test.txt");
        try {
            boolean exists = resource.exists();
            boolean file = resource.isFile();
            boolean open = resource.isOpen();
            boolean readable = resource.isReadable();
            InputStream inputStream = loaderResource.getInputStream();
            String toString = IOUtils.toString(loaderResource.getInputStream());
            logger.info("resourceLoader加载的文件类容：{}", toString);
        } catch (IOException e) {
            e.printStackTrace();
            logger.error("读取txt内容失败:[{}]",e.getMessage(),e);
        }
    }




}
