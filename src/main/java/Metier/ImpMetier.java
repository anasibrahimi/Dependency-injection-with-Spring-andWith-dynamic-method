package Metier;

import Dao.ImpDao;
import Dao.ImpDao_3;
import Dao.InterfaceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ImpMetier implements InterfaceMetier{


    @Autowired
    @Qualifier("dao2")
    InterfaceDao dao;

    @Override
    public double calculerMetier() {
        double result = dao.getData()*2;
        return result;
    }


}
