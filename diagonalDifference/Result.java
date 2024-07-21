package diagonalDifference;

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
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primary=0;
        int secondary =0;
        int index= arr.size()-1;
        for(int v=0;v<arr.size();v++){
        primary+=arr.get(v).get(v);
        secondary+=arr.get(v).get(index-v);
        }
    return Math.abs(primary-secondary);
    }

}