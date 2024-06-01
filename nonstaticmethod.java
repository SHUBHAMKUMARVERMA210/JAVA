public class nonstaticmethod
{
    String name;
    int empid;
    String company;

    public nonstaticmethod(int empid,String name,String company)
    {
        this.empid=empid;
        this.name=name;
        this.company=company;
    }

    public void display()
    {
        System.out.println("THE DETAILS OF THE EMPLOYEE IS EMPLOYEE ID="+empid+" "+"EMPLOYEE NAME="+name+" "+"COMPANY="+company);
    }
        public static void main(String [] args)
    {
        nonstaticmethod emp1=new nonstaticmethod(1001,"SHUBHAM KUMAR VERMA","GOOGLE");
        nonstaticmethod emp2=new nonstaticmethod(1001,"RAHUL PANDEY","GOOGLE");
        emp1.display();
        emp2.display();
    }
}
