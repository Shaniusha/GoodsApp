package Calculator_29_5_22;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)

public class TestCalculator {
    // общее правило для прохождения каждого теста
    //установка времени
    @Rule
    public TestRule timeout = new Timeout(1000);
    private String aDouble;
    private String bDouble;
    private Double expResult;
    private Double result;

    public TestCalculator(String aDouble, String bDouble, Double expResult) {
        this.aDouble = aDouble;
        this.bDouble = bDouble;
        this.expResult = expResult;


    }

    //  общее правило для прохождения каждого теста
    // задаем параметры в СООТВЕТСТВИИ с нашими полями класса: String aDouble;String bDouble;Double expResult;
//    @Parameterized.Parameters
//    public static List<Object[]> numbersP(){// plus
//        return
//                Arrays.asList(new Object[][]{{"1.5","2",3.5},{"2.7","3.4",6.1},{"5.1","3",7.1}});
//    }
    @Parameterized.Parameters
    public static List<Object[]> numbersD() {//del
        return
                Arrays.asList(new Object[][]{{"2.1", "2", 1.05}, {"6", "3.4", 1.76}, {"5.1", "0", Double.POSITIVE_INFINITY}});
    }

    @Ignore// игнорируем тест
    @Test(timeout = 1000)
// если (timeout = 100) будет так:test timed out after 100 milliseconds   // а в class Calculator в методе plus() Thread.sleep(200);
    public void testPlus() throws InterruptedException {
        Calculator cal = new Calculator();

        System.out.println("  plus");
//        aDouble = "8.9";
//        bDouble = "2.3";
//        expResult = 11.2;

        cal.setA_Plus(aDouble);
        cal.setB_Plus(bDouble);

        result = cal.plus();

        Assert.assertEquals(expResult, result);

    }

    @Test
    public void testDel() {
        Calculator cal = new Calculator();

        System.out.println("  del");
//        aDouble = "12.0";
//        bDouble = "0";
//        expResult = Double.POSITIVE_INFINITY;
        //Double.NEGATIVE_INFINITY, -12d / 0);
        //(Double.NEGATIVE_INFINITY, 12f / -0f);
        //(Double.NaN, 0d / 0);

        cal.setA_Del(aDouble);
        cal.setB_Del(bDouble);

        result = cal.del();
        Assert.assertEquals(expResult, result);

    }

    @Ignore
    @Test
    public void testmultiply() {
        Calculator cal = new Calculator();

        System.out.println("  multiply");
        aDouble = "4";
        bDouble = "5";
        expResult = 20.0;

        cal.setA_Multiply(aDouble);
        cal.setB_Multiply(bDouble);

        result = cal.multiply();
        Assert.assertEquals(expResult, result);
    }

    // целое число делим на 0
    @Ignore
    @Test(expected = ArithmeticException.class)
//тест считается пройденным если в нем есть ArithmeticException,в нашем случае делим на 0
    public void testDiv() throws InterruptedException {//бросаем исключение <<ожидается 0>>
        System.out.println("  div");
        int a = 8;
        int b = 0;
        int expResult = a / b;
        int result = a / b;
        Assert.assertEquals(expResult, result);
    }
}
