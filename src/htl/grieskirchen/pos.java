/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package htl.grieskirchen;

import java.util.ArrayList;

/**
 *
 * @author hoegl
 */
public class pos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String>liste = new ArrayList<String>();
        liste.add("memmet");
        
        for (String string : liste) {
            System.out.println(liste);
        }
        liste.forEach((String s)-> System.out.println(s));
        
        
    }
    
}
