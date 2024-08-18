class A
{
  String name;
  int age;
  String address;
  public A(String name , int age ,String address)
  {
    this.name=name;
    this.age=age;
    this.address=address;
  }
  public void setName(String name)
  {
    this.name=name;
  }
  public void setAge(int age)
  {
    this.age=age;
  }
  public void setAddress(String address)
  {
    this.address=address;
  }
 
  public String getName()
  {
    return name;
  }
  public int getAge()
  {
    return age;
  }
  public String getAddress()
  {
    return address;
  }
  public static void main(String [] args)
  {
    A obj= new A("RAJU",21,"SARNARYAN SARAIYA SARAN BIHAR 841101");
    System.out.println(obj.getName());
    System.out.println(obj.getAge());
    System.out.println(obj.getAddress());
    obj.setName("RANJAN");
    obj.setAge(18);
    System.out.println(obj.getName());
    System.out.println(obj.getAge());
    System.out.println(obj.getAddress());
    obj.setName("SANJIT");
    obj.setAge(16);
    System.out.println(obj.getName());
    System.out.println(obj.getAge());
    System.out.println(obj.getAddress());
  }

}