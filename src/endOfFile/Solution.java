package endOfFile;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineCounter = 0;

        while(sc.hasNext()) {
            lineCounter++;
            try {
                System.out.printf("%d %s \n", lineCounter, sc.nextLine());
            } catch(NoSuchElementException NSEE) {
                System.err.print(NSEE);
            }
        }
        sc.close();
    }
}
