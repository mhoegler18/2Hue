/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package htl.grieskirchen;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author hoegl
 */
public class Main {
    
    
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("geben sie Nummer ein");
//        int scan = sc.nextInt();
        
        NumberTester n = new NumberTester("File.txt");
        n.setOddEvenTester(a ->{
            boolean tmp = false;
            if(a%2==0){
                System.out.println("even");
                return true;
            }
            else{
                System.out.println("odd");
                return false;
            }
            
            
        });
        n.setPrimeTester(a ->{
            
           int factors = 0;
            for (int i = 1; i <=a; i++) {
                if(a%i==0){
                factors++;

                }
            }
            
                if(factors==2){
                    System.out.println("isPrime");
                    return true;
                }else{
                    System.out.println("noPrime");
                    return false;
                }
            
     
    
    
            
            
        });
         n.setPalindromeTester(a ->{
            
           if(a<0){
           System.out.println(a + " ist kein palindrom");
       }
        int rükwärts=0;
        
        while(a<rükwärts||a%10==0){
            int pop = a%10;
            a/=10;
            rükwärts= (rükwärts*10)+pop;
        }
       if(a==rükwärts){
           System.out.println(a + " ist palindrom");
           return true;
       }else {
           System.out.println(a + " kein palindrom");
           return false;
           
       }
    
            
     
    
    
            
            
        });
        
        
        
       
        n.testFile();
        
        
        
    }
    
    
}
