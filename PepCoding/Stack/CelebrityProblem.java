import java.io.*;
import java.util.*;

public class CelebrityProblem {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }
    // TWO POINTER - TC - O(N) SC - O(1)
    public static void findCelebrity(int [][]arr) {
        // two pointer approach
        int i=0,j=arr.length-1;
        for(;i!=j;){
            if(arr[i][j] == 0){
                j--;
            }else{
                i++;
            }
        }
        int pc = i;

        // check potential candidate's row
        boolean flag = true;
        for(int k=0;k<arr.length;k++){
            // does i knows kth person or not
            if(pc!=k && arr[pc][k]!=0){
                flag = false;
                break;
            }
        }
        // check column and check whether other knows kth person or not
        for(int k=0;k<arr[0].length;k++){
            if(pc!=k && arr[k][pc]!=1){
                // kth person doesn't know the potential celebrity candidate 
                flag = false;
            }
        }
        if(flag == true){
            System.out.println(pc);
        }else{
            System.out.println("none");
        }
    }
    // USING STACK - TC - O(N) SC - O(N)
    /*public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"
        // Using Stack
        Stack<Integer> potentialCandidate = new Stack<>();
        for(int i=0;i<arr.length;i++){
            potentialCandidate.push(i);
        }
        // checking 
        while(potentialCandidate.size()!=1){
            int i = potentialCandidate.pop();
            int j = potentialCandidate.pop();
            if(arr[i][j] == 0){
                // i don't know j, eliminate j and push back i to the stack
                potentialCandidate.push(i);
            }else{
                // i knows j, i can't be a celebrity, eliminate i
                potentialCandidate.push(j);
            }
        }
        
        int pc = potentialCandidate.pop();

        // check potential candidate's row
        boolean flag = true;
        for(int k=0;k<arr.length;k++){
            // does i knows kth person or not
            if(pc!=k && arr[pc][k]!=0){
                flag = false;
                break;
            }
        }
        // check column and check whether other knows kth person or not
        for(int k=0;k<arr[0].length;k++){
            if(pc!=k && arr[k][pc]!=1){
                // kth person doesn't know the potential celebrity candidate 
                flag = false;
            }
        }
        if(flag == true){
            System.out.println(pc);
        }else{
            System.out.println("none");
        }

        
    
    }*/

}