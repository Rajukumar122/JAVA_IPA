class B
{
	int a;
	void val(int a)
	{
		this.a=a;
	}
	public void armstorng1()
	{
	   int lastval=a;
           int count=0;
           while(lastval>0)
           {
                lastval/=10;
                count++;
           }
           lastval=a;
           int sum=0;
            while(lastval>0)
           {
                int f=1;
                int digit=lastval%10;
                for(int i=0;i<count;i++)
                {
                  f=f*digit;
                }
                sum+=f;
                lastval/=10;
           }
           if(sum==a)
           {
             System.out.println("YES");
           }
           else
           {
              System.out.println("NO");
           }
	}
}
class A
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.val(153);
		obj.armstorng1();
	}
}