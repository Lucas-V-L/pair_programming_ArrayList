import java.util.ArrayList;

public class ArrayListRunner
{
   public static void main(String[] args)
   {
       ArrayList<String> names = new ArrayList<String>();
       String[] strs = {"Alice", "Bob", "Connie", "David", "Edward", "Fran", "Gomez", "Harry"};
       for(String i : strs) {
           names.add(i);
       }
       System.out.println(names);
   }
} 

