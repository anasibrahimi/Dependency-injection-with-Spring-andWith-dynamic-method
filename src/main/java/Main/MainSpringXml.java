package Main;

import Metier.ImpMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpringXml {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ImpMetier metier = (ImpMetier) context.getBean("metier");
        System.out.println("the result :"+metier.calculerMetier());
    }
}
