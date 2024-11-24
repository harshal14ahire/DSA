
import java.util.*;
class RankByElementsInArray{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("ENter no of Elememts in Array:");
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter A"+(i+1));
            arr[i]=s.nextInt();
        }

        System.out.println("Array Before by Ranking:"+Arrays.toString(arr));
          System.out.println("Array Afther by Ranking:"+AArrays.toString(rankOrder(arr)));
        
        

    }
    public static int[] rankOrder(int a[])
    {
        int b[]=Arrays.copyOfRange(a,0,a.length);
        
        Arrays.sort(b);
        for(int i=0;i<b.length;i++)
        {
              for(int j=0;j<a.length;j++)
           {
                if(b[i]==a[j])
                {a[j]=i+1;
                break;}
            }
        }return a;
    }
}