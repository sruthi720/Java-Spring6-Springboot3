package org.telusko;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean(name = {
            "COM1","system","Desktop1"
    })
    @Scope("prototype")
    public Desktop desktop1(){
        return  new Desktop();
    }
}
