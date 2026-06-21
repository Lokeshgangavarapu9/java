// Two methods make it a normal interface
interface BasicCalculator {
    void showSum(int sum);
    boolean isPositive(int number);
}

// A standard class must implement all methods
class SimpleCalc implements BasicCalculator {
    @Override
    public void showSum(int sum) {
        System.out.println("The final sum is: " + sum);
    }

    @Override
    public boolean isPositive(int number) {
        return number >= 0;
    }
}

public class functional {
    public static void main(String[] args) {
        SimpleCalc calc = new SimpleCalc();
        
        int total = 10 + 20;
        calc.showSum(total);
        System.out.println("Is the number positive? " + calc.isPositive(total));
    }
}
