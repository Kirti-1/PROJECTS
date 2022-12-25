import java.io.*;
public class AnyBaseToDecimal{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int ans = bBaseToDecimal(n,b);
        System.out.println(ans);
    }
    private static int bBaseToDecimal(int n, int b){
        int base = 1;
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans += base*rem;
            base*=b;
            n/=10;
        }
        return ans;
    }
}