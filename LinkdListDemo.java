import java.util.*;

class Node
{
  int data;
  Node next;

  public Node(int data)
  {
    this.data=data;
    this.next=null;
  }
 
}

class LinkdList
{
    Scanner s =new Scanner(System.in);

    Node head=null;
    Node temp;
    int n=0;
    int linkedlistlength=0;
  public LinkdList(int n)
  {
    this.n=n;
  }
    
  public LinkdList()
  {
     this.n=0;
  }
   public  Node createLinedList(int n)
    {
       for(int i=1;i<=n;i++)
       {
           System.out.print("Enter Element:");
           int ele=s.nextInt();
             Node newnode =new Node(ele);
             newnode.next=null;
             if(head==null)
             {
                temp=head=newnode;
             }
             else
             {
                temp.next=newnode;
                temp=newnode;

             }
    
       }
       return head;
       
    }

      void display(Node head)
      {
        Node temp;
        for(temp=head;temp!=null;temp=temp.next)
        {
            System.out.printf("%d-->",temp.data);
            linkedlistlength++;
        }

      }

      public   int  len()
      {
        return linkedlistlength;
        

      }

     public Node insertAtBegining (int ele)
     {

         Node tmp=null;
       if(head==null)
       {
        Node n1= new Node(ele);
        return n1;
       }
       else{
        Node newnode= new Node(ele);
       tmp=newnode;
        newnode.next=head;
       }
       head=tmp;
      return tmp;

     } 
     
     public Node insertAtAnyPosition(int ele , int pos)
     {

                                Node t1,t2=null;int i;
                                Node newnode =new Node(ele);
                              for(t1=head,i=1;t1!=null&&i<pos-1;i++)
                              {
                                t1=t1.next;
                                t2=t1.next;
                              }
                               if(pos!=linkedlistlength)
                               {
                                newnode.next= t2;
                                t1.next=newnode;
                              }
                              else{
                                t1.next=newnode;
                              }

                                
                                
                              
                              return head;
                            /* 
                            Node tp=head;
                            for(int i=1;i<pos-1;i++)
                            {
                              tp=tp.next;
                              newnode.next=tp.next;
                              tp.next=newnode;
                              
                            }
                            return head;*/
     }
    }




class LinkdListDemo
{
    public static void main(String args[])
    {   Scanner s =new Scanner(System.in);
       LinkdList l1 =new LinkdList();
       System.out.println("Enter Number of Node Going to present in linked list:");
       Node hd=l1.createLinedList(s.nextInt());
       l1.display(hd);
       System.out.println("Enter Element to Insert in first Position:=");
       l1.display(l1.insertAtBegining(s.nextInt()));
       System.out.println("Length of LinkedList is :="+l1.len());

       System.out.println("Enter Element to Insert in any  Position:=");
       l1.display(l1.insertAtAnyPosition(s.nextInt(),s.nextInt()));

    }
}