import exceptions.TooManyArgsException;
import javafx.util.Pair;

public class Parser {
    public static Pair<Pair<Integer, Integer>, String>  parse(String[] args) {
        if (args.length != 3) {
            throw new TooManyArgsException("Arg format is: val1 +|-|*|/ val2");
        }

        int valueOne;
        try {
            valueOne = Integer.parseInt(args[0]);
        }catch (NumberFormatException e){
            throw new NumberFormatException ("Val1 is not int");
        }

        int valueTwo;
        try {
            valueTwo = Integer.parseInt(args[2]);
        }catch (NumberFormatException e){
            throw new NumberFormatException ("Val2 is not int");
        }

        String operator = args[1];

        if(!operator.equals("+") && !operator.equals("-") && !operator.equals("/") && !operator.equals("*")){
            throw new IllegalArgumentException ("Operator not found");
        }
        Pair values = new Pair(valueOne, valueTwo);
        return new Pair(values, operator);
    }
}
