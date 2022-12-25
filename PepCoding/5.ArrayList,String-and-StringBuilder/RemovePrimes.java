/******************** REMOVE PRIMES **************
1. You are given an ArrayList of positive integers.
2. You have to remove prime numbers from the given ArrayList and return the updated ArrayList.

Note -> The order of elements should remain same.

Input Format:
A number N
arr1
arr2.. N numbers

Output Format:
An Arraylist

Constraints:
1 <= N <= 10000
*/
import java.io.*;
import java.util.*;
class RemovePrimes{
    private static Boolean isPrime(int n){
        for(int div=2;div*div<=n;div++){
            if(n%div==0){
                return false;
            }
        }
        return true;
    }
    public static void removePrimes(ArrayList<Integer> al){
        for(int i=al.size()-1;i>=0;i--){
            if(isPrime(al.get(i))){
                al.remove(i);
            }
        }

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            al.add(scn.nextInt());
        }
        removePrimes(al);
        // for(int i:al){
        //     System.out.print(i+" ");
        // }
        System.out.println(al);
    }
}