package com.company;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }else{
            return (int)(((width * height) / areaPerBucket)- extraBuckets) + 1 ;
        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }else{
            return (int)(width * height / areaPerBucket) + 1;
        }
    }
    public static int getBucketCount(double area,double areaPerBucket){
        if(area <= 0 ||areaPerBucket <= 0){
            return -1;
        }else{
            return (int)(area / areaPerBucket) + 1;
        }
    }
}
