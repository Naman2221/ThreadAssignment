/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement;

/**
 *
 * @author naman.khanna
 */
import java.io.*;
import java.util.*;
public class Searching  extends All  implements Search{
    public void SearchItem(Map<String,List<String>> Map)
    {
      try{
          System.out.println("enter key:");
       String Value=Take();
       if(Map.containsKey(Value)) 
        System.out.println(Map.get(Value));
       else
           System.out.println("Element Not present In List");
      }catch(Exception e){}  
      
    }
}
