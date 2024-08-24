package lk.ijse.gdse.aad67.user;

import jakarta.annotation.PostConstruct;
import lk.ijse.gdse.aad67.contract.GoodGirl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Eranga {

    private GoodGirl goodGirl;


//    public Eranga(GoodGirl goodGirl) {
//        this.goodGirl = goodGirl;
//    }
    @Autowired
    @Qualifier("Long Hair")
     public void setGoodGirl(GoodGirl goodGirl) {
        this.goodGirl = goodGirl;
    }

   @PostConstruct
    public void init(){
        goodGirl.love();
    }
}
