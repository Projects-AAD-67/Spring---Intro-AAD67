package lk.ijse.gdse.aad67.beans;

import lk.ijse.gdse.aad67.contract.GoodGirl;
import org.springframework.stereotype.Component;

@Component
public class Kavitha implements GoodGirl {
    @Override
    public void love() {
        System.out.println("Love u Eranga");
    }
}
