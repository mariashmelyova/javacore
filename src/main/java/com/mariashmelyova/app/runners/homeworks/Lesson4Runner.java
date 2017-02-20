package com.mariashmelyova.app.runners.homeworks;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.mariashmelyova.app.classworks.expressionsandcontrolstatment.CircleArea;
import com.mariashmelyova.app.classworks.expressionsandcontrolstatment.Numbers;
import com.mariashmelyova.app.classworks.expressionsandcontrolstatment.TriangleCalculation;
import com.mariashmelyova.app.classworks.unittesting.MathFunc;
import com.mariashmelyova.app.utils.convertors.PrimitiveConverter;
/**
 * Created by mshm on 19-Feb-17.
 */
public class Lesson4Runner {
    static String menu = "Menu: \n"
            + "Converters: \n"
            + "1. Convert float to char\n"
            + "2. Convert integer to char\n"
            + "3. Convert char to integer\n\n"
            + "Math:\n"
            + "4. Multiply 2 numbers\n"
            + "5. Calculate circle area\n"
            + "6. Define which of circles is bigger\n"
            + "7. Define if triangle id right-angled\n"
            + "8. Define if number is odd or even\n"
            + "9. Define bigger number\n\n"
            + "0. Quit the programme\n\n";
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(menu);
        while (true){
            System.out.println("Please enter menu item number: ");
            try {
                int menu_item = scanner.nextInt();
                if (menu_item == 1){
                    System.out.println("Please enter float number: ");
                    float f = scanner.nextFloat();
                    PrimitiveConverter converter = new PrimitiveConverter();
                    System.out.println("Here is your char: " + converter.floatToChar(f));
                }

                else if (menu_item == 2){
                    System.out.println("Please enter integer number: ");
                    int i = scanner.nextInt();
                    PrimitiveConverter converter = new PrimitiveConverter();
                    System.out.println("Here is your char: " + converter.intToChar(i));
                }

                else if (menu_item == 3){
                    System.out.println("Please enter char: ");
                    char c = scanner.nextLine().charAt(0);
                    PrimitiveConverter converter = new PrimitiveConverter();
                    System.out.println("Here is your integer: " + converter.intToChar(c));
                }

                else if (menu_item == 4){
                    System.out.println("Please enter 2 numbers for multiply: ");
                    int number1 = scanner.nextInt();
                    int number2 = scanner.nextInt();
                    System.out.println("Here is the result: " + MathFunc.multiply(number1, number2));
                }

                else if (menu_item == 5){
                    System.out.print("Please enter the circle radius: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area is " + CircleArea.calculate(radius));
                }

                else if (menu_item == 6){
                    System.out.print("Please enter the first circle radius: ");
                    double radius1 = scanner.nextDouble();

                    System.out.print("Please enter the second circle radius2: ");
                    double radius2 = scanner.nextDouble();

                    System.out.println(CircleArea.calculateBigger(radius1, radius2));
                }

                else if (menu_item == 7){
                    System.out.println("Enter triangle sides: ");
                    int a = scanner.nextInt();
                    int b = scanner.nextInt();
                    int c = scanner.nextInt();
                    if (TriangleCalculation.isTriangleRightAngled(a,b,c)){
                        System.out.println("Your triangle is right-angled");
                    }
                    else {
                        System.out.println("Your triangle is not right-angled");

                    }
                }

                else if (menu_item == 8){
                    System.out.println("Please, enter the number: ");
                    int number = scanner.nextInt();
                    if (Numbers.numberIsEven(number)){
                        System.out.println(number + " is even");
                    }
                    else {
                        System.out.println(number + " is odd");
                    }

                }

                else if (menu_item == 9){
                    System.out.println("Please, enter two numbers: ");

                    int number1 = scanner.nextInt();
                    int number2 = scanner.nextInt();

                    System.out.println(Numbers.biggerNumber(number1, number2));
                }


                else {break;}
                System.out.println("Do you want to continue? (y/n)");

                String toContinue = scanner.nextLine();

                if (toContinue.equals("y")){
                    break;
                }
                else {continue;}

            }
            catch (InputMismatchException e) {
                System.out.println("Incorrect input. Restart the programme and enter numbr of item menu");
                break;
            }


        }
    }



}
