import java.util.*;
class AnagramString{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter String 1 :");
        String s1=s.next();

         System.out.println("Enter String 2 :");
        String s2=s.next();
        if(isStringAnagram(s1.toLowerCase(),s2.toLowerCase()))
        {
            System.out.println(s1 +" and " +s2 +" Are Anagram to each Other..");
        }
        else{
            System.out.print(s1 +" and " +s2 +" Are NOT Anagram to each Other..");
        }

    }
   public static boolean isStringAnagram(String s1,String s2) 
   {
     if(s1.length()!=s2.length())
        return false;
        else
        { 
           return sort(s1).equals(sort(s2));
        }
        //return false;
   }
   public static String sort(String s)
   {

    char str[]=s.toCharArray();
    for(int i=1;i<s.length();i++)
    {
        for(int j=0;j<s.length()-1;j++)
        {
            if(str[j+1] >str[j])
            {
                char c=str[j+1];
                str[j+1]=str[j];
                str[j]=c;
            }
        }
        
    }
    return new String(str);
   }

}