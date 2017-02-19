package com.mariashmelyova.app.classworks.expressionsandcontrolstatment;

/**
 * Created by mshm on 16-Feb-17.
 */
public class TriangleCalculation {
    public static boolean isTriangleRightAngled(int a, int b, int c){
        if (a > 0 && b > 0 && c > 0) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                return true;
            }
            else
                return false;
        }
        else
            return false;
    }
}
