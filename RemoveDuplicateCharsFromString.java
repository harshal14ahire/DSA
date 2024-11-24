
import java.util.Scanner;
import java.util.*;


class RemoveDuplicateCharsFromString{
    public static void main(String args[])
    {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter String to remove Duplicates Chars and Reverse it :");
        String str= s.next();
        Set <Character>setString= new LinkedHashSet<Character>();
        for(int i=0;i<str.length();i++)
        {
            setString.add(str.charAt(i));

        }
                StringBuffer brstr= new StringBuffer ();
        for(Character a:setString)
        {
                brstr.append(a);
        }
        brstr=brstr.reverse();

        System.out.println("set orginal string in set:"+setString);

        System.out.println("String afther removing duplicates chars is:="+brstr.toString());




    }
}