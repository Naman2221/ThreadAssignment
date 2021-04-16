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