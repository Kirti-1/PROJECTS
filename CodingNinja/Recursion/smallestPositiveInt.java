// Smallest Positive Integer missing in an unsorted array.
import java.util.*;
class SmallestPositiveInt{
    public static void main(String[] args){
        // int[] arr = {-2,-1};
        int[] arr = {-2,-1,4,1,3,-1,-2,-1};
        
        System.out.println(productTo1(arr));

    }
    public static int smallestInteger(int []arr) {
        HashMap<Integer, String> map = new HashMap<>();
        // we can take a integer i=0 and xor to all elemenrt and for every element in arr increment i
        // for(int i=0;i< )
        return 0;
    }
    public static int  productTo1(int[] arr){
        // number of operations required to perform in order to make the product of to 1
        // operations allowed - increase by 1 and decrease by 1 on each element and once.
        int neg = 0;
        int n = arr.length;
        int max_neg = -1;

        for(int i=0;i<n;i++){
            // case 1 : Negative number, negative number count 
            if(arr[i]<0){
                neg++; 
                if(arr[i]>max_neg){
                    max_neg = arr[i];
                }
                // minimum negative number possible  - (-1)
            }
        }
        System.out.println(max_neg);
        // assumption - smallest negative number given is (-1)
        int flag = 0;
        int co = 0;
        
        for(int i=0;i<n;i++){
            int option = 1;
            if(arr[i]<0){
                if(neg%2==0){
                    option = -1;
                    // System.out.println("hello");
                }else{
                    option = 0; 
                } 
            }
            switch(option){
                case -1:{ // even neg numbers 
                    co += Math.abs(arr[i]+1);
                    break;
                }
                case 0:{ // odd neg numbers
                    if(arr[i] == max_neg){
                        if(flag == 0){
                            co += 2;
                            flag = 1;
                        }else{
                            co += (Math.abs(arr[i])-1);
                        }
                    }else{
                        co += (Math.abs(arr[i])-1);                      
                    }
                    break;
                }
                case 1:{ // postive numbers
                    co += (arr[i]-1); 
                    break;               
                }
            }
        }
        return co;
    }
}