package lk.ijse.gdse.aad67.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse.aad67.contract.GoodGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Eranga {

    private final GoodGirl goodGirl;

    @Autowired
    public Eranga(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
    }

   @PostConstruct
    public void init(){
        goodGirl.love();
    }
}
