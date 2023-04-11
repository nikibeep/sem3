import java.util.*;
public class CollectionText
{
    public static void main(String [] args)
    {
        try{
            Collection c=new ArrayList<>();
            c.add(1);
            c.add("Hello");
            Iterator itr = c.iterator();
            while(itr.hasNext())
            {
                System.out.println(itr.next());
            }
        }catch(Exception e)
        {}
    }
}