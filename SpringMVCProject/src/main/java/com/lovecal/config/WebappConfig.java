package com.lovecal.config;

import com.formatter.PhoneNumberFormatter;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.Properties;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com")
public class WebappConfig implements WebMvcConfigurer {
    @Bean
    public InternalResourceViewResolver getViewResolve() {
        InternalResourceViewResolver viewResolve = new InternalResourceViewResolver();
        viewResolve.setPrefix("/WEB-INF/view/");
        viewResolve.setSuffix(".jsp");
        return viewResolve;

    }
    @Bean
    public MessageSource messageSource()
    {
        //we created custom messages file right
        //this method used to fetch that file where we created
        ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
        messageSource.setBasename("messages");

        return messageSource;
    }

    @Bean
    public LocalValidatorFactoryBean validator() {
        //then we tell spring that we used custom message file
        //so use that

        LocalValidatorFactoryBean localValidatorFactoryBean = new LocalValidatorFactoryBean();
        localValidatorFactoryBean.setValidationMessageSource(messageSource());

        return localValidatorFactoryBean;
    }
    @Bean
    public JavaMailSender getJavaMailSender()
    {
        JavaMailSenderImpl javaMailSenderImpl=new JavaMailSenderImpl();
        javaMailSenderImpl.setHost("smtp.gmail.com");
        javaMailSenderImpl.setUsername("tharun28102000@gmail.com");
        javaMailSenderImpl.setPassword("brbp opri osco cvkr");
        javaMailSenderImpl.setPort(587);

        Properties mailProperties=new Properties();
        mailProperties.put("mail.smtp.starttls.enable",true);
        mailProperties.put("mail.smtp.ssl.trust","smtp.gmail.com");
        javaMailSenderImpl.setJavaMailProperties(mailProperties);

        return javaMailSenderImpl;
    }


    @Override
    public Validator getValidator() {
        return validator();
    }


    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addFormatter(new PhoneNumberFormatter()); //we registered the formatter
        //we can use this add formatter in initBinder method also
        //which was written in com.Controllers.Registration

    }
}