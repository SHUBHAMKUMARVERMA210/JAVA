import java.util.Scanner;

public class EXCEPTIONALHANDLING 
{
    public static void main(String[] args)
     {
        int choice=0;
        //TRY BLOCK
        try {
            Scanner br = new Scanner(System.in);
            System.out.println("ENTER YOURE CHOICE\n\n 1.MARKS BETWEEN 40 to 50 \n 2.MARKS BETWEEN 60 to 80 \n 3.MARKS BETWEEN 80 to 100\n");
            choice=br.nextInt();
        } 
        // CATCH BLOCK
        catch (Exception e) 
        {
          System.out.println("\nTHE VALUE IS NOT INTEGER\n");
        }
        //FINALLY BLOCK
         finally 
        {
            if(choice==1 || choice==2 || choice==3)
            {
                System.out.println("\nTHE 'TRY CATCH' FINISHED TO CHECK CORRECT CHOICE\n");
            }
            else
            if(choice!=1 || choice!=2 || choice!=3)
            {
                System.out.println("\nTHE 'TRY CATCH' DETECTED INVALID CHOICE\n");
            }
        }
        switch(choice)
        {
            case 1:
            System.out.println("YOURE GRADE IS 'C'\n");
            break;
            case 2:
            System.out.println("YOURE GRADE IS 'B'\n");
            break;
            case 3:
            System.out.println("YOURE GRADE IS 'A'\n");
            break;
        }
      }
    }
