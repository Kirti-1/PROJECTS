/**************************** ROTATE A NUMBER ********************************
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340 

Input:
"n" where n is any integer.
"K" where k is any integer.

Output:
"r", the rotated number

Constraints:
1 <= n < 10^9
-10^9 < k < 10^9

Sample Input:
562984
2

Sample Output:
845629

*/
import java.util.Scanner;
public class RotateANumber{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int rotValue = rotateNumber(n,k);
        System.out.println(rotValue);
    }
    public static int rotateNumber(int n, int k){
        int digitCount = 0;
        int temp = n;
        for(;temp>0;temp/=10,digitCount++);
        k = k%digitCount;
        if(k<0){
            k = k + digitCount; 
        }
        int pow = (int)Math.pow(10,k);
        int lastK = (int)n%pow;
        int firstK = (int)n/pow;
        n = lastK*(int)Math.pow(10,digitCount-k) + firstK;
        return n; 

    }
}

/**
$ javac RotateANumber
error: Class names, 'RotateANumber', are only accepted if annotation processing is explicitly requested
1 error

$ javac RotateANumber.java
RotateANumber.java:39: error: incompatible types: possible lossy conversion from double to int
        int pow = Math.pow(10,k);
                          ^
1 error
 */