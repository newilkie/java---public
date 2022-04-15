package com.company;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // make sure the goal isn't negative or zero
        if(goal <= 0){
            return false;
        }
        // make sure there is enough flour otherwise return false
        if(bigCount * 5 + smallCount >= goal){
          // 5kilo bags cannot be divided if you don't use all of it
            int bigCountUsed = goal / 5;
            int remainder = goal - bigCountUsed * 5;
            return (remainder - smallCount <= 0);
        }
        return false;


    }
}
