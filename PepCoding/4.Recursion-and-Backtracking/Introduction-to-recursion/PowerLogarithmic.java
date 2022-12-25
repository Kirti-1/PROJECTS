import java.util.*;
class PowerLogarithmic{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int powL = powerLogarithmic(x,n);
        System.out.println(powL);
    }
    public static int powerLogarithmic(int x, int n){
        if(n==0){
            return 1;
        }
        int pow = 1;
        if(n%2==0){
            pow = powerLogarithmic(x,n/2);
            pow *= pow;
        }else{
            pow = powerLogarithmic(x,n/2);
            pow *= (pow * x);
        }
        return pow;
    }
}