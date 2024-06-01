import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.*;
public class ADDINGNUMBERSWITHOUTTHIRDVARIABLES 
{
    public static void main(String[] args) throws IOException
    {
        int a,b;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER FIRST NUMBER");
        a=Integer.parseInt(br.readLine());
        System.out.println("ENTER SECOND NUMBER");
        b=Integer.parseInt(br.readLine());
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("THE NUMBER OF A IS"+" "+b);
        System.out.println("THE NUMBER OF B IS"+" "+a);
    }
}
