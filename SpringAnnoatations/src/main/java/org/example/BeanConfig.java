package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//without xml we can configure here in java class
@Configuration
//@ComponentScan(basePackages = "org.example") //if we dont want @Component then we dont need this also
public class BeanConfig {

    @Bean
    public  Principal princiObj()
    {
        return new Principal();

    }

    @Bean //should add when we dont need component based object creation
    public College collegebean()
    {
     //return new College(princiObj());//obj created using constructor injection
     College c=new College();
     c.setPrinci(princiObj());
     return c;
    }

}
