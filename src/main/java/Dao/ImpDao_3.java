package Dao;

import org.springframework.stereotype.Component;

@Component("dao3")
public class ImpDao_3 implements InterfaceDao{
    @Override
    public double getData() {
        System.out.println("Version 3 ..");
        return Math.random()*100;
    }
}
