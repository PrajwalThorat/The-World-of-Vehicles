import java.util.Scanner;

public class Main {

    public static void main(String args[])
    {
       
        Scanner scanner=new Scanner(System.in);
        System.out.println("Transmission type :");
        String transtype=scanner.next();
        System.out.println("Transmission model number :");
        String modelnumber=scanner.next();
            

        
        if(transtype.equals("Manual"))
        {
             Manual manual=new Manual(modelnumber);

        }
         else if(transtype.equals("AutomatedManual"))
         {
             Amt amt=new Amt(modelnumber);
         }
         else if(transtype.equals("AutoCVT"))
         {
             AutoCVT cvt=new AutoCVT(modelnumber);
         }
         else if(transtype.equals("AutoDCT"))
         {
             AutoDCT dct=new AutoDCT(modelnumber);
         }
         
        else
        System.out.println("Invalid transmission type");
    }







    }
    

