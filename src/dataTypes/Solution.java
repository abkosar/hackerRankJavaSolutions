package dataTypes;

import java.util.Scanner;
import java.lang.Byte;
import java.lang.Integer;
import java.lang.Short;
import java.lang.Long;
import java.lang.Error;


public class Solution {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in: ");
                String variableType = null;

                if(x >= -128 && x <= 127) {
                    variableType = "* byte";
                } else if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
                    variableType = "* short";
                } else if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
                    variableType = "* int";
                } else if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
                    variableType = "* long";
                }
                System.out.println(variableType);
            } catch(Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
