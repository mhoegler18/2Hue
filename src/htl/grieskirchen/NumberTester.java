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
public class NumberTester {
    
    String fileName;
    NumberTester oddTester;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }
    public void setOddEvenTester(NumberTester oddTester){
     this.oddTester = oddTester;
    }
}
