import java.util.*;
import java.io.*;
class GetMazePaths{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<String> ans = getMazePaths(0, 0, n-1, m-1);
        System.out.println(ans);
    }
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> ba = new ArrayList<>();
            ba.add("");
            return ba;
        }
        // OR
        // Negative Base Cases
        // if(sr>dr || sc>dc){
        //     return new ArrayList<String>();
        // }
        ArrayList<String> hntod = new ArrayList<>();
        ArrayList<String> vntod = new ArrayList<>();
        
        if(sc<dc){
            hntod = getMazePaths(sr, sc + 1, dr, dc);
        }
        if(sr<dr){
            vntod = getMazePaths(sr + 1, sc, dr, dc);
        }

        ArrayList<String> stod = new ArrayList<>();
        for(int i=0;i<hntod.size();i++){
            stod.add('h' + hntod.get(i));
        }
        for(int i=0;i<vntod.size();i++){
            stod.add('v' + vntod.get(i));
        }
        return stod;
    }
}