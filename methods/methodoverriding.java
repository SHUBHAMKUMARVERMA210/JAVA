package methods;
class methodoverriding {
    void run() {
        System.out.println("MAN WILL WALK");
    }
}


class Person extends methodoverriding {
    @Override
    void run() {
        System.out.println("MAN IS WALKING");
    }

    public static void main(String args[]) {
        Person obj = new Person();
        obj.run();
    }
}
