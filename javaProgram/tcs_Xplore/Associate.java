import java.util.*;
class Solution
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt(); sc.nextLine();
        Associate [] associate = new Associate [n];
        for(int i=0;i<n;i++)
        {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            double scores=sc.nextDouble(); sc.nextLine();
            int experience=sc.nextInt();sc.nextLine();
            associate[i]= new Associate(id, name, scores,experience);
        }
        double scores= sc.nextDouble();
        Associate ss=Solution.searchAssociateByScores(associate, scores);
        if(ss!=null)
        {
            System.out.println(ss.getId());
            System.out.println(ss.getName());
        }
        else{
            System.out.println("No Associate fount with mention Scores");
        }
        System.out.println(Solution.findAssociateWithMaxExperience(associate));
    }

    public static Associate searchAssociateByScores(Associate associate [] , double scores)
    { 
           for(int i=0;i<associate.length;i++)
           {
              if(associate[i].getScores()==scores)
              {
                return associate[i];
              }
           }
           return null;
    }

    public static int findAssociateWithMaxExperience(Associate associate[])
    {  
        int maxi=0, id=0;
        for(int i=0;i<associate.length;i++)
        {
            if(maxi<=associate[i].getExpericence())
            {
                maxi=associate[i].getExpericence();
                id=associate[i].getId();
            }
        }
        return id;
    }
}
class Associate
{
    private int id;
    private String name;
    private double scores;
    private int experience;
    Associate(int id, String name, double scores, int experience)
    {
        this.id=id;
        this.name=name;
        this.scores=scores;
        this.experience=experience;
    }
    public int getId(){return id;}
    public String getName(){return name;}
    public double getScores(){return scores;}
    public int getExpericence(){return experience;}
}