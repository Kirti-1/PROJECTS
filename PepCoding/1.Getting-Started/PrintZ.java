/************************** PRINT - Z *************************
Print the Pattern -   Z

*****
   * 
  *  
 *   
*****

*/
public class PrintZ {
    public static void main(String[] args){
        System.out.println("*****");
        System.out.println("   *");
        System.out.println("  *");
        System.out.println(" *");
        System.out.println("*****");
        // Using nested for-loops
        int n = 5;
        int spaces = n-2;
        for(int i=1;i<=n;i++){
                if(i==1 || i==n){
                    for(int j=1;j<=n;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }else{
                    for(int sp=1;sp<=spaces;sp++){
                        System.out.print(" ");
                    } 
                    System.out.println("*");
                    spaces--;
                }
            
        }

    } 
    
}
