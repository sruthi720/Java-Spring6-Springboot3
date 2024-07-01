package org.telusko;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

    @Bean
    public Alien alien1(@Qualifier("system")@Autowired Computer com){//means if you want to call alien it is dependent on a computer object, spring will ask  the container to give a computer object , so container will give desktop object since its also a computer
        Alien obj = new Alien();// can @Autowired  or not mandatory, autowired means connecting a wire between Alien and Desktop
        obj.setAge(21);
        obj.setCom(com);
        return  obj;
    }

    @Bean(name = {
            "COM1","system","Desktop1"
    })
    @Scope("prototype")
    public Desktop desktop1(){
        return  new Desktop();
    }


    @Bean
//    @Primary
    public Laptop laptop3(){
        return new Laptop();
    }

}
