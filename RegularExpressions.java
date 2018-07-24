

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpressions {

    /**
     * @param args the command line arguments
     */
    public static boolean Name(String name)
    {
        Pattern p = Pattern.compile("^[A-Z][a-zA-Z]{1,30}$");//. represents single character  
        Matcher m = p.matcher(name);  
        boolean b = m.matches();  
        if(b==true){
            return true;
        }
        else
        {
            return false; 
        }
            
       
    }
     public static boolean Email(String email)
    {
        Pattern p = Pattern.compile("^[a-zA-Z\\d]{5,30}[@][a-zA-Z\\d]{5,10}[.][a-zA-Z\\d]{2,3}$");//. represents single character  
        Matcher m = p.matcher(email);  
        boolean b = m.matches();  
        if(b==true){
            return true;
        }
        else
        {
            return false; 
        }
            
       
    }
    
    
    public static boolean PhoneNumber(String number)
    {
        Pattern p = Pattern.compile("^[\\d]{3}[-][\\d]{3}[-][\\d]{4}$");//. represents single character  
        Matcher m = p.matcher(number);  
        boolean b = m.matches();  
        if(b==true){
            return true;
        }
        else
        {
            return false; 
        }
            
       
    }
    
      public static boolean Date(String date)
    {
        Pattern p = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$");//. represents single character  
        Matcher m = p.matcher(date);  
        boolean b = m.matches();  
        if(b==true){
            return true;
        }
        else
        {
            return false; 
        }
            
       
    }
        public static boolean HTML(String input)
    {
        Pattern p = Pattern.compile("^[<][a-zA-Z\\d]+[>][\\s]*[<][/][a-zA-Z\\d]+[>]$");//. represents single character  
        Matcher m = p.matcher(input);  
        boolean b = m.matches();  
        if(b==true){
            return true;
        }
        else
        {
            return false; 
        }
            
       
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter valid name e.g James");
        String name=scan.next();
         if(Name(name)==true)
        {
            System.out.println("Name is valid! ");
        }
        else
        {
             System.out.println("Sorry, Name is not valid!");
        }
         System.out.println("Please enter valid email e.g abc23@hotmail.com");
         String email= scan.next();
          if(Email(email)==true)
        {
            System.out.println("Email is valid! ");
        }
        else
        {
             System.out.println("Sorry, Email is not valid!");
        }
          System.out.println("Please enter valid phone number e.g 098-897-9999");
          String num= scan.next();
        if(PhoneNumber("143-987-0000")==true)
        {
            System.out.println("Phone number is valid ");
        }
        else
        {
             System.out.println("Sorry, Phone number is not valid! ");
        }
        System.out.println("Please enter valid date e.g 19/07/2018");
        String date=scan.next();
         if(Date(date)==true)
        {
            System.out.println("Date is valid! ");
        }
        else
        {
             System.out.println("Sorry, Date is not valid! ");
        }
         System.out.println("Please enter valid html tag e.g <p> </p>");
         String input=scan.next();
          if(HTML("<p>   </p>")==true)
        {
            System.out.println("Html tag is valid! ");
        }
        else
        {
             System.out.println("Sorry, Html tag is not valid! ");
        }
    }
    
}
