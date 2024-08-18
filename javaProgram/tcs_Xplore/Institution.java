import java.util.*;
class Solution 
{
    public static void main(String [] arg)
    {
        Institution [] institution = new Institution [4];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<4;i++)
        {
            int institutionId=sc.nextInt(); sc.nextLine();
            String institutionName=sc.nextLine();
            int noOfStudentsPlaced=sc.nextInt(); sc.nextLine();
            int noOfStudentsCleared=sc.nextInt(); sc.nextLine();
            String location=sc.nextLine();
            institution[i]= new Institution(institutionId,institutionName,noOfStudentsPlaced,noOfStudentsCleared,location);
        }
        String location=sc.nextLine();
        String name=sc.nextLine();
        int b=Solution.findNumClearancedByLoc(institution,location);
        if(b>0)
        {
           System.out.println(b);
        }
        else{
            System.out.println("There are no cleared students in this particular location");
        }
        Institution a=Solution.updateInstitutionGrade(institution,name);
        if(a!=null)
        {
            System.out.println(a.getInstitutionName()+"::"+a.getGrade());
        }
        else{
            System.out.println("No Institution is available with specified name");
        }
    }
    public static int findNumClearancedByLoc(Institution institution [] ,String  location)
    {
        int sum=0;
        for(int i=0;i<institution.length;i++)
        {
            if(institution[i].getlocation().equals(location))
            {
                sum=sum+institution[i].getNoOfStudentsCleared();
            }
        }
        return sum;
    }
    public static Institution updateInstitutionGrade(Institution institution [], String institutionName)
    {
        for(int i=0;i<institution.length;i++)
        {
            if(institution[i].getInstitutionName().equals(institutionName))
            {
                int rating= (institution[i].getNoOfStudentsPlaced()*100)/institution[i].getNoOfStudentsCleared();
                if(rating>=80){
                    institution[i].setGrade("A");
                }
                else
                {
                    institution[i].setGrade("B");
                }
                return institution[i];
            }
        }
        return null;
    }
}
class Institution
{
    private int institutionId;
    private String institutionName;
    private int noOfStudentsPlaced;
    private int noOfStudentsCleared;
    private String location;
    private String grade;
    Institution(int institutionId, String institutionName, int noOfStudentsPlaced, int noOfStudentsCleared, String location)
    {
        this.institutionId=institutionId;
        this.institutionName=institutionName;
        this.noOfStudentsPlaced=noOfStudentsPlaced;
        this.noOfStudentsCleared=noOfStudentsCleared;
        this.location=location;
    }
    public int getInstitutionId(){return institutionId;}
    public String getInstitutionName(){return institutionName;}
    public int getNoOfStudentsPlaced(){return noOfStudentsPlaced;}
    public int getNoOfStudentsCleared(){return noOfStudentsCleared;}
    public String getlocation(){ return location;}
    public String getGrade(){return grade;}
    
    public void setGrade(String grade)
    {
        this.grade=grade;
    }
    public void setInstitutionId(int institutionId)
    {
        this.institutionId=institutionId;
    }
    public void setInstitutionName(String institutionName)
    {
        this.institutionName=institutionName;
    }
    public void setlocation(String location)
    {
        this.location=location;
    }
    public void setNoOfStudentsPlaced(int noOfStudentsPlaced)
    {
        this.noOfStudentsPlaced=noOfStudentsPlaced;
    }
    public void setNoOfStudentsCleared(int noOfStudentsCleared)
    {
        this.noOfStudentsCleared=noOfStudentsCleared;
    }
}