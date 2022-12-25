import java.util.*;
class Try{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long t = 0;
        while(n>0){
            t = t*10 + 1;
            n--;
        }
        System.out.println(t*t);
    }
}
// only applicable till n=5 fot t as int
// and for t as long if n = 9 output - 12345678987654321