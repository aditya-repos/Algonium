package com.kepler51.ds.numbers;
import java.io.*;
import java.util.*;
/*
We are writing a tool to help users manage their calendars. Given an unordered list of times of day when someone is busy, write a function that tells us whether they're available during a specified period of time.

Each time is expressed as an integer using 24-hour notation, such as 1200 (12:00), 1530 (15:30), or 800 (8:00).

Sample input:

meetings = [
  [1230, 1300], // 12:30 PM to 1:00 PM
  [845, 900],   //  8:45 AM to 9:00 AM
  [1300, 1500]  //  1:00 PM to 3:00 PM
]

Expected output:

isAvailable(meetings, 915, 1215)   => true
isAvailable(meetings, 900, 1230)   => true
isAvailable(meetings, 850, 1240)   => false
isAvailable(meetings, 1200, 1300)  => false
isAvailable(meetings, 700, 1600)   => false
isAvailable(meetings, 800, 845)    => true
isAvailable(meetings, 1500, 1800)  => true
isAvailable(meetings, 845, 859)    => false
isAvailable(meetings, 846, 900)    => false
isAvailable(meetings, 846, 859)    => false
isAvailable(meetings, 845, 900)    => false
isAvailable(meetings, 2359, 2400)  => true
isAvailable(meetings, 930, 1600)   => false
isAvailable(meetings, 800, 850)    => false
isAvailable(meetings, 1400, 1600)  => false
isAvailable(meetings, 1300, 1501)  => false

n = number of meetings
r = total minutes in range of all meetings

*/

public class Range {

    //if start and end time fall inside meeting range I'll return false
    private static boolean isAvailable(int[][] meetings, int startTime, int endTime){

        //Loop Start
        for(int i = 0; i < meetings.length; i++) {

            int start = meetings[i][0];
            int end = meetings[i][1];


            if(startTime >= start && startTime < end) {
                return false;
            }

            if(endTime > start && endTime <= end) {
                return false;
            }
        }// Loop Ends

        return true;

    }

    public static void main(String[] argv) {

        int[][] meetings = {
                {1230, 1300},
                { 845,  900},
                {1300, 1500},
        };

        System.out.println(isAvailable(meetings, 915, 1215));
        System.out.println(isAvailable(meetings, 900, 1230));
        System.out.println(isAvailable(meetings, 850, 1240));
        System.out.println(isAvailable(meetings, 1200, 1300));
        System.out.println(isAvailable(meetings, 700, 1600));
        System.out.println(isAvailable(meetings, 800, 845));
    }

    //John if you are reading it it worked now.
    // I changed the if condition.

}
