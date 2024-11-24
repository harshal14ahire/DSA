import java.util.*;

class MyStack
{
    int top;
    int arr[]=new int [10];

    MyStack()
    {
        this.top= -1;
        

    }


    void push (int ele)
    {  if(!isFull()){
        arr[++top]=ele;}
        else{
            System.out.println("Sorry We cant Insert Element Stack Is OverFlow...");
        }


    }

    boolean isFull()
    {
        return top==arr.length-1;
    }

    boolean isEmpty()
    {
    
      return top==-1;
    }
    int peek()
    {
        if(!isEmpty())
        {
          return arr[top];
        }
        else
        {
            System.out.println("Stck Is Under Flow (Empty..)");
            return -1;
        }

    }
   int pop() 
     {
        if(!isEmpty())
       return arr[top--];
        else{
            System.out.println("Stck Is Under Flow (Empty..)");
            return -1;
        }



     }

   int sum() { 
    int sum = 0;
    for (int i = 0; i <= top; i++) {
        sum += arr[i];
    }
    return sum;
}

    void clear() {
        top = -1;
        System.out.println("Stack has been cleared.");
    }

    int search(int ele) {
        for (int i = top; i >= 0; i--) {
            if (arr[i] == ele) {
                return top - i; // Return position from the top
            }
        }
        return -1; // Element not found
    }


   int max()
   { 
    
     if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }

      int max=arr[0];
     for (int i=0;i<=top;i++)
    {
          if(arr[i]>max)
          {
            max=arr[i];
          }

   }
    return max;

   }


   int min()
   {   int min=arr[0];
     for (int i=0;i<=top;i++)
    {
          if(arr[i]<min)
          {
            min=arr[i];
          }

   }
    return min;
   }
   }

class MyStackDemo{
    public static void main(String args[])
    {
        Scanner s =new Scanner (System.in);
        MyStack S=new MyStack();

        System.out.println("How many Element you push into Stack:");
        int n=s.nextInt();
    int i=1;

        while( i<=n)
        {
            System.out.println("Enter Ele:"+i+"=");
            int ele=s.nextInt();
            S.push(ele);
            i++;

        };

        
      System.out.println("Now Stack Top Pointer is  pointing Towards:"+S.peek());

      System.out.println("Sum of Stack Element :=" +S.max());
      System.out.println("Maximum of Stack:="+S.max());
      System.out.println("Minimum in Stack:="+S.min());

        while(!S.isEmpty())
        {
            System.out.println(S.pop());
        }
     

        
    }
}
