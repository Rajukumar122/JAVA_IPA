class A 
{
    public static void main(String[]args)
    {
        String s1="RAJU";
        String s2="SNEHA";
        String s3="RAJU";
        String s4=new String("RAJU");
        String s5=new String("RAJU");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s3==s4);
        System.out.println(s5==s4);
    }
}