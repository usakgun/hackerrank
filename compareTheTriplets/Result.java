package compareTheTriplets;

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
     * Complete the 'compareTriplets' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result = new ArrayList<>();
        result.add(0, 0);
        result.add(1, 0);
        for(int i=0;i<a.size();i++){
            if(a.get(i) > b.get(i)){
               int temp = result.get(0);
               temp++;
               result.set(0, temp);
            } else if(a.get(i) < b.get(i)){
               int temp = result.get(1);
               temp++;
               result.set(1, temp);
            } else{
                continue;
            }
        }
        return result;
    }
}