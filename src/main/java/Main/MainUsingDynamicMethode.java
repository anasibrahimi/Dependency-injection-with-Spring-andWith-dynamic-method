package Main;

import Dao.InterfaceDao;
import Metier.InterfaceMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class MainUsingDynamicMethode {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner in = new Scanner(new File("config.txt"));

        String daoClassName = in.nextLine();
        Class cDao = Class.forName(daoClassName);
        InterfaceDao dao = (InterfaceDao) cDao.newInstance();

        String metierClassName = in.nextLine();
        Class cMetier = Class.forName(metierClassName);
        InterfaceMetier metier = (InterfaceMetier) cMetier.newInstance();

        Method methode = cMetier.getMethod("setDao",InterfaceDao.class);
        methode.invoke(metier,dao);

        System.out.println("The result is : "+metier.calculerMetier());
    }
}
