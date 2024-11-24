import java.util.*;

class Graph{
    char src;
    int weight;
    char des;
    public Graph(char src ,int weight,char des)
    {
        this.src=src;
        this.weight=weight;
        this.des=des;
    }
   public String toString()
   {
    return " \n "+src+"--"+weight+"--"+des;

   }

}
class KruskalMST{
    public static void main(String args[])
    {
        Scanner s= new Scanner(System.in);
        System.out.println("How may Vertices In Graph:=");
        int n=s.nextInt();
        Graph [] g=new Graph[n];
        for(int i=0;i<n;i++)
        {    
             for(int j=0;i<n&&i!=j;j++)
             {
                System.out.println((i+1)+"-->"+(j+1)+"Y?N");
                {
                    if(Character.toLowerCase((s.next().charAt(0)))=='y')
                   {
                         System.out.println("Enter SRC | Weight | Destination:");
                           g[i]=new Graph(s.next().charAt(0),s.nextInt(), s.next().charAt(0));
                  }
                }
             }

        }
        System.out.println("Graph before sorting:");
          for(int i=0;i<n;i++)
          {  
            System.out.println(g[i]);
          }
        sortByEdge(g,n);
           System.out.println("Graph Afther sorting:");
          for(int i=0;i<n;i++)
          {
            System.out.println(g[i]);
          }

    }
    public static void sortByEdge(Graph []g,int n)
    {
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                if(g[j+1].weight< g[j].weight)
                {
                    Graph temp=g[j+1];
                    g[j+1]=g[j];
                    g[j]=temp;
                }
            }
        }
    }
}