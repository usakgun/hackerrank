/*Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

Given an array s, of n real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, 
meaning that .1 is printed as .1, and 0.1 is printed as 0.1. If two numbers represent numerically equivalent values, 
then they must be listed in the same order as they were received as input).

Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.

Input Format

The first line consists of a single integer n, denoting the number of integer strings.
Each line i of the n subsequent lines contains a real number denoting the value of s.

Output Format

Locked stub code in the editor will print the contents of array  to stdout. You are only responsible for reordering the array's elements. */

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;

public class javaBigDecimal {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
        MathContext mc = new MathContext(100, RoundingMode.FLOOR);
        boolean swap;
        String []k=new String[s.length];
        String temp = null;
        int tempPlace = 0;
        for (int i=0;i<n;i++){
            swap = false;
            temp = s[i];
            for (int j=i+1;j<n;j++){

                String newValue = s[j];

                int compare = new BigDecimal(newValue,mc).compareTo(new BigDecimal(temp,mc));
                if(compare == 1){
                    tempPlace = j;
                    temp = newValue;
                    swap = true;
                }
            }
            if(swap){
                s[tempPlace] = s[i];
                s[i] = temp;
            }
        }

        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}