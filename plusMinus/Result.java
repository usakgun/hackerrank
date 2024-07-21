package plusMinus;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int pos = 0;
        int neg = 0;
        int zero = 0;
        int size = arr.size();
        Iterator it = arr.iterator();
        while(it.hasNext()){
            int value = Integer.parseInt(it.next().toString());
            if(value > 0){
                pos++;
            } else if(value < 0){
                neg++;
            }else{
                zero++;
            }  
        }
        
        System.out.println((double)pos/(double)size);
        System.out.println((double)neg/(double)size);
        System.out.println((double)zero/(double)size);
    }

}