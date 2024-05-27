package OPERATORS;

public class logicaloperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // LOGICAL AND
        boolean resultAnd = a && b;
        System.out.println("Logical AND Result: " + resultAnd);

        // LOGICAL OR
        boolean resultOr = a || b;
        System.out.println("Logical OR Result: " + resultOr);

        // LOGICAL NOT
        boolean resultNotA = !a;
        System.out.println("Logical NOT Result (A): " + resultNotA);
        boolean resultNotB = !b;
        System.out.println("Logical NOT Result (B): " + resultNotB);

        // LOGICAL XOR
        boolean resultXor = a ^ b;
        System.out.println("Logical XOR Result: " + resultXor);
    }
}
