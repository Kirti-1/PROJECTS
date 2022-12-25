/***********************  THE CURIOUS CASE OF BENJAMIN BULBS  ***********************
1. You are given n number of bulbs. They are all switched off.
A weird fluctuation in voltage hits the circuit n times. 
In the 1st fluctuation all bulbs are toggled, in the 2nd fluctuation every 2nd bulb is toggled, in the 3rd fluctuation every 3rd bulb is toggled and so on. 
You've to find which bulbs will be switched on after n fluctuations.
2. Take as input a number n, representing the number of bulbs.
3. Print all the bulbs that will be on after the nth fluctuation in voltage.

Input:
n, an integer

Output:
b1 b2 b3 b4 .. all bulbs that will be on after nth wave

Constraints:
2 <= n < 10^9

Sample Input:
6

Sample Output:
1
4

gist of question all the bulbs which are visited odd number of times will be "on" after nth fluctuation - all the perfect squares have odd number of prime 
factors, like prime factors of 36 - 1*36, 2*18, 3*12, 4*9, 6*6 - here 4 pairs but 6 will occurs only once,
thus only 5 prime factors of 36.

*/
import java.util.Scanner;
public class TheCuriousCaseOfBenjaminBulbs{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        onBulbSequence(n);        
    }
    public static void onBulbSequence(int n){
        int i = 1;
        while(i*i<=n){
            System.out.println(i*i);
            i++;
        }
    }
}