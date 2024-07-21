package timeConversion;

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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    String currentTime="";
        int hour = 0;

        List<String> timeList = new ArrayList<String>(Arrays.asList(s.split(":")));
        hour = Integer.parseInt(timeList.get(0));
        if (hour == 12  &&timeList.get(2).contains("AM")){
            hour = 0;
        } else if (hour == 12 && timeList.get(2).contains("PM")){
            hour = 12;
        } else if(timeList.get(2).contains("PM")){
            hour += 12;
            hour %= 24;
        }
        String time = Integer.toString(hour);
        switch(hour){
            case 0:
                time ="00";
                break;
            case 1:
                time ="01";
                break;
            case 2:
                time ="02";
                break;
            case 3:
                time ="03";
                break;
            case 4:
                time ="04";
                break;
            case 5:
                time ="05";
                break;
            case 6:
                time ="06";
                break;
            case 7:
                time ="07";
                break;
            case 8:
                time ="08";
                break;
            case 9:
                time ="09";
                break;
        }
        currentTime = String.valueOf(time) + ":" + timeList.get(1) + ":" + timeList.get(2).replace("AM", "").replace("PM", "");
    return currentTime;
    }
}