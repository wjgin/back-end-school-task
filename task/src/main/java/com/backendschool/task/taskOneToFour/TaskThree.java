package com.backendschool.task.taskOneToFour;

import java.io.InputStreamReader;
import java.util.Arrays;

public class TaskThree {
    public static void main(String[] args) {
        float[] numberList = new float[10];
        String[] stringList = new String[10];
        NumberInput numberInput = new NumberInput();
        String numberString;

        for (int i = 1; i <= 10; i++) {
            System.out.print("숫자 " + i + " : ");
            numberString = numberInput.inputNumber();

            while (!numberInput.isNumber(numberString)) {
                System.out.print("숫자 " + i + " : ");
                numberString = numberInput.inputNumber();
            }

            numberList[i - 1] = Float.parseFloat(numberString);
        }
        Arrays.sort(numberList);

        String tempString;
        for (int i = 0; i < 10; i++) {
            tempString = "" + numberList[i];
            tempString = numberInput.removeDotIfInt(tempString);
            stringList[i] = tempString;
        }
        System.out.println("결과 : " + Arrays.toString(stringList).replaceAll("[\\[\\]]", ""));
    }
}
