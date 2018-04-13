package endOfFile;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int line_counter = 0;
        
        while(sc.hasNext() == true){
            line_counter += 1;
            System.out.printf("%d %s \n", line_counter, sc.nextLine());
        }
    }
}