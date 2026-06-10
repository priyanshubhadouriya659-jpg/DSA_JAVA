import java.io.*;
import java.util.*;

public class bitwise_balancing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long b = Long.parseLong(st.nextToken());
            long c = Long.parseLong(st.nextToken());
            long d = Long.parseLong(st.nextToken());

            long a = (d | b) - (d & c);

            if (((a | b) - (a & c)) == d) {
                sb.append(a).append("\n");
            } else {
                sb.append("-1\n");
            }
        }
        System.out.print(sb);
    }
}