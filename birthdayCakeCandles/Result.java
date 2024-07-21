package birthdayCakeCandles;

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
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    Iterator it = candles.iterator();
    int numoftallest = 0;
    int currentTall = candles.get(0);
    while(it.hasNext()){
        if(Integer.parseInt(it.next().toString()) > currentTall){
            currentTall = Integer.parseInt(it.next().toString());
        }
    }
    Iterator nt = candles.iterator();
    while(nt.hasNext()){
        if(Integer.parseInt(nt.next().toString()) == currentTall){
            numoftallest++;
        }
    }
    return numoftallest;
    }

}