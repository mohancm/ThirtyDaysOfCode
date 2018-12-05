import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfTestCase = scanner.nextInt();
        scanner.nextLine();
        String string1 = "", string2 = "";
        for (int i = 0; i < noOfTestCase; i++) {
            String input = scanner.next();
            char[] char1 = input.toCharArray();
            for (int j = 0; j < char1.length; j++) {
                if (j % 2 == 0) {
                    string1 = string1 + char1[j];
                } else {
                    string2 = string2 + char1[j];

                }
            }
            System.out.println(string1 + " " + string2);
            string1 = string2 = "";
        }
        scanner.close();
    }
}
