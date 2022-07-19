import java.util.function.IntUnaryOperator;

public class Main {
    // write the nextOddNum here
    public static NumberLambda nextOddNum = (int input) -> {
        // If even, return the number + 1, else recursively call with the value + 1 to check the next number
        return input + input % 2 | 1;
    };

    public static void main(String[] args) {
        int num = 5;
        int num2 = 10;
        int num3 = 17;
        int num4 = 50;

        System.out.println(nextOddNum.applyAsInt(num)); // 7
        System.out.println(nextOddNum.applyAsInt(num2)); // 11
        System.out.println(nextOddNum.applyAsInt(num3)); // 19
        System.out.println(nextOddNum.applyAsInt(num4)); // 51
    }
}

@FunctionalInterface
interface NumberLambda {
    int applyAsInt(int input);
}
