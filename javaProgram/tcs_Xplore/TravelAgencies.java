import java.util.*;
class Solution
{
    public static void main(String [] args)
    {
         Scanner sc = new Scanner(System.in);
         TravelAgencies [] Travel_Agencies= new TravelAgencies [4];
         for(int i=0;i<4;i++)
         {
             int regNo=sc.nextInt(); sc.nextLine();
             String agencyName=sc.nextLine();
             String packageType=sc.nextLine();
             int price = sc.nextInt(); sc.nextLine();
             boolean flightFacility = sc.nextBoolean();
             Travel_Agencies[i]= new TravelAgencies(regNo,agencyName,packageType,price,flightFacility);
         }  
        //  Solution Sol = new Solution();
        //  Sol.Display(Travel_Agencies);
         int regNo= sc.nextInt(); sc.nextLine();
         String packageType=sc.nextLine();
         System.out.println(Solution.findAgencyWithHighestPackagePrice(Travel_Agencies)); 
         TravelAgencies s= Solution.agencyDetailsForGivenIdAndType(Travel_Agencies, regNo, packageType);
         System.out.println(s.get_agencyName()+":"+s.get_price());
    }
    public static int findAgencyWithHighestPackagePrice(TravelAgencies Travel_Agencies[])
    {
         int maxi=0;
         for(int i=0;i<Travel_Agencies.length;i++)
         {
              maxi=Math.max(Travel_Agencies[i].get_price(),maxi);
            //   System.out.println(Travel_Agencies[i].get_regNo()+" "+Travel_Agencies[i].get_agencyName()+" "+Travel_Agencies[i].get_packageType()+" "+Travel_Agencies[i].get_price()+" "+Travel_Agencies[i].get_flightFacility());
         }
         return maxi;
    }
    public void Display(TravelAgencies Travel_Agencies[])
    {
         for(int i=0;i<Travel_Agencies.length;i++)
         {
              System.out.println(Travel_Agencies[i].get_regNo()+" "+Travel_Agencies[i].get_agencyName()+" "+Travel_Agencies[i].get_packageType()+" "+Travel_Agencies[i].get_price()+" "+Travel_Agencies[i].get_flightFacility());
         }
    }
     public static  TravelAgencies agencyDetailsForGivenIdAndType(TravelAgencies Travel_Agencies[], int regNo, String packageType)
     {
        for(int i=0;i<Travel_Agencies.length;i++)
        {
            if(Travel_Agencies[i].get_flightFacility()==true){
            if((Travel_Agencies[i].get_regNo()==regNo)&&(Travel_Agencies[i].get_packageType().equals(packageType)))
            {
                return Travel_Agencies[i];
            }
            }
        }
        return null;
     }
}
class TravelAgencies
{
    private int regNo;
    private String agencyName;
    private String packageType;
    private int price;
    private boolean flightFacility;
    // int regNo;
    // String agencyName;
    // String packageType;
    // int price;
    // boolean flightFacility;

    TravelAgencies(int regNo, String agencyName, String packageType, int price, boolean flightFacility)
    {
        this.regNo=regNo;
        this.agencyName=agencyName;
        this.packageType=packageType;
        this.price=price;
        this.flightFacility=flightFacility;
    }
    public int get_regNo(){return regNo;}
    public String get_agencyName(){return agencyName;};
    public int get_price(){return price;}
    public String get_packageType(){return packageType;};
    public boolean get_flightFacility(){return flightFacility;}

}