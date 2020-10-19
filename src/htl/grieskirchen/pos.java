/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package htl.grieskirchen;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hoegl
 */
public class pos {

    /**
     * @param args the command line arguments
     */
    String name;

    public pos(String name) {
        this.name = name;
    }
    
    static ArrayList<String> liste = new ArrayList<>();
    public static void ausgeben(){
        liste.add("HalloJavamitForEach");
        liste.forEach(System.out::println);
        
    }
    public static void main(String[] args) {
        ausgeben();
        printTable();
    }
    public static void printTable(){
      Printable rC = (List<String>lis) -> {
         
          for (int i = 0; i < liste.size(); i++) {
             
              System.out.println(liste.toString());
          }
          
      };
      rC.print(liste);
      
  }
           
}
