import java.util.*;
class Solution
{
     public static void main(String [] args)
    {
            Scanner sc = new Scanner(System.in);
            Phone [] phone = new Phone[4];
            for(int i=0;i<4;i++)
            {
                int phoneId=sc.nextInt(); sc.nextLine();
                String os = sc.nextLine();
                String brand= sc.nextLine();
                int price= sc.nextInt();  sc.nextLine();
                phone[i] = new Phone(phoneId,os,brand,price);
            }
            String brand, os;
            brand=sc.nextLine();  
            os=sc.nextLine();  
            // Solution Sol = new Solution();
            int a=Solution.findPriceForGivenBrand(phone,brand);
            if(a>0)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println("The given Brand is not available");
            }
            Phone b=Solution.getPhoneIdBasedOnOs(phone,os);
            if(b!=null)
            {
                System.out.println(b.get_phoneId());
            }
            else{
                 System.out.println("No phone are available with specification os and price range");
            }

     }
    public static int findPriceForGivenBrand(Phone phone[], String brand)
    {
         int sum=0;
         for(int i=0;i<phone.length;i++)
         {
            if(phone[i].get_brand().equals(brand))
            {
                sum=sum+phone[i].get_price();
            }
         }
         return sum;
    }
    public static Phone getPhoneIdBasedOnOs(Phone phone[], String os)
    {
        for(int i=0;i<phone.length;i++)
        {
            if(phone[i].get_price()>=50000)
            {
                if(phone[i].get_os().equals(os))
                {
                    return phone[i];
                }
            }
        }
        return null;
    }
}

class Phone
{
    private int phoneId;
    private String os;
    private String brand;
    private int price;
    Phone(int phoneId, String os, String brand, int price)
    {
        this.phoneId=phoneId;
        this.os=os;
        this.brand=brand;
        this.price=price;
    }
    public int get_phoneId(){return phoneId;}
    public String get_os(){return os;}
    public String get_brand(){return brand;}
    public int get_price(){return price;}
}