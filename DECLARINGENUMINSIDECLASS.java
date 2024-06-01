import java.io.*;
public class DECLARINGENUMINSIDECLASS {
    enum Level {
      LOW,
      MEDIUM,
      HIGH
    }
  
    public static void main(String[] args)throws IOException {
        int i;
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      System.out.println("ENTER THE VALUE BETWEEN 50-60");
      i=Integer.parseInt(br.readLine());
      if(i>=50 & i<=60)
      {
        Level myVar = Level.MEDIUM; 
        System.out.println("YOURE GRADE IS "+ " " +myVar);
      }
      else
      {
        System.out.println("WRONG VALUE ENTERED");
      } 
    }
  }