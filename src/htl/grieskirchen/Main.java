/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package htl.grieskirchen;

/**
 *
 * @author hoegl
 */
public class Main {
    
    
    public static void main(String[] args) {
        NumberTester n = new NumberTester("manuel.txt");
        n.setOddEvenTester(x->{return x%2 ==0;});
        
    }
    
}