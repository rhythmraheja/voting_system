import java.util.*;
class Voter extends Main
{
String N;
String rn;
int v;
Scanner sc=new Scanner(System.in);
void input()
{
    System.out.println("Enter name");
    N=sc.nextLine();
    System.out.println("Enter roll no.");
    rn=sc.nextLine();
}
void vote()
{
   for(int i=0;i<Main.nc;i++)
   {
       System.out.println("Enter "+(i+1)+" for "+cannam[i].N);
   }
    v=sc.nextInt();
}
void Display()
{
    for(int i=0;i<nc;i++)
    {
        if(v==(i+1))
        System.out.println("You have voted for "+cannam[i].N);
    }
}
}
