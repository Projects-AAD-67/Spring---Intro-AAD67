package lk.ijse.gdse.aad67;

import lk.ijse.gdse.aad67.aop.Transaction;
import lk.ijse.gdse.aad67.config.AppConfig;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInit {
    public static void main(String[] args) {
        var ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        Transaction transaction = (Transaction) ctx.getBean("transaction");
        transaction.startTransaction();
        transaction.endTransaction();
        ctx.registerShutdownHook();


    }
}
