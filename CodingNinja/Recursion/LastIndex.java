import java.util.Scanner;

public class LastIndex {
	
	static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(Solution.lastIndex(input, x));
	}
}

public class Solution {
	public static int lastIndex_beg(int[] input, int x, int idx) {
        if(idx == input.length){
            return -1;
        }
        if(input[idx] == x){
            int ans = lastIndex_beg(input, x, idx+1);
            if(ans == -1){
                return idx;
            }else{
                return ans;
            }
        }return lastIndex_beg(input, x, idx+1);
    }
    public static int lastIndex_end(int[] input, int x, int idx) {
        if(idx == -1){
            return -1;
        }
        if(input[idx] == x){
            return idx;
        }
        int ans = lastIndex_end(input, x, idx-1);
        return ans;
    }
    
	public static int lastIndex(int input[], int x) {
		return lastIndex_beg(input, x, 0);
        // return lastIndex_end(input, x, input.length-1);
               
	}
	
}