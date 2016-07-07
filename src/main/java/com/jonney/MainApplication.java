package com.jonney;

import jersey.repackaged.com.google.common.collect.Lists;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/6.
 */
@Controller
@Configuration
@ComponentScan
@ServletComponentScan
@EnableAutoConfiguration
public class MainApplication  extends SpringBootServletInitializer {
    @Override

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MainApplication.class);

    }
    public static void main(String[] args) throws Exception {

        System.out.println(String.format("Begin: %s,{0},{0},{0}", "a"));
        SpringApplication.run(MainApplication.class, args);
        System.out.println("Begin:");
    }

    @RequestMapping("/hello")
    public String sayHello(Map<String, Object> model){
        List<String> l= Lists.newArrayList();
        l.add("哈喽，hadoop");
        l.add("哈喽，hbase");
        l.add("哈喽，hive");
        l.add("哈喽，pig");
        l.add("哈喽，zookeeper");
        l.add("哈喽，三劫散仙");
        //将数据存放map里面，可以直接在velocity页面，使用key访问
        model.put("data",l);
        return "hello";
    }


//    /**
//     * 修改DispatcherServlet默认配置
//     *
//     * @param dispatcherServlet
//     * @return
//     * @author SHANHY
//     * @create  2016年1月6日
//     */
//    @Bean
//    public ServletRegistrationBean dispatcherRegistration(DispatcherServlet dispatcherServlet) {
//        ServletRegistrationBean registration = new ServletRegistrationBean(dispatcherServlet);
//        registration.getUrlMappings().clear();
//        registration.addUrlMappings("*.do");
//        registration.addUrlMappings("*.json");
//        return registration;
//    }
}

