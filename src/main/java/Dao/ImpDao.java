package Dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class ImpDao implements InterfaceDao {

    @Override
    public double getData() {
        System.out.println("VERSION 1 ...");
        return 23;
    }
}
