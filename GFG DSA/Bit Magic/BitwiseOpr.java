class BitwiseOpr {
    
    public static void main(String[] args) { 
        
        /*
        // x&1 - 1 and 0
        // x&0 = 0
        // 1 - odd
        // 0 - even
        // BITWISE AND OPERATOR (&)
        if((2&1) != 0){
            System.out.println("ODD"); // Odd
        }else{
            System.out.println("EVEN"); // Even
        }


        // BITWISE OR OPERATOR (|)
        // x|0 = x 
        // x|1 = (x+1)(x = even) or x(x = odd)
        System.out.println(2132|0); 
        System.out.println(2132|1); // x = even
        System.out.println(2133|1); // x = odd 


        // BITWISE XOR OPERATOR (^)
        // 0^0 = 0
        // 0^1 = 1
        // 1^0 = 1
        // 1^1 = 0
        // x^y = x(~y) + (~x)y
        // x^0 = x
        // x^1 = (x = odd)x-1  (x = even)x+1

        System.out.println(123^0); // 123
        System.out.println(123^1); // 124-1
        System.out.println(124^1); // 124+1
        System.out.println(123^123); // 0
        */


        // BITWISE NOT OPERATOR (~)
        // -x = 2^32-x
        int x = 5;
        System.out.println(~(~x));
        // 2^32-1 = 111111......11 - 32 bits depends upon your compiler 
        // 2^32-1-5 = 2^32-6 = -6


        // LEFT SHIFT OPERATOR (<<)
        



    }
}