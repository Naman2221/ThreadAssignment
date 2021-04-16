/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement;

import java.util.*;
import java.io.*;

 class Displaying implements Display {
    
     
     public void DisplayAssests(Map<String,List<String>> map)
    {
       
       for(Map.Entry<String,List<String>> Map : map.entrySet())
       {
         System.out.println("Name:"+Map.getKey());
         System.out.println("Other Information"+Map.getValue());    
       }
       
       
    
    }

    
    
    

    
}
