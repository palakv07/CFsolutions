import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        String a = sc.nextLine();
 
        int upper = 0;
        int lower = 0;
 
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z') {
                upper++;
            }
            else {
                lower++;
            }
        }
 
        if (upper > lower) {
            System.out.println(a.toUpperCase());
        }
        else {
            System.out.println(a.toLowerCase());
        }
    }
}