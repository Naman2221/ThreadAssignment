
package LibraryManagement;
import java.io.*;
import java.util.*;

interface Display
{
  void DisplayAssests(Map<String,List<String>> map);
}

interface DeleteItem
{
  void Delete(Map<String,List<String>> Map);
}

interface Search
{
  void SearchItem(Map<String,List<String>> Map);
}
public class All {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    
  static  Map<String,List<String>> Map=new HashMap<>(); 
   List<String> list;
  
 String Take()
 throws IOException
 {
 String Value;
 Value=br.readLine();
 return Value;
 }
   
  void Information()
  throws IOException        
  {
    list=new ArrayList<>();
    
    System.out.print("Book Name:");  
    list.add("BookName:"+Take());
    System.out.print("Issueing Date:");  
    list.add("Issueing Date:"+Take());
    System.out.print("Assign Date To return:");  
    list.add("Assign Date To return:"+Take());
    System.out.print("Enter Name:");  
    Map.put(Take(),list);
     
  }
    
  void Choice()
          throws IOException
  {
      int n=Integer.parseInt(Take());
    switch(n)
    {
        case 1:Displaying ob=new Displaying();
    ob.DisplayAssests(Map);
    break;
    case 2:DeleteInformation obj=new DeleteInformation();
    obj.Delete(Map);
    break;
    
    case 3: Searching obj1=new Searching();
            obj1.SearchItem(Map);
            break;
    }
  
  }
  public static void main(String args[])
  throws IOException
  {
    All ObjectOfMain=new All();
    int number;
    do{
    ObjectOfMain.Information();
    System.out.print("Enter '1' to add more else enter anyother number:");
     number=Integer.parseInt(ObjectOfMain.Take());
    }while(number == 1);
    
    System.out.println("enter choice\n1.Display\n2.DeleteItem\n3.Search");
    ObjectOfMain.Choice();
    
  }
}
