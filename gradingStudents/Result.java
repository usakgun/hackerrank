package gradingStudents;

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
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    List<Integer> result = new ArrayList<>();
    
    Iterator it = grades.iterator();
    while(it.hasNext()){
        int grade = Integer.parseInt(it.next().toString());
        if (grade >= 38){
            if(grade % 5 == 3){
            grade = grade + 2;
        } else if(grade % 5 == 4){
            grade = grade + 1;
        }
        }
        result.add(grade);
    }
    return result;
    }

}