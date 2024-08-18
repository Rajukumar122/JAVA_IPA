//ArrayList :-

/*import java.util.ArrayList;
import java.util.Iterator;
class Collection
{
  public static void main(String [] args)
  {
    ArrayList<String> list1=new ArrayList<String>();
    list1.add("RAJU");
    list1.add("RANJAN");
    list1.add("SANJIT");
    list1.add("GURIYA");
    list1.add("HARIBANSH SAH");
    list1.add("KANTI DEVI");
    list1.add("DEEPAK"); 
    list1.add("RAHUL");
    System.out.println(list1);// all element are print with square bracket [].
    for(String x:list1)// for each element
    {
       System.out.println("WELCOME  "+x);
    }
    list1.remove("RAHUL");// by element 
    list1.remove(6);//BY index number
    System.out.println(list1);

    //iterator
    Iterator<String> iterator = list1.iterator();
    while(iterator.hasNext())
    {
      //Object object=iterator.next();
      //System.out.print(object+" ");
      System.out.print(iterator.next()+" ");
    }
  }
}*/


//List as ArrayList or LinkedList:-

/*import java.util.*;
class Collection
{
  public static void main(String [] args)
  {
    List<String> list1=new ArrayList<String>();
    list1.add("RAJU");
    list1.add("RANJAN");
    list1.add("SANJIT");
    list1.add("GURIYA");
    list1.add("HARIBANSH SAH");
    list1.add("KANTI DEVI");
    list1.add("DEEPAK"); 
    list1.add("RAHUL");
    System.out.println(list1);// all element are print with square bracket [].
    for(String x:list1)// for each element
    {
       System.out.println("WELCOME  "+x);
    }
    list1.remove("RAHUL");// by element 
    list1.remove(6);//BY index number
    System.out.println(list1);

    //iterator
    ListIterator<String> iterator = list1.listIterator();
    while(iterator.hasNext())
    {
      //Object object=iterator.next();
      //System.out.print(object+" ");
      System.out.print(iterator.next()+" ");
    }
    
    //REVERSE
    
    System.out.println();
    System.out.println("REVERSE");
    
    //ListIterator<String> iterator1 = list1.listIterator();
   // when iterator is at end then below loop iterator
    while(iterator.hasPrevious())
    {
      //Object object=iterator.previous();
      //System.out.print(object+" ");
      System.out.print(iterator.previous()+" ");
    }
  }
}*/


//Vector :-


/*import java.io.*;
import java.util.*;
class Collection
{
  public static void main(String [] args)
  {
    Vector<String> list1=new Vector<String>();
    list1.add("RAJU");
    list1.add("RANJAN");
    list1.add("SANJIT");
    list1.add("GURIYA");
    list1.add("HARIBANSH SAH");
    list1.add("KANTI DEVI");
    list1.add("DEEPAK"); 
    list1.add("RAHUL");
    System.out.println(list1);// all element are print with square bracket [].
    for(String x:list1)// for each element
    {
       System.out.println("WELCOME  "+x);
    }
    list1.remove("RAHUL");// by element 
    list1.remove(6);//BY index number
    System.out.println(list1);

    //iterator
    ListIterator<String> iterator = list1.listIterator();
    while(iterator.hasNext())
    {
      //Object object=iterator.next();
      //System.out.print(object+" ");
      System.out.print(iterator.next()+" ");
    }
    
    //REVERSE
    
    System.out.println();
    System.out.println("REVERSE");
    
    //ListIterator<String> iterator1 = list1.listIterator();
   // when iterator is at end then below loop iterator
    while(iterator.hasPrevious())
    {
      //Object object=iterator.previous();
      //System.out.print(object+" ");
      System.out.print(iterator.previous()+" ");
    }
   System.out.println();
   System.out.println();
   System.out.println();
   System.out.println("END=======BYYYY......");

  }
}*/



//PriorityQueue


/*import java.util.PriorityQueue;
import java.util.*;
class Collection 
{
 public static void main(String[]args)
 {
    PriorityQueue<Integer> pq= new PriorityQueue<Integer>();
    pq.add(10);
    pq.add(20);
    pq.add(50);
    pq.add(30);
    System.out.println(pq);
    System.out.println(pq.peek());// its only return first value or top value
    System.out.println(pq.poll());//its return and  remove the element
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    //for(int i=0;i<4;i++)
    //{
    // System.out.print(pq.poll() +" ");
    //}
    Iterator it = pq.iterator();
    while(it.hasNext())
    {
     System.out.print(it.next()+" ");
    }
    System.out.println();
    Iterator it1 = pq.iterator();
    while(it1.hasNext())
    {
     System.out.print(pq.poll()+" ");
       //it1.next();
    }
    
 }
}*/


//SET :- its store unique element.


// HashSet:-


/*import java.util.*;
import java.util.Iterator;
class Collection 
{
 public static void main(String[]args)
 {
    HashSet<Integer> hs= new HashSet<Integer>();
    hs.add(10);
    hs.add(20);
    hs.add(50);
    hs.add(20);
    hs.add(1);
    hs.add(2);
    hs.add(50);
    hs.add(20);
    hs.add(1);
    hs.add(2);
    hs.add(50);
    hs.add(20);
   // System.out.println(hs);
     
    
    Iterator<Integer> it = hs.iterator();
    while(it.hasNext())
    {
     // System.out.print((Integer)it.next()+" ");
     System.out.print( it.next()+" ");
    }
    System.out.println();
 }
}*/


//TreeSet




import java.util.*;
import java.util.Iterator;
class Collection 
{
 public static void main(String[]args)
 {
    Set<String> ts= new TreeSet<String>();
    ts.add("RAJU");
    ts.add("RANJAN");
    ts.add("SANJIT");
    ts.add("GURIYA");
    ts.add("RAJU");
    ts.add("RANJAN");
    ts.add("SANJIT");
    ts.add("GURIYA");
    System.out.println(ts);
     
    
    Iterator<String> it= ts.iterator();
    while(it.hasNext())
    {
     //System.out.print((String)it.next()+" ");
     System.out.print( it.next()+" ");
    }
    System.out.println();
 }
}



 
