package lk.ijse.gdse.aad67.obj;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MyObj {
    public MyObj() {
        System.out.println("Hello MyObj");
    }
}
