import java.io.*;
public class armstrong 
{
    public static void main(String[] args) throws IOException
    {
        int number,originalnumber,remainder,result=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER");
        number=Integer.parseInt(br.readLine());
        originalnumber=number;
        while(originalnumber!=0)
        {
            remainder=originalnumber%10;
            result+=Math.pow(remainder, 3);
            originalnumber/=10;
        }
        if (result==number)
            System.out.println(number+" "+"IS AN ARMSTRONG NUMBER");
        else
            System.out.println(number+"IS NOT AN ARMSTRONG NUMBER");
    }
}
