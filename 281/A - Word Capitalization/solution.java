import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
 
        String a = sc.nextLine();
        a = Character.toUpperCase(a.charAt(0)) + a.substring(1);
 
        System.out.println(a);
    }
}