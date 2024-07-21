package staircase;

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
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
    for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j<n-1) System.out.print(' ');
                else System.out.print('#');
            }
            System.out.print("\n");
        }
    }

}