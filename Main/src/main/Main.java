
package main;

import java.util.* ;

public class Main
{
    static int countUppercase(String password) {
    int count = 0;
    for (char c : password.toCharArray())
    {
        if (Character.isUpperCase(c)) count++;
    }
    return count;
}

static int countLowercase(String password){
    int count = 0;
    for (char c : password.toCharArray())
    {
        if (Character.isLowerCase(c)) count++;
    }
    return count;
}

static int countNumbers(String password) {
    int count = 0;
    for (char c : password.toCharArray()) 
    {
        if (Character.isDigit(c)) count++;
    }
    return count;
}

static int countSymbols(String password)
{
    int count = 0;
    for (char c : password.toCharArray())
    {
        if (!Character.isLetterOrDigit(c)) count++;
    }
    return count;
}

static int checkPasswordStrength(String password) {
    int score = 0;
    if (password.length() >= 8) score += 2;
    if (countUppercase(password) > 0) score += 2;
    if (countLowercase(password) > 0) score += 2;
    if (countNumbers(password) > 0) score += 2;
    if (countSymbols(password) > 0) score += 2;
    return score;
}
    
    
    public static void CreatePassword(int n)
    {
        ArrayList list=new ArrayList();

        for(char i='A';i<='Z';i++)
        {
            list.add(i);
        }
        for(char i='a';i<='z';i++)
        {
            list.add(i);
        }
        for(int i=0;i<10;i++)
        {
            list.add(i);
        }
        String s = "!@#$%^&*()_+-=[]{}|;:',.<>?/`~";
        
        for (char c : s.toCharArray())
        {
            list.add(c);
        }
         StringBuilder createpass=new StringBuilder();
        if(n>=8)
        {
           
            Random ran=new Random();
            for(int i=0;i<n;i++)
            {
                int Index=ran.nextInt(list.size());
                var c2=  list.get(Index);
                createpass.append(c2);
            }
            
            if(Uppercase(createpass)==true &&Lowercase(createpass)==true&&Number(createpass)==true&&Symbols(createpass)==true)
                System.out.println(createpass);
            else
                CreatePassword(n);
        
        }else
            System.out.println("enter number greater Than or equal of 8");
            
        
        
    }
    
    static boolean Uppercase(StringBuilder Createpassword) 
    {
    boolean cap=false;
    for (char c : Createpassword.toString().toCharArray())
    {
        if (Character.isUpperCase(c)) 
            cap=true;
    }
    return cap;
    }
    
    static boolean Lowercase (StringBuilder Createpassword)
    {
    boolean low =false;
    for (char c : Createpassword.toString().toCharArray())
    {
        if (Character.isLowerCase(c)) 
            low=true;
    }
    return low;
    }
    
    static boolean Number (StringBuilder Createpassword)
    {
    boolean num =false;
    for (char c : Createpassword.toString().toCharArray())
    {
        if (Character.isDigit(c)) 
            num=true;
    }
    return num;
    }
    
    static boolean Symbols (StringBuilder Createpassword)
    {
    boolean sym =false;
    for (char c : Createpassword.toString().toCharArray())
    {
        if (!Character.isLetterOrDigit(c)) 
            sym=true;
    }
    return sym;
    }
    public static void Start ()
    {
        System.out.println("Choose 1, 2, or 3");
           System.out.println("1->Enter a password to check strength ");
            System.out.println("2->Generate a new password");
            System.out.println("3->Exit");
            
    }
    
    

    
    public static void main(String[] args) 
    {
     try{ while (true)
          {
           Scanner in =new Scanner(System.in);
             Start();
            int inp=in.nextInt();
            

            switch(inp)
            {
                case 1:
                    System.out.println("Enter of Password ");
                    in.nextLine();
                    String input1=in.next();
                    System.out.println("Password Strength -> "+checkPasswordStrength(input1));
                    break;
                case 2:
                    System.out.println("Enter number of Password ");
                    int input2 =in.nextInt();
                    CreatePassword(input2);
                    break; 
                case 3:
                    System.exit(0);
                    break;
                    
                    
                    
            }
          }
            
         }
      catch(Exception e)
        {
            System.out.println("Enter a valid value ");
       
        }
      

        
      
    }
}
    
    

