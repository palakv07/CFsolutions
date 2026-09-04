import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
 
        int t = 1;
        // t = fs.nextInt();
        while (t-- > 0) {
            int a = fs.nextInt();
            int b = fs.nextInt();
            int c1 = 0;
            int c2 = 0;
            int c3 = 0;
            for(int i=1;i<=6;i++) {
                if(Math.abs(a-i) < Math.abs(b-i)){
                    c1++;
                }
                else if(Math.abs(a-i) > Math.abs(b-i)){
                    c3++;
                }
                else{
                    c2++;
                }
            }
            System.out.print(c1 + " " + c2 + " " + c3);
            
        }
 
        out.flush();
    }
 
    static class FastScanner {
        private final BufferedReader br;
        private StringTokenizer st;
 
        FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }
 
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }
 
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
 
        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}