package Dao;

import org.springframework.stereotype.Component;

@Component("dao2")
public class ImpDao_2 implements InterfaceDao{

    @Override
    public double getData() {
        System.out.println("VERSION 2 ...");
        return 2;
    }
}
