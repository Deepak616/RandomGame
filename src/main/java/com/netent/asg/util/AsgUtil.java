package com.netent.asg.util;

import java.util.Random;

public class AsgUtil {

    public static int generateRandomNumbersBetween(int start,int end){
        Random r = new Random();
        int result = r.nextInt(end-start) + start;
        return result;
    }
}
