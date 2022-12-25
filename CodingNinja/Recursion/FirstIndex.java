import java.util.Scanner;

public class FirstIndex {
	
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
		System.out.println(Solution.firstIndex(input, x));
	}
}

public class Solution {
    public static int firstIndex_end(int[] input, int x, int idx) {
        // from End
        if(idx == -1){
            return -1;
        }
        if(input[idx] == x){
            int ans = firstIndex_end(input, x, idx-1);
            if(ans == -1){
                return idx;
            }else{
                return ans;
            }
        }
        return firstIndex_end(input, x, idx-1);
        
    }
	public static int firstIndex_beg(int[] input, int x, int idx) {
        // From Beginning
        if(idx == input.length){
            return -1;
        }
        if(input[idx] == x){
            return idx;
        }
        int ans = firstIndex_beg(input, x, idx+1);
        return ans;
    }
	public static int firstIndex(int input[], int x) {
		// return firstIndex_beg(input, x, 0);
        return firstIndex_end(input, x, input.length-1);
    
	}	
}