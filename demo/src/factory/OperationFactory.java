package factory;

/**
 * Created by cute coder
 * 2019/7/5 13:39
 */
public class OperationFactory {
    public static Operation createOperation(String operation) {
        Operation operate = null;
        switch (operation) {
            case "+":
                operate = new OperationAdd();
                break;
            case "-":
                operate = new OperationSub();
                break;
            case "*":
                operate = new OperationMul();
                break;
            case "/":
                operate = new OperationDev();
                break;
        }
        return operate;
    }
}
