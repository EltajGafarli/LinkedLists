import java.util.Scanner;
import java.util.*;
import java.util.regex.*;


public class Solution {

    private static Scanner sc = new Scanner(System.in);
    public static String pattern = "([0-2]?[0-5]{0,2})[.]([0-2]?[0-5]{0,2})[.]([0-2]?[0-5]{0,2})[.]([0-2]?[0-5]{0,2})";

    public static void main(String[] args) {
        while(sc.hasNext()){
            String ip = sc.next();
//            System.out.println(ip.matches(pattern));

            System.out.println(ip + "  " + ip.matches(pattern));
        }

    }
}

//http://www.wikipedia.com.http://www.hackerrank.com
