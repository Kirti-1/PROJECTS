import java.util.*;
class GetSubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String[] subsequenceArr = getSubsequence(str,0);
        for(int i=0;i<subsequenceArr.length;i++){
            System.out.format(subsequenceArr[i] + " ");
        }
    }
    static int idx = 0;
    public static String[] getSubsequence(String str,int fsf) {
        if(str.length() == 0){
            String[] ba = new String[fsf+1];
            ba[0] = "";
            return ba;

        }
        char ch = str.charAt(0);
        String[] ans = getSubsequence(str.substring(1),fsf);
        for(int i=0;i+idx<ans.length;i++){
            ans[i+idx] = ans[i] + ch + ""; 
            fsf++;
        }
        
        idx = fsf + 1;
        return ans;
    }
}