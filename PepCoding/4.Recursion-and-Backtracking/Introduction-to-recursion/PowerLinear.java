import java.util.*;
class PowerLinear{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int pow = power(x,n);
        System.out.println(pow);
    }
    public static int power(int x,int n){
        if(n==0){ // x^0 = 1
            return 1;
        }
        int pow = power(x,n-1);
        pow = x * pow;
        return pow;
    }

}