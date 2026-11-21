public class calculatortext {
    public static void main(String[] args) {
        calculator calc = new calculator();

        // Java's built-in assert checks the condition and fails the pipeline if false
        assert calc.add(2, 3) == 5 : "2 + 3 should be 5";
        assert calc.subtract(10, 4) == 6 : "10 - 4 should be 6";

        System.out.println("ALL TESTS PASSED!");
    }
}
