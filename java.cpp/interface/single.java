// Exactly one abstract method
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class single {
    public static void main(String[] args) {
        // Implement the single method using a Lambda expression
        MathOperation addition = (a, b) -> a + b;

        int result = addition.operate(50, 25);
        System.out.println("Functional Interface Addition: " + result);
    }
}
