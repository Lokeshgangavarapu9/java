// Completely empty! It is a marker tag.
interface SecuredCalculation {
}

// This class is explicitly "marked" with the interface tag
class SafeCalculation implements SecuredCalculation {
    int add(int a, int b) {
        return a + b;
    }
}

public class marker {
    public static void main(String[] args) {
        SafeCalculation calc = new SafeCalculation();
        int answer = calc.add(100, 200);

        // Check if the object has been "marked" with permissions
        if (calc instanceof SecuredCalculation) {
            System.out.println("ACCESS GRANTED: Calculation result is safe. Output: " + answer);
        } else {
            System.out.println("ACCESS DENIED: Missing permission tag!");
        }
    }
}
