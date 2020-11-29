package Mathematics;

import java.util.Scanner;

public class countDigits {
    static int hello(int x){
       int res = 0;
       while (x>0){
           x = x/10;
           res++;
       }
       return res;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(hello(s.nextInt()));
    }
}
