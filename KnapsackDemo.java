import java.util.*;
class Knapsack{
  int itemsno;
    int weight;
    int value;
     float valueProfitByWeight;
    public Knapsack(int itemsno,int weight,int value,float valueProfitByWeight)
    {  this.itemsno=itemsno;
        this.weight=weight;
        this.value=value;
        this.valueProfitByWeight=valueProfitByWeight;
    }
   //=value/weight;
    public String toString()
    {
        return "|" +itemsno+" | "+weight+" | "+value+" | "+valueProfitByWeight+ " | ";
    }
}
class KnapsackDemo{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Capacity/size[KG] of Knapsack :");
       int kcapacity=s.nextInt();
       System.out.println("How Many Items you Have to Put into Knapscak:");
       int n=s.nextInt();
       Knapsack [] kp=new Knapsack[n];
       for(int i=0;i<n;i++)
       {
        System.out.println("Enter itemno|weight|value");
        int itemno=s.nextInt();
        int weight=s.nextInt();
        int value=s.nextInt();
        float ratio= (float)value/weight;
        kp[i]=new Knapsack(itemno,weight,value,ratio);
       }
       System.out.println("-------------------------------------------------\n All items Details Befor Sorting \n");
      for(int i=0;i<n;i++)
      {
      System.out.println(kp[i]);
      }
      sort(kp,n);
       System.out.println("-------------------------------------------------\n All items Details Afhter Sorting [value/weight]:=\n");
      for(int i=0;i<n;i++)
      {
      System.out.println(kp[i]);
      }
      System.out.println(" Knapsack Weight | items in knapsack | cost");    
      System.out.println(kcapacity+" \t" + "empty" +"\t" +0);
      int prevcost=0;
      int nextitemval=0;
       int m=0;
      for(int i=0;i<n;i++)
      {
        prevcost+=kp[i].value;
        kcapacity-=kp[i].weight;
       
         if(kcapacity >0 )
         {
        System.out.println(kcapacity+" \t" +kp[i].itemsno +"\t" +prevcost);
         }      
         else
         {
            kcapacity+=kp[i].weight;
             prevcost-=kp[i].value;

           m=i;
           break;
        }

      }
             System.out.println("Knapsack capacity:="+kcapacity+" kp[m].weight="+kp[m].weight +"Kp[i].value="+kp[m].value);
       System.out.println("total profit of the Knapsack:=");
         float div =(float)kcapacity/kp[m].weight;
       float  totalprofit= prevcost+(div*kp[m].value);

        System.out.println(":="+totalprofit);
        
    }
    public static void sort (Knapsack [] kp ,int n)
    {
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(kp[j].valueProfitByWeight <kp[j+1].valueProfitByWeight)
                {
                    Knapsack temp=kp[j];
                    kp[j]=kp[j+1];
                    kp[j+1]=temp;
                }
            }
        }
    }
}