/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.Arrays;


public class SelectionSort
{
	public static void main(String[] args) {
	    
	    int []a={9,1,4,-2,6,7,-1,10};
	    
	    System.out.println("Array Afhter sorting Is:="+Arrays.toString(selectionSort(a,a.length)));
	    
	}
  public static int[] selectionSort(int a[],int n)
  {
      int i,j;
      for(i=0;i<n;i++)
      {
          int min=i;
          for( j=i+1;j<n;j++)
           {
                if(a[j]<a[min])
                min=j;
           }
           
           if(min!=i)
           {
               int temp=a[i];
               a[i]=a[min];
               a[min]=temp;
             
           }
      }
     return a;
  }
}
