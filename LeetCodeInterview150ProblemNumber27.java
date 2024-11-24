
import java.util.*;

class LeetCodeInterview150ProblemNumber27{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    System.out.print("How Many Elemnt in youre Array :");
    int n=s.nextInt();
    int A[]=new int[n];
    for( int i=0;i<n;i++)
    {
        A[i]=s.nextInt();

        
    }
    System.out.println("Enter Value To be removed..");
    int val= s.nextInt();
    MyArray a=new MyArray(n,A);
    int cnt=0;
    for(int i=0;i<n;i++)
    {   if(i+1<n)
       {
         if(A[i]==val)
         {
            int temp =A[i];
            A[i]=A[i+1];
            A[i+1]=temp;

         }
         else 
     {
        cnt++;
     }
     }
    
    }

      System.out.println("...........................................");
      a.traverseArray(A,A.lengthcnt);
      System.out.print("Original Array Afther Removing Element");




}


}