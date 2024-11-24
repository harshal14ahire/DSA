
import java.util.*;

class ArrayElementsShifting{
    public static void main(String args[])
    {
        int a[]={1,3,4,5,6};
        //[_,3,4,5,6]=[3,4,5,6,1] =4,5,6,1,3
        int tmp=0;
        Scanner s =new Scanner(System.in);
        System.out.println("How Many Shift you want to Add:");
        int shift=s.nextInt();
         System.out.println("In Which direction you want to  shift elements(left,right):=");
         String str= s.next();
    int i,j;
    if((str.toLowerCase()).equals("left"))
    {

      
       for( i=0;i<shift;i++)//iterate through no of times times shift

       {

         tmp=a[0];// take evey time a[0] to shift to right most place in arry
         for( j=0;j<=a.length-1;j++)
         {
            if(j+1<a.length)// handle array index out of bound
            {
                a[j]=a[j+1];// move forwards all elemetns to create last vacant poistion
            }
         }
         a[j-1]=tmp;// stor elemet at last postion in array

       }
    }
    else{
        
       for( i=a.length-1;i>shift;i--)
       {

         tmp=a[a.length-1];
         for( j=a.length-1;j>=0;j--)
         {
            if(j-1>-1)
            {
                a[j]=a[j-1];
            }
         }
         a[j+1]=tmp;

       }

    }
        System.out.println("Array Aftehr One Shifting :="+Arrays.toString(a));




    }
}