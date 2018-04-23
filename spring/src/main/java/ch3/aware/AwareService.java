package ch3.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;

/**
 * Created by xiaobyc on 2018/4/23.
 */
@Component
public class AwareService implements BeanNameAware,ResourceLoaderAware {
    private String beanName;
    private ResourceLoader loader;
    @Override
    public void setBeanName(String s) {
        beanName = s;
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        loader = resourceLoader;
    }

    public void outputResult(){
        System.out.println("Bean 的名称："+beanName);
        Resource resource = loader.getResource("classpath:test.properties");
        try {
            System.out.println("ResourceLoader 加载文件的内容为:"+ IOUtils.toString(resource.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
