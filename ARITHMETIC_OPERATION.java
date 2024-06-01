import java.io.*;
public class ARITHMETIC_OPERATION 
{
    public static void main(String [] args) throws IOException
    {
        int a,b,c,ch;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER YOU'RE CHOICE\n\n1.ADDITION\n2.MULTIPLICATION\n3.DIVISION\n4.SUBTRACTION\n5.AVERAGE\n6.VOLUME OF CONE\n7.AREA OF TRAPEZOIL\n8.BOOLEAN VALUE\n\n(QUESTION-HOW MANY FACES ARE THERE IN A CUBE)\n");
        ch=Integer.parseInt(br.readLine());
        System.out.println("\nSELECTED CASE IS ="+" "+ ch+"\n");
        switch(ch)
        {
            case 1:
            System.out.println("ENTER FIRST NUMBER");
            a=Integer.parseInt(br.readLine());
            System.out.println("ENTER SECOND NUMBER");
            b=Integer.parseInt(br.readLine());
            c=a+b;
            System.out.println("ADDITION OF TWO NUMBERS IS="+c+"\n");
            break;
            case 2:
            System.out.println("ENTER FIRST NUMBER");
            a=Integer.parseInt(br.readLine());
            System.out.println("ENTER SECOND NUMBER");
            b=Integer.parseInt(br.readLine());
            c=a*b;
            System.out.println("MULTIPLICATION OF TWO NUMBERS IS="+c+"\n");
            break;
            case 3:
            System.out.println("ENTER FIRST NUMBER");
            a=Integer.parseInt(br.readLine());
            System.out.println("ENTER SECOND NUMBER");
            b=Integer.parseInt(br.readLine());
            c=a/b;
            System.out.println("DIVISION OF TWO NUMBERS IS="+c+"\n");
            break;
            case 4:
            System.out.println("ENTER FIRST NUMBER");
            a=Integer.parseInt(br.readLine());
            System.out.println("ENTER SECOND NUMBER");
            b=Integer.parseInt(br.readLine());
            c=a-b;
            System.out.println("SUBTRACTION OF TWO NUMBERS IS="+c+"\n");
            break;
            case 5:
            System.out.println("ENTER THE LIMIT OF NUMBER TO FIND THE AVERAGE5");
            int ln,i,res=0;
            float avg=0;
            ln=Integer.parseInt(br.readLine());
            System.out.println("ENTER "+ln+" NUMBERS");
            for(i=0;i<ln;i++)
            {
                res = Integer.parseInt(br.readLine());
                avg += res;
            }
            avg /=ln;
            System.out.println("AVERAGE OF "+ln+" NUMBERS IS="+avg+"\n");
            break;
            case 6:
            float v,pi=3.14f,r,h;
            System.out.println("ENTER THE RADIUS OF CONE");
            r=Float.parseFloat(br.readLine());
            System.out.println("ENTER THE HEIGHT OF CONE");
            h=Float.parseFloat(br.readLine());
            v=4*pi*r*r*h/3;
            System.out.println("VOLUME OF CONE="+" "+v+"\n");
            break;
            case 7:
            float a1,b1,h1,ar;
            System.out.println("ENTER THE VALUE OF A");
            a1=Float.parseFloat(br.readLine());
            System.out.println("ENTER THE VALUE OF B");
            b1=Float.parseFloat(br.readLine());
            System.out.println("ENTER THE HEIGHT OF TRAPEZOIL");
            h1=Float.parseFloat(br.readLine());
            ar=(a1+b1)*h1/2;
            System.out.println("AREA OF TRAPEZOIL="+" "+ar+"\n");
            break;
            case 8:
            boolean p=true;
            int n,n1=6;
            System.out.println("ENTER THE FACES OF CUBE\n");
            n=Integer.parseInt(br.readLine());
            if(n==n1)
            {
                System.out.print(p==true);
                System.out.print("\nRIGHT ANSWER");

            }
            else
            {
                System.out.print("WRONG ANSWER");
            }
            break;
        }
    }
}
