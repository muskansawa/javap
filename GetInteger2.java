import java.util.*;
public class GetInteger2 {    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)    {   
         System.out.print("Enter an integer: ");  
               int i = GetAnInteger();     
                  System.out.println("You entered " + i);    }

    public static int GetAnInteger()   
     {    
     int r=0;  
     /* while (!sc.hasNextInt())   
      {   
               sc.nextLine();          
                 System.out.print("That's not "  + "an integer. Try again: ");      
      }*/      
      				 boolean b = sc.hasNextInt();
      				 try{
                    r= sc.nextInt(); 
                   }
                   catch(Exception e)
                   {System.out.println("oops");}  
                   
                   System.out.println(b);

                   return r;
     }
     } 
