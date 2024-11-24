import java.util.*;
public class JuggedArrayInJava{
    
    public static void main(String []args)
    {   Scanner s = new Scanner(System.in);
        System.out.println("Enter ther length(m)row in jagged Array:");
        int m=s.nextInt();
        int [][]jgarr= new int[m][];
        for(int i=0;i<m;i++)
        {
            System.out.println("How many cols in "+i+" row");
            jgarr[i]=new int[s.nextInt()];
        }
         for(int i=0;i<m;i++)
        {   for(int j=0;j<jgarr[i].length;j++)
            {
                    System.out.println("Enter Ele:"+(i+1)+" "+(j+1));
                     jgarr[i][j]=s.nextInt();
            }
        }
        System.out.println("Jugged Array Is:");
        System.out.print("[");
          for(int i=0;i<m;i++)
        {    System.out.print("[");
             for(int j=0;j<jgarr[i].length;j++)
            {
                 System.out.print(jgarr[i][j]);
                 if(j+1<jgarr[i].length)
                 System.out.print(",");
            }
              System.out.print("]");
        } System.out.print("]");

    }
}