import java.util.*;
  
public class AnyBaseToAnyBase{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int  destBase= scn.nextInt();
        
        int toGivenBase = DecimalToAnyBase(sourceToDecimal(n, sourceBase), destBase);
        System.out.println(toGivenBase);
    }   
    public static int sourceToDecimal(int n, int sb){
        int ans = 0;
        int base = 1;

        while(n>0){
            int rem = n%10;

            ans += rem*base;
            base *= sb;
            n/=10; 
        }
        return ans;
    }
    public static int DecimalToAnyBase(int n, int db){
        int ans = 0;
        int pow = 1;

        while(n>0){
            int rem = n%db;
        
            ans = ans + rem*pow;
            n/=db;
            pow*=10;
        
        }
        return ans;
    }
}