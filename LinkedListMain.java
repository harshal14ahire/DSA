 class LinkedList
{
       static class Node
      {
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
      }

      public static Node head;
      public static Node tail;
      public static int size;

      public void addFirst(int data)
      {
        //create new node
        Node newnode=new Node(data);
        size++;
        if(head==null)
        {
          head=tail=newnode;
          return;
        }
        

        //newnode->next =head
        newnode.next=head;

        //newnode=head
        head=newnode;
      }

      public void addLast(int data)
      {
        Node newnode=new Node(data);
         size++;
        
        if(head==null)
        {
          head=tail=newnode;
          return;
        }
         tail.next=newnode;

         tail=newnode;
         
      }

      public void addMiddle(int data,int pos)
      {

        if(pos==0)
        {
          addFirst(data);
          return;
        }
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;

        while(i<pos-1)
        {
          temp=temp.next;
          i++;

        }
        newnode.next=temp.next;
        temp.next=newnode;
        
      }

      public void print()
      {
          Node temp=head;
         
          while(temp!=null)
          {
            System.out.print(temp.data+"-->");
            temp=temp.next;
          }
          System.out.println("null ");
      }

      public int deleteFirst()
      {
        if(size==0)
        {
          System.out.println("LL is empty");
          return Integer.MIN_VALUE;
        }
        else if(size==1){
              int val=head.data;
              head=tail=null;
              size=0 ;
              return val;
              
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
      }

      public int deleteLast()
      {
        if(size==0)
        {
          System.out.println("LL is empty");
          return Integer.MIN_VALUE;
        }
        else if(size==1){
              int val=head.data;
              head=tail=null;
              size=0;
              return val;
              
        }
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
          prev=prev.next;
        }

        int val=prev.next.data;

        prev.next=null;
        tail=prev;
        size--;
        return val;


      }
         public int ItrSearch(int key)
         {
          int i=0;
          Node temp=head;

          while(temp!=null)
          {
           
            if(temp.data==key)
            {
              return i+1;
            }
            temp=temp.next;
            i++;
          }
          return -1;
         }

         public int helper(Node head,int key)
         {
          if(head==null)
          {
            return -1;
          }
          if(head.data==key)
          {
            return 1 ;
          }
          int  idx=helper(head.next, key);
          if(idx==-1)
          {
            return -1;
          }
          return idx+1;
         }
         public int recSearch(int key)
         {
           return helper(head,key);
         }

         public void reverseLL()
         {
          Node prev=null;
          Node curr=tail=head;
          Node next;

          while(curr!=null)
          {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

          }
          head=prev;

         }

      public static void LinkedListMain(String args[])
      {
        LinkedList ll=new LinkedList();
        ll.print();
       
         ll.addFirst(1);
         ll.addFirst(0);   
         ll.print(); 
         ll.addLast(5);
        ll.print();
        ll.addMiddle(2, 2);
        ll.print();
        ll.addMiddle(3, 3);
        ll.print();  
        ll.deleteFirst();
        ll.print();
        ll.deleteLast();
        ll.print();
        System.out.println("size of LinkedList is: "+ll.size); 
        
        System.out.println("element found at position: "+ll.ItrSearch(2));
        System.out.println("element found at position: "+ll.ItrSearch(10));

        System.out.println("element found at position: "+ll.recSearch(2));
        System.out.println("element found at position: "+ll.recSearch(10));
   

        ll.reverseLL();
        ll.print();




      }

}