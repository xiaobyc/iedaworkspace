package ch2.el;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;
import org.springframework.core.io.Resource;

import java.io.IOException;


/**
 * Created by xiaobyc on 2018/4/23.
 */
@Configuration
@ComponentScan("ch2.el")
@PropertySource("classpath:test.properties")
public class ElConfig {
    @Value("I Love you")
    private String normal;
    @Value("#{systemProperties['os.name']}")
    private String osName;
    @Value("#{T (java.lang.Math).random()*100.0}")
    private double randomNumber;

    @Value("#{demoService.author}")
    private String fromAnother;
    @Value("classpath:test.properties")
    private Resource testFile;
    @Value("http://www.baidu.com")
    private Resource testUrl;
    @Value("${book.name}")
    private String bookName;
    @Autowired
    private Environment  environment;
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigure(){
        return  new PropertySourcesPlaceholderConfigurer();
    }

    public void outputResource(){
        System.out.println(normal);
        System.out.println(osName);
        System.out.println(randomNumber);
        System.out.println(fromAnother);
        try {
            System.out.println(IOUtils.toString(testFile.getInputStream()));
            System.out.println(IOUtils.toString(testUrl.getInputStream()));
            System.out.println(bookName);
            System.out.println(environment.getProperty("book.author"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
