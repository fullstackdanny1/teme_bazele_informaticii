import java.util.*;
public class Liste
{
   public static void main(String[] args)
   {
      /*
      ArrayList<String> names = new ArrayList<String>(); 
      names.add("Ionut");
      names.add("Razvan");   
      names.add("Gheorghe"); 
     
      Collections.sort(names);
       
      for(String name : names)
      {
         System.out.println(name);
      }

       System.out.println(names.size());
       System.out.println(names.get(2));
      */ 
      
      LinkedList<String> names = new LinkedList<String>();

      names.add("John");
      names.add("Jane");
      names.add("Doe");
      names.addFirst("First");
      names.addLast("Last");

      names.remove("John");

      for(String name : names){
         System.out.println(name);
      }
      
   }

}
