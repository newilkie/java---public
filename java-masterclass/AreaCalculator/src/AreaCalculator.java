public class AreaCalculator {
    public static double area(double radius){
        if(radius < 0){
            return -1;
        }
        return Math.PI * (Math.pow(radius, 2));
    }

    public static double area(double x, double y){
        if(x < 0 || y < 0){
            return -1;
        }
        return x * y;
    }

}
