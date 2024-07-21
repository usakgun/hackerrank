package miniMaxSum;

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
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        long totalSum = 0;
        for(int i=0;i<arr.size();i++){
            totalSum += arr.get(i);
        }
        List<Long> result = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            long tempSum = totalSum;
            tempSum -= arr.get(i);
            result.add(tempSum);
        }
        long max = Collections.max(result);
        long min = Collections.min(result);
        System.out.print(min + " " + max);
    }
}