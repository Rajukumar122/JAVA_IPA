import java.util.HashMap;
import java.util.*;
class MapCollection
{
  public static void main(String [] args)
  {
      HashMap<Integer,String> m= new HashMap<Integer, String>();
       //HashMap m= new HashMap();
       
        m.put(101,"RAJU");
        m.put(102,"RANJAN");
        m.put(103,"SANJIT");
        m.put(104,"GURIYA");
        m.put(105,"RAJU");
        m.put(106,"RAJ");
        m.put(101,"RAM");
        m.put(106,"RAJ");
        System.out.println(m);//{101=RAM, 102=RANJAN, 103=RAJU, 104=GURIYA, 105=RAJU, 106=RAJ}
        System.out.println(m.get(103));//RAJU
        System.out.println(m.remove(106));//remove a pair from Hashmap
        System.out.println(m);
        System.out.println(m.containsKey(102));//TRUE
        System.out.println(m.containsKey(106));//FalSE
        System.out.println(m.containsValue("RAJU"));//TRUE
        System.out.println(m.containsValue("RAJ"));//FalSE
        System.out.println(m.isEmpty());//False
        System.out.println(m.keySet());// return all the key set or its unique
        System.out.println(m.values());// return all the value of collection or its allow dublicate
        System.out.println(m.entrySet());//return all the entry set[101=RAM,102=RANJAN,103=SANJIT,104=GURIYA,105=RAJU]

        for(int i:m.keySet()) // if not declear the variable type at initial of hashmap then its object. for(Object i:keySet())
        {
          System.out.println(i);  //101 102 103 104 105  
        }

        for(String i:m.values())
        {
          System.out.println(i); //RAM RANJAN SANJIT GURIYA RAJU
        }

        for(Integer i:m.keySet())
        {
          System.out.println(i+"    "+m.get(i));
        }

        System.out.println("Entry interFace ");
        for(Map.Entry<Integer,String> entry : m.entrySet())
        {
          System.out.println(entry.getKey()+"    "+entry.getValue());
        }

        System.out.println("Iterator Method ");
        // using set dataStructure
        Set s=m.entrySet();
        Iterator it=s.iterator();
        while(it.hasNext())
        {
          System.out.println(it.next());
        }
     
        // using set to inter cast Entry Interface
        System.out.println("Iterator Method using set to inter cast Entry Interface");
        Iterator it1=s.iterator();
        while(it1.hasNext())
        {
          Map.Entry entry1= (Map.Entry)it1.next();
          System.out.println(entry1.getKey()+"      "+entry1.getValue());
        }
 
  }
}