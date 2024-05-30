public class FinalKeywordImplementation {
    final int speedlimit = 90;
    void run() {
        System.out.println("The speed limit is " + speedlimit);
    }

    public static void main(String args[]) {
        FinalKeywordImplementation obj = new FinalKeywordImplementation();
        obj.run();
    }
}
