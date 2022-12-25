/*********************** INVERSE OF A NUMBER **************************
1. You are given a number following certain constraints.
2. The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273 etc.Here are a few invalid numbers - 139, 7421357 etc.
3. The inverse of a number is defined as the number created by interchanging the face value and index of digits of number.e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153    
4. Take as input number "n", assume that the number will follow constraints.
5. Print it's inverse.

Input:
"n" where n is any integer, following constraints defined above.

Output:
"i", the inverted number

Constraints:
1 <= n < 10^8, and follwing other constraints defined above.

Sample Input:
28346751

Sample Output:
73425681

*/
import java.util.Scanner;
public class InverseOfNumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = digitCount(n); 
        for(int i=n;i>0;i/=10){
            int val = i%10;
            if(1<=val && val<=d){
                continue;
            }else{
                System.out.println("Invalid Number");
                return;
            }
        }
        int invNum = inverseNumber(n);
        System.out.println(invNum);
    }
    public static int digitCount(int n){
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public static int inverseNumber(int n){
        int ans = 0;
        int i = 1;
        while(n>0){
            int rem = n%10;
            ans += i*(int)Math.pow(10,rem-1);
            i++;
            n/=10;
        }
        return ans;
    }
}