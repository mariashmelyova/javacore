package com.mariashmelyova.runners.homeworks;

import com.sun.media.sound.SoftTuning;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by mshm on 28-Mar-17.
 */
public class LoopArrayHomeWork {
//
public static void main(String[] args) {
//a. print even numbers array
    int a = 1;
    System.out.println(a++ + a + a++ + a);

    int [] evenNumArr = new int[10];
    for(int i = 0; i <evenNumArr.length; i++){
        evenNumArr[i] = (i + 1) * 2;

    }

    System.out.print("Even numbers array: ");
    for(int i : evenNumArr){
        System.out.print(i + " ");
    }
    System.out.println();

    for(int i : evenNumArr){
        System.out.print(i + "\n");

    }

    System.out.println();

//   b. print odd number array
    int [] oddNumberArr = new int[50];
    for(int i = 0; i < oddNumberArr.length; i++){
        oddNumberArr[i] = (i + 1) * 2 - 1;

    }
    System.out.print("Odd numbers array:         ");

    for (int i : oddNumberArr){
        System.out.print(i + " ");
    }

    System.out.println();

    System.out.print("Odd numbers array revers: ");
    for (int i = oddNumberArr.length - 1; i >=0; i--){
        System.out.print(oddNumberArr[i] + " ");
    }
    System.out.println();

//  c. create array with 15 random numbers
    int [] randomNumbersArray = new int [15];
    System.out.print("Random numbers array: ");

    for(int i=0 ; i < randomNumbersArray.length; i++){
        randomNumbersArray[i] = (int) (Math.random() * 9);
        System.out.print(randomNumbersArray[i] + " ");
    }
    System.out.println();

    System.out.print("Even count: ");

    int count = 0;
    for(int i : randomNumbersArray) {
        if (randomNumbersArray[i] % 2 == 0) {
            count++;
        }
    }
    System.out.println(count);

//  d.  array with random int [0:99] print max and min
    int [] randomNumbersBigArray = new int [15];

    for(int i=0 ; i < randomNumbersBigArray.length; i++){
        randomNumbersBigArray[i] = (int) (Math.random() * 99);
        System.out.print(randomNumbersBigArray[i] + " ");
    }
    int minValue = randomNumbersBigArray[0];
    int maxValue = randomNumbersBigArray[0];
    for (int i : randomNumbersBigArray){
       if (i < minValue){
           minValue = i;
       }
       if (i > maxValue){
           maxValue = i;
       }
    }
    System.out.println();
    System.out.println("Min Value: " + minValue);
    System.out.println("Max Value: " + maxValue);

    Arrays.sort(randomNumbersBigArray);
    System.out.println("Min Value: " + randomNumbersBigArray[0]);
    System.out.println("Max Value: " + randomNumbersBigArray[randomNumbersBigArray.length-1]);

//    e.print multi-dimension array 8x5
    int [][] multiDeminsionArray = new int[8][5];
    System.out.println("Multi-dimension array: ");
    for (int i = 0; i < multiDeminsionArray.length; i++ ){
        System.out.print("Line " + (i+1) + ":    ");
        for (int k = 0; k < multiDeminsionArray[i].length; k++){
            multiDeminsionArray[i][k] = (int) (Math.random() * (99-10) + 10);
            System.out.print(multiDeminsionArray[i][k] + " ");
        }
        System.out.println();
    }

//    g. print multi-dimension array 8x5 (1:999) with align
    int [][] multiDeminsionAlihnArray = new int[8][5];
    System.out.println("Multi-dimension align array: ");
    for (int i = 0; i < multiDeminsionArray.length; i++ ){
        System.out.print("Line " + (i+1) + ":    ");
        String result = "";
        for (int k = 0; k < multiDeminsionArray[i].length; k++){
            multiDeminsionArray[i][k] = (int) (Math.random() * (999-1) + 1);
            result += String.format("%1$3d ", multiDeminsionArray[i][k]);
//            System.out.print(multiDeminsionArray[i][k] + " ");
        }
        System.out.println(result);
//        System.out.println();
    }
        System.out.println();

// h. print entered numbers. Variant 1
    int [] enteredArray = {};

    Scanner sc = new Scanner(System.in);
    while (true){
        System.out.println("Please enter the number. To quit programme type exit and press Enter.");
        try{
            int number = sc.nextInt();
            int newLen = enteredArray.length + 1;
            enteredArray = Arrays.copyOf(enteredArray, newLen);
            enteredArray[newLen-1] = number;
        }
        catch (Exception e){
            System.out.println("Goodbye!!!");
            break;
        }
    }

    System.out.println(Arrays.toString(enteredArray));
    System.out.println(Arrays.stream(enteredArray).sum());


// h. print entered numbers. Variant 2

    ArrayList<Integer> numberArray = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);

   while(true){
        System.out.println("Please enter the number. To quit programme type exit and press Enter.");
        try{
            String entered = scan.nextLine();
            if (!entered.equals("exit")) {
                int number = Integer.parseInt(entered);
                numberArray.add(number);
            }
            else{
                break;
            }
        }
        catch (Exception e){
            System.out.println("Goodbye!!!");
            break;
        }
    }

    System.out.println(numberArray);

    int sum2 = 0;
    for(Integer i : numberArray){
        sum2 += i;
    }
    System.out.println(sum2);

}
}
