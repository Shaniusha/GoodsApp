package Calculator_29_5_22;

import org.junit.Test;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculator calculator = new Calculator();
        System.out.println("   <<plus>>");
        calculator.setA_Plus("l.5");
        calculator.setB_Plus("2");
        Double res = calculator.plus();
        System.out.println(res);

        calculator = new Calculator();
        System.out.println("   <<del>>");
        calculator.setA_Del("-8.4");
        calculator.setB_Del("0");
        Double res1 = calculator.del();
        System.out.println(res1);

        calculator = new Calculator();
        System.out.println("  <<multiply>>");
        calculator.setA_Multiply("7");
        calculator.setB_Multiply("3.5");
        Double res2 = calculator.multiply();
        System.out.println(res2);
    }
}
