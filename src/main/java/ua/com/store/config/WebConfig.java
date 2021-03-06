package ua.com.store.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.io.File;

@Configuration
@EnableWebMvc
@ComponentScan("ua.com.store")
public class WebConfig extends WebMvcConfigurerAdapter {


    @Bean
    public MultipartResolver multipartResolver(){
        return new StandardServletMultipartResolver();
    }

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver(){
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/view/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler("/img/**")
                    .addResourceLocations("/static/images");
            registry.addResourceHandler("/images/**")
                    .addResourceLocations("file:" + System.getProperty("user.home") + File.separator + "projectImages\\");
    }
}
