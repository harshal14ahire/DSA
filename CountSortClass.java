import java.util.Arrays;
import java.util.Scanner;


class CountSortClass{

public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Size of Array :");
    int n=s.nextInt();
    int a[]=new int[n];
    for (int i=0;i<n;i++)
    {
        a[i]=s.nextInt();

    }

        
       
  //={8,3,5,1,3,8,6,4,3};
  int max=8;//Arrays.strem(a).max().getAsInt();
   int b[]=new int[a.length];
   System.out.println(" Array AftherAplying Counting SOrt:=")//+Arrays.toString(countSort(a,b,max)));
   System.out.println("Array ");


}
static int [] countSort(int a[],int b[], int k)
{

    int c[]=new int[k+1];


    for (int i=0;i<=k;i++)
    {
        c[i]=0;
    }

     int n=a.length;
     c[0]=0;
     
    for (int i=1;i<n;i++)
    {
        c[a[i]]++;
    }

    for (int i=1;i<=k;i++)
    {
        c[i]=c[i]+c[i-1];

    }

    for(int i= n-1 ;i>=0;i--)
    {
        b[c[a[i]]]=a[i];
        c[a[i]]--;
    }
    
    return b;
    
}


}