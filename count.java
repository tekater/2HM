import java.util.Scanner;

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          // int num = scanner.nextInt();
          int size = 3;
          int count = 0;
          int[] myArray = new int[size];
        ///
        for (int num = 0; num < size; num++) {
            myArray[num] = scanner.nextInt();
        }
        ///
        for (int j = 0; j < myArray.length; j++) {
            if  (myArray[j] > 0) {
                ++count;
            }
        }
        ///
        for (int g = 0; g < count; g++) {
            if (count == 1) {
                System.out.println("true");
            }
        }   if (count > 1) {
                System.out.println("false");
            }
        //if((num1 && num2 == 1) || (num3 && num2 == 1) || (num1 && num3){
        //
        //} else if {
        //}
        /*if() {
            System.out.println("true");
        } else {
            System.out.println("false");

        }*/
    }
}
