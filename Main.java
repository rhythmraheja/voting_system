import java.util.*;
class Main
{
    static int nc;
    static int nv;
    static Candidate cannam[];
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of candidates");
        nc=sc.nextInt();
        cannam=new Candidate[nc];
        for(int i=0;i<nc;i++)
        {
           cannam[i]=new Candidate();
           cannam[i].input();
        }
        System.out.println("Enter number of voters");
        nv=sc.nextInt();
        Voter a[];
    a=new Voter[nv];
    int i=0;
    while(i<nv){
        a[i]=new Voter();
    a[i].input();
    a[i].vote();
    a[i].Display();
    i++;
    }
}
}