package lk.ijse.gdse.aad67.config;

import lk.ijse.gdse.aad67.obj.OtherObj;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "lk.ijse.gdse.aad67")
//@ComponentScan(basePackageClasses = {MyObj.class})
public class AppConfig {
    @Bean
    OtherObj otherObj(){
        return new OtherObj();
    }
}
