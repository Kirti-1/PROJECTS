import java.util.*;
import java.io.*;
class GetMazePathWithJumps{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        ArrayList<String> ans = getMazePathWithJumps(0, 0, n-1, m-1);
        System.out.println(ans);
    }
    public static ArrayList<String> getMazePathWithJumps(int sr, int sc, int dr, int dc){
        if(sr == dr && sc == dc){
            ArrayList<String> ba = new ArrayList<>();
            ba.add("");
            return ba;
        }
        ArrayList<String> hntod = new ArrayList<>();
        ArrayList<String> vntod = new ArrayList<>();
        ArrayList<String> dntod = new ArrayList<>();
        ArrayList<String> stod = new ArrayList<>();
        for(int i=1;i<=dc-sc;i++){
            hntod = getMazePathWithJumps(sr,sc+i,dr,dc);
            for(int j=0;j<hntod.size();j++){
                stod.add("h"+i+hntod.get(j));
            }
        }
        for(int i=1;i<=dr-sr;i++){
            vntod = getMazePathWithJumps(sr+i,sc,dr,dc);
            for(int j=0;j<vntod.size();j++){
                stod.add("v"+i+vntod.get(j));
            }
        }
        for(int i=1;sr+i<=dc && sc+i<=dr;i++){
            dntod = getMazePathWithJumps(sr+i,sc+i,dr,dc);
            for(int j=0;j<dntod.size();j++){
                stod.add("d"+i+dntod.get(j));
            }
        }
        return stod;
    }
}