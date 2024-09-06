import java.util.*;
class MyArray
{
    int n;
    int a[];
    public  MyArray(int a[],int n)
   {
    this.n=n;
    this.a=new int[n];
    // Allocate the array with exact size n
        for (int i = 0; i < n; i++) {
            this.a[i] = a[i]; // Copy the values from the input array to the class member array
        }

   }
   public  int Linear_Search(int ele)
   {
   // boolean flag=false;
     for(int i=0;i<a.length;i++)
     {
              if (ele == a[i])
              {
               //  break;
                return i+1;
               
                //flag=true;
                //break;
              }
     }
     //if(!flag)
     return -1;
    }


   public int binarySearch(int ele) {
    int lb = 0;
    int ub = a.length - 1;

    while (lb <= ub) 
    {
        int mid = (lb + ub) / 2;
        if (a[mid] == ele)
         {
            return mid;
        } else if (a[mid] < ele) 
        {
            lb = mid + 1;
        } else 
        {
            ub = mid - 1;
        }
    }
    return -1;
}

    

    public  void traverseArray(int a[])
    {   
         System.out.print("[");
        for (int i:a)
        System.out.print(i+",");
        System.out.print("]");

    
    }
    public  void traverseArray()
    {   
         System.out.print("[");
        for (int i:a)
        System.out.print(i+",");
        System.out.print("]");

    
    }
    public void traverseArray(int a[],int n)
    {
          System.out.print("[");
        for(int i=0;i<n;i++)
        {
             System.out.print(a[i]+",");
      
        }
          System.out.print("]");
    }

   public  int []  insertElement(int a[],int index, int ele)

 {
      for(int i=n-1;i>=index;i--)
      {
        a[i+1]=a[i];// shifting Arraay Elemt and creating 
                   // Array vacant position 

      }
      a[index]=ele;
   return a;

 }

 public  int[] deleteArrayElement(int a[],int index)
 {

    for(int i=index+1;i<=n-1;i++)
    {
        a[i-1]=a[i];
    }
    return a;

 }

  void bubbleSort()
  {
    for(int i=1;i<n;i++)
    {
      for(int j=0;j< n-i;j++)
      {
         if(a[j]>a[j+1])
         {
            int temp=a[j];
            a[j]=a[j+1];
            a[j+1]=temp;

         }
      }
    }
  }

  



    void mergeDivide(int a[],int low,int high)
    {

      
       if(low<high)
      {
            int mid =(low+high)/2;
            mergeDivide(a,low ,mid);
            mergeDivide(a,mid+1,high);
             merge(a,low,mid,high);

      }
    }
    void merge (int a[],int low, int mid, int high)
    {
        int i,j,k;
        int t[]=new int[a.length];
        i=low;
        j=mid+1;
        k=low;
        while ((i<=mid)&& (j<=high))
        {
          if(a[i]>=a[j])
          t[k++]=a[j++];
          else
          t[k++]=a[i++];
        }
        while (i<=mid)
        {
          t[k++]=a[i++];
        }
        while(j<=high)
        {
          t[k++]=a[j++];
        }

        for( i=low;i<=high;i++)
        {
          a[i]=t[i];
        }

    }

   void selectionSort() { 
    int i, temp, j, pos, min;
    for (i = 0; i < n - 1; i++) {
        min = a[i];  // Assume the first element is the minimum
        pos = i;     // Store the position of the assumed minimum
        
        // Find the minimum element in the unsorted part
        for (j = i + 1; j < n; j++) {
            if (a[j] < min) {
                min = a[j];  // Update the new minimum
                pos = j;     // Update the position of the new minimum
            }
        }
        
        // Swap the found minimum element with the current element
        if (pos != i) {      // Perform swap only if a new minimum was found
            temp = a[i];
            a[i] = a[pos];
            a[pos] = temp;
        }
    }
}
  
float median()
{
    bubbleSort();

    if( a.length%2!=0)
    {
        return (a[(int)a.length/2]);

    }
    else{
      int mid =(int) a.length/2;
      return (a[mid]+a[mid+1]);
    }

}


 void insertionSort()
 {
    int key;int j;
      for(int i=1;i<n;i++)
      {
        key=a[i];
        for( j=i-1;j>=0&& a[j]>key ;j--)
        {
          a[j+1]=a[j];
        }
        a[j+1]=key;
      }

 }
 static int[] countSort(int a[], int k) {
    int n = a.length;  // length of the input array
    
    int[] b = new int[n];  // output array
    int[] c = new int[k + 1];  // counting array
    
    // Initialize count array
    for (int i = 0; i <= k; i++) {
        c[i] = 0;
    }

    // Step 1: Count the occurrences of each element
    for (int i = 0; i < n; i++) {
        c[a[i]]++;
    }

    // Step 2: Modify the count array to store cumulative counts
    for (int i = 1; i <= k; i++) {
        c[i] += c[i - 1];
    }

    // Step 3: Build the output array in a stable manner
    for (int i = n - 1; i >= 0; i--) {
        b[c[a[i]] - 1] = a[i];  // Place the element in its correct sorted position
        c[a[i]]--;  // Decrease the count
    }

    return b;  // Return the sorted array
}



   int max()
   {  int max=a[0];
    for(int i=0;i<n;i++)
    {
      if(max<a[i])
      max=a[i];

      
    }
    return max;

   }

   int min()
   {  int min=a[0];
    for(int i=0;i<n;i++)
    {
      if(min>a[i])
      min=a[i];

      
    }
    return min;

   }

   double sum()
   {  int sum =0;
    for(int i=0;i<n;i++)
    {
      sum+=a[i];

        
      
    }
    return sum;

   }

   double average()  
  {
     return sum()/a.length;
  }


  }





class MyArrayOperationDemo{
    public static void main(String args[]) 
    {
       
        Scanner sc = new Scanner(System.in);

        // Sample array for demonstration
        int[] initialArray =new int[args.length] ;
        if(args.length==0){
          System.out.println("Please Provide Array Element At Command Line..");

        }
        else{
         
        //{29, 10, 14, 37, 13};
        int n = args.length;
           for(int i=0;i<n;i++)
           {
            initialArray[i]=Integer.parseInt(args[i]);
           }

        // Create MyArray object
        MyArray myArray = new MyArray(initialArray, n);

        while (true) {
            System.out.println("\n-:-------------------------------------------------------------------------------:-");
            System.out.println("\nChoose an operation:");
            System.out.println("1. Linear Search");
            System.out.println("2. Binary Search");
            System.out.println("3. Insert Element");
            System.out.println("4. Delete Element");
            System.out.println("5. Bubble Sort");
            System.out.println("6. Selection Sort");
            System.out.println("7. Merge Sort");
            System.out.println("8. Count Sort");
            System.out.println("9. Find Maximum");
            System.out.println("10. Find Minimum");
            System.out.println("11. Sum");
            System.out.println("12. Average");
            System.out.println("13. Median");
            System.out.println("14. Traverse Array");
            System.out.println("15. Exit");
            System.out.println("\n-:-------------------------------------------------------------------------------:-");
            System.out.print("Enter your choice:= ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to search: ");
                    int searchElement = sc.nextInt();
                    int linearSearchResult = myArray.Linear_Search(searchElement);
                    if (linearSearchResult != -1) {
                        System.out.println("Element found at position: " + linearSearchResult);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;
                
                case 2:
                    System.out.print("Enter element to search: ");
                    searchElement = sc.nextInt();
                    int binarySearchResult = myArray.binarySearch( searchElement);
                    if (binarySearchResult != -1) {
                        System.out.println("Element found at index: " + binarySearchResult);
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter index to insert at: ");
                    int insertIndex = sc.nextInt();
                    System.out.print("Enter element to insert: ");
                    int insertElement = sc.nextInt();
                    initialArray = myArray.insertElement(initialArray, insertIndex, insertElement);
                    myArray = new MyArray(initialArray, initialArray.length);
                    System.out.println("Element inserted.");
                    break;

                case 4:
                    System.out.print("Enter index to delete: ");
                    int deleteIndex = sc.nextInt();
                    initialArray = myArray.deleteArrayElement(initialArray, deleteIndex);
                    myArray = new MyArray(initialArray, initialArray.length - 1);
                    System.out.println("Element deleted.");
                    break;

                case 5:
                    myArray.bubbleSort();
                    System.out.println("Array sorted using Bubble Sort.");
                    myArray.traverseArray();
                    break;

                case 6:
                    myArray.selectionSort();
                    System.out.println("Array sorted using Selection Sort.");
                    myArray.traverseArray();
                    break;

                case 7:
                    myArray.mergeDivide(initialArray, 0, initialArray.length - 1);
                    System.out.println("Array sorted using Merge Sort.");
                    myArray.traverseArray();
                    break;

                case 8:
                    System.out.print("Enter maximum value (k) for Count Sort: ");
                    int k = sc.nextInt();
                    initialArray = MyArray.countSort(initialArray, k);
                    myArray = new MyArray(initialArray, initialArray.length);
                    System.out.println("Array sorted using Count Sort.");
                    myArray.traverseArray();
                    break;

                case 9:
                    System.out.println("Maximum value: " + myArray.max());
                    break;

                case 10:
                    System.out.println("Minimum value: " + myArray.min());
                    break;

                case 11:
                    System.out.println("Sum of elements: " + myArray.sum());
                      break;
                case 12:
                    System.out.println("Average of elements: " + myArray.average());
                    break;
                case 13:
                    System.out.println("Median of elements: " + myArray.median());
                    break;
                case 14:
                    System.out.println("Array elements:");
                    myArray.traverseArray();
                    break;
               case 15:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            
            } 
        }
        }
    }
}