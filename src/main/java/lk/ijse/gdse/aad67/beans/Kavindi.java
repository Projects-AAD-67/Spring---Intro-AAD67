package lk.ijse.gdse.aad67.beans;

import lk.ijse.gdse.aad67.contract.GoodGirl;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Kavindi implements GoodGirl {
    @Override
    public void love() {
       System.out.println("Love u Eranga");
       System.out.println("Love u Eranga");
       System.out.println("Love u Eranga");
       System.out.println("Love u Eranga");
       System.out.println("Love u Eranga");
    }
}
