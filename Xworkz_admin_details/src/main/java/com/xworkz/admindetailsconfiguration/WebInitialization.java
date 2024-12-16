<<<<<<< HEAD
package com.xworkz.admindetailsconfiguration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitialization extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer
{


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfiguration.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
        configurer.enable();
    }
}
=======
package com.xworkz.admindetailsconfiguration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitialization extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer
{


    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { WebConfiguration.class };
    }

    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
        configurer.enable();
    }
}
>>>>>>> 22a343a6ad2b0c03fc5478ea544b171112d152e5
