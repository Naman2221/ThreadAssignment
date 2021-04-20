
package LibraryManagement;



import java.io.*;
import java.util.*;

public class DeleteInformation  extends All implements DeleteItem {
    public void Delete(Map<String,List<String>> Map)
    
    {        
      try{
        System.out.println("Enter Name You Want To Delete:");
        String key=Take();
        if(Map.containsKey(key))
         Map.remove(key);
        else
            System.out.println("No such name is Present");
      }catch(Exception e){}
}
}