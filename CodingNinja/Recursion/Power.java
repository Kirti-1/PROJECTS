import java.util.Scanner;

public class Power {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int x = s.nextInt();
		int n = s.nextInt();
		
		System.out.println(Solution.power(x, n));
	}
}
public class Solution {

	public static int power(int x, int n) {
        if(n == 0){
            return 1;
        }
        int sp = power(x, n/2);
        if(n%2 == 0){
            return sp * sp;
        }else{
            return x * sp * sp;
        }	
	}
}