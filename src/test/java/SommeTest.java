import org.junit.Assert;
import org.junit.Test;

public class SommeTest {

    @Test
    public   void testSom(){
        Somme som ;
        som = new Somme();
        double a = 5 ; double b = 6 ;
        double exp = 11 ;
        double res = som.somma(a, b);
        Assert.assertTrue(res == exp);
    }
}
