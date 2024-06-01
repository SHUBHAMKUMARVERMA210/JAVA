abstract class colour{
    public abstract void colour_name();
    public void pallet()
    {
        System.out.println("GENERAL");
    }
}

class display extends colour{
    public void colour_name()
    {
        System.out.println("RED");
    }
}

class Main{
    public static void main(String args[]) {
        display disp=new display();
        disp.colour_name();
        disp.pallet();
    }
}