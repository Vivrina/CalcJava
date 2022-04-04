import javafx.util.Pair;

public class Calculator {
    public static int calculate(String[] args) {
        Pair<Pair<Integer, Integer>, String> arguments = null;
        try {
            arguments = Parser.parse(args);
        }catch (RuntimeException e){
            e.getMessage();
        }

        String operator = arguments.getValue();
        Pair<Integer, Integer> values = arguments.getKey();
        int val1 = values.getKey();
        int val2 = values.getValue();
        int result = 0;

        switch (operator) {
            case "+":
                result = val1 + val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "/":
                try{
                    result = val1 / val2;
                }catch(ArithmeticException e) {
                    System.err.print("You cannot divide by zero!");
                    return 0;
                }
                break;
            case "*":
                result = val1 * val2;
                break;

        }
        return result;
    }

}

