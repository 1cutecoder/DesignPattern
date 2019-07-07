package factory;

/**
 * Created by cute coder
 * 2019/7/5 14:02
 */
public class OperationTest {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("-");
        operation.numberA = 5.0;
        operation.numberB = 22.5;
        double result = operation.getResult();
        System.out.println("result = " + result);
        Operation operation1 = OperationFactory.createOperation("+");
        operation1.numberA = 5.0;
        operation1.numberB = 22.5;
        double result1 = operation1.getResult();
        System.out.println("result1 = " + result1);
    }
}
