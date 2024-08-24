package lk.ijse.gdse.aad67.beans;

import lk.ijse.gdse.aad67.contract.GoodGirl;
import lk.ijse.gdse.aad67.customannotation.Nail;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Long Hair")
@Nail
public class Himansa implements GoodGirl {
    @Override
    public void love() {
        System.out.println("Love u Eranga and Let's go Australia");
    }
}
