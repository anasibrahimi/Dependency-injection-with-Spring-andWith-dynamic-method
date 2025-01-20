package Main;

import Dao.ImpDao;
import Metier.ImpMetier;
import Metier.InterfaceMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpringAnnotations {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("dao","metier");
        InterfaceMetier metier = context.getBean(InterfaceMetier.class);
        System.out.println("Result est : "+metier.calculerMetier());

    }


}
