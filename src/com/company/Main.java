package com.company;

import java.time.LocalTime;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LocalTime startTime = LocalTime.of(2,30,45);
        LocalTime endTime = LocalTime.of(3,43,50);
        stopWatch stopWatch = new stopWatch(startTime,endTime);
        System.out.println(stopWatch.getElapsedTime());
        stopWatch  time = new stopWatch();
        time.resetTime();
        int[] arr = {1,2,3,4,5,6,7,8,7,8,9,9};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            int min = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        time.endTime();
        System.out.println("thời gian thực hiện thuật toán trên là"+time.getElapsedTime());


	// write your code here
    }

    public static class stopWatch{
        private LocalTime startTime,endTime;
        public stopWatch(){
            startTime = LocalTime.now();
        }
        public stopWatch(LocalTime startTime,LocalTime endTime){
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public LocalTime getStartTime() {
            return startTime;
        }

        public LocalTime getEndTime() {
            return endTime;
        }
        public  LocalTime resetTime(){
           return startTime = LocalTime.now();
        }
        public LocalTime endTime(){
            return endTime = LocalTime.now();
        }
        public int getElapsedTime(){
            int miliSecond = ((endTime.getHour()-startTime.getHour())*3600 + (endTime.getMinute()-startTime.getMinute())*60 + (endTime.getSecond()-startTime.getSecond())*1000);
            return miliSecond;
        }
    }
}
