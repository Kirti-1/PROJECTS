/************************* DIGIT FREQUENCY ******************
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.

Input:
A number n
A digit d

Output:
A number representing frequency of digit d in number n.

Constraints:
0 <= n <= 10^9
0 <= d <= 9
 */
import java.util.Scanner;
public class DigitFrequency{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int freq = frequencyOfd(n,d);
        System.out.println(freq);
    }
    public static int frequencyOfd(int n, int d){
        int f = 0;
        while(n>0){
            if(n%10==d){
                f++;
            }
            n/=10;
        }
        return f;
    }
}