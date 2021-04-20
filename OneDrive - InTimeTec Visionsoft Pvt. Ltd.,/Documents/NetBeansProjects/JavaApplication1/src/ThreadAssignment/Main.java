 
package ThreadAssignment;
import java.io.*;
import java.util.*;
import static java.lang.Math.random;
import static java.lang.StrictMath.random;

class Operation extends Thread
{
   Map<String,Integer> listofbooking=new HashMap<String,Integer>();
   BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   
  synchronized String takevaluefromuser()        
  {
    String value = null;
    try
    {
    
     value=br.readLine();
     return value;
    }  
    catch(Exception e)
    {
      System.out.println("Exception:"+e);
    }
    return null;
  }
  
   
  synchronized public void booking()
  {
      System.out.println("Enter Your Name:");
      String name=takevaluefromuser();
      if(listofbooking.containsKey(name))
          System.out.println("You Have already done the booking");
      else
      {
      Random random=new Random();
      int generatednumber=random.nextInt();
      System.out.println("Booking ID Number Is:"+generatednumber);
      listofbooking.put(name,generatednumber);   
      }
   
  }
   
  synchronized public void displaystatus()
  {
    System.out.println("Enter Your Name To Check The Status:");
    String name=takevaluefromuser();
    if(listofbooking.containsKey(name))
        System.out.println("You Will Get The Delivery Very Soon & id="+listofbooking.get(name));
    else
        System.out.println("Your Booking is Not Avavilable");
  
  }   
  
   public void bookingcancel()
   {
     System.out.println("Enter Booking Name");  
     String name=takevaluefromuser();
    
     if(listofbooking.containsKey(name))
     {
       listofbooking.remove(name);
       System.out.println("....Booking Canceled");
     } 
     else
         System.out.println("No Such Booking Is Available");
   }
  
  
  
  
   public void run()
   {
     Thread currentthread=Thread.currentThread();
     switch(currentthread.getName())
     {
         case "FirstThread":System.out.println("...Booking Gas");
                            booking(); 
                            break;
         case "SecondThread":System.out.println("...Getting Status");
                             displaystatus();  
                            break;
         case "ThirdThread":bookingcancel();
                            break;
     
     }
   
   
   }
 
}



public class Main { 
  public static void main(String args[])
  throws IOException
  {  
    Operation objectofoperation=new Operation();
    
    
    String repeat;
    do{
        System.out.println("Enter Your Choice From Number \n1.Booking\n2.Status\n3.Cancel Booking");
    switch(Integer.parseInt(objectofoperation.takevaluefromuser()))
    {
        case 1:Thread one=new Thread(objectofoperation,"FirstThread");
               
               one.start(); 
               try{one.join();}catch(Exception e){}
               break;
        case 2:Thread two=new Thread(objectofoperation,"SecondThread");
               two.start(); 
               try{two.join();}catch(Exception e){}
               break;
        case 3:Thread three=new Thread(objectofoperation,"ThirdThread");
               three.start(); 
               try{three.join();}catch(Exception e){}
               break;
        default:System.out.println("..Entered Wrong Choice");       
    }
         Thread currentthread=Thread.currentThread();  
         System.out.println("Enter '1' To Repeat The Process Else Press Any Other key");
         repeat=objectofoperation.takevaluefromuser();
    }while(repeat.equals("1"));
  }
}
