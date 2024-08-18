import java.util.*;
class Solution
{
    public static void main(String [] args)
    {
         Scanner sc= new Scanner(System.in);
         int n =sc.nextInt(); sc.nextLine();
         Cricketer [] cricketer =new Cricketer [n];
         for(int i=0;i<n;i++)
         {
            int cricketerId=sc.nextInt(); sc.nextLine();
            int matchesPlayed=sc.nextInt(); sc.nextLine();
            int totalRuns=sc.nextInt(); sc.nextLine();
            String cricketerName=sc.nextLine();
            String team=sc.nextLine();
            cricketer[i]= new Cricketer(cricketerId,matchesPlayed,totalRuns, cricketerName,team);

         }
         int cricketerId=sc.nextInt(); sc.nextLine();
         System.out.println(Solution.findCricketerWithMinmum(cricketer));
         Cricketer ss=Solution.searchCricketerById(cricketer,cricketerId);
         if(ss!=null)
         {
            System.out.println(ss.getCricketerId());
            System.out.println(ss.getCricketerName());
         }
         else
         {
            System.out.println("No such Cricketer");
         } 
    }

    public static int findCricketerWithMinmum(Cricketer cricketer[])
    {
        int mini=Integer.MAX_VALUE,c=0;
        for(int i=0;i<cricketer.length;i++)
        {
            if(mini>=cricketer[i].getMatchesPlayed())
            {
                mini=cricketer[i].getMatchesPlayed();
                c=cricketer[i].getCricketerId();
            }
        }
        return c;
    }

    public static Cricketer searchCricketerById(Cricketer cricketer[], int cricketerId)
    {
        for(int i=0;i<cricketer.length;i++)
        {
            if(cricketer[i].getCricketerId()==cricketerId)
            {
                return cricketer[i];
            }
        }
        return null;
    }
}
class Hotel
{
    private int hotelId;
    private String hotelName;
    private String cabfacility;
    private int rating;
    private int fees;
    Cricketer(int  hotelId, String hotelName, String cabfacility, int rating, int fees)
    {
        this.hotelId=hotelId;
        this.hotelName=hotelName;
        this.cabfacility=cabfacility;
        this.rating=rating;
        this.fees=fees;
    }
    public int getHotelId(){return hotelIdId;}
    public String getHotelName(){return hotelName;}
    public String getCabfacility(){return cabfacility;}
    public int getRating(){return rating;}
    public int getFees(){return fees;} 

}