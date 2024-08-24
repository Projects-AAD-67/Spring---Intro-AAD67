package lk.ijse.gdse.aad67.beans;

import lk.ijse.gdse.aad67.contract.GoodGirl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Long Hair")
public class Shashi implements GoodGirl {
    @Override
    public void love() {
        System.out.println("Love u Eranga with French kiss");
        System.out.println("Love u Eranga with French kiss");
    }
}
