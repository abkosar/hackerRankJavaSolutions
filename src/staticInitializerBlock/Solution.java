package staticInitializerBlock;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution {
    static boolean flag = true;
    static int b, h;

    static {
        Scanner sc = new Scanner(System.in);
        try {
            b = sc.nextInt();
            sc.nextLine();
            h = sc.nextInt();
        } catch(NoSuchElementException NSEE) {
            System.err.print(NSEE);
        }
        sc.close();

        if((b > 0) && (h > 0)) {
            flag = true;
        } else if((b <= 0) || (h <= 0)) {
            flag = false;
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if(flag) System.out.print(b * h);
    }
}