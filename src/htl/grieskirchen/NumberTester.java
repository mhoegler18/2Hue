/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htl.grieskirchen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hoegl
 */
public class NumberTester {

    String fileName;
    NumberTest oddTester;
    NumberTest primeTester;
    NumberTest palindromeTester;

    public NumberTester(String fileName) {
        this.fileName = fileName;
    }

    public void setOddEvenTester(NumberTest oddTester) {
        this.oddTester = oddTester;

    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }

    public void testFile() throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader br = null;
        String line = "";
        String cvsSplit = " ";
        try {
            br = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            line = br.readLine();
            list.add(line);
            while ((line = br.readLine()) != null) {
                if (line != "" && line != null) {
                    line = br.readLine();
                    list.add(line);
                }

            }

        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("gibn anz der fälle ein");
        int anz = sc.nextInt();

        for (int i = 0; i < anz; i++) {
            String tmp = sc.nextLine();
            String[] arr = tmp.split(cvsSplit);
            if(arr.length>1){
            int spalte1 = Integer.parseInt(arr[0]);
            int spalte2 = Integer.parseInt(arr[1]);
            if (spalte1 < 4 && spalte1!= 0) {
                switch(spalte1){
                    case 1:
                        oddTester.testNumber(spalte2);
                        break;
                    case 2:
                        primeTester.testNumber(spalte2);
                        break;
                        
                    case 3:
                        palindromeTester.testNumber(spalte2);
                        break;
                }
            }

        }
        }
        br.close();
    }

}
