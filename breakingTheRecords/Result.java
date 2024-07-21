package breakingTheRecords;

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
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    List<Integer> recordBreak = new ArrayList<>();
    int maxCount = 0;
    int minCount = 0;
    int currentMaxRecord = scores.get(0);
    int currentMinRecord = scores.get(0);
    for(int i = 1;i<scores.size();i++){
     if(scores.get(i) > currentMaxRecord){
         currentMaxRecord = scores.get(i);
         maxCount++;
     } else if(scores.get(i) < currentMinRecord){
         currentMinRecord = scores.get(i);
         minCount++;
     }
    }
    recordBreak.add(0, maxCount);
    recordBreak.add(1, minCount);
    return recordBreak;
    }

}