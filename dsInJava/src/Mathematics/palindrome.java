package Mathematics;

import java.util.Scanner;

public class palindrome {
   static int pal(int x){
        int res = 0;
        while(x!=0){
            int rem = x%10;
            res = res*10 + rem;
            x/=10;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n == pal(n)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}
