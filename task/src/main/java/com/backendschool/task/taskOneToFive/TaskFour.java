package com.backendschool.task.taskOneToFive;

import java.util.ArrayList;

public class TaskFour {
    public static void main(String[] args) {
        NumberInput numberInput = new NumberInput();
        ArrayList<String> numbers = new ArrayList<>();

        String numberString;
        int i = 1;
        System.out.println("0을 입력하시면 입력이 종료 됩니다.");
        while (true) {
            System.out.print("숫자 " + i + " : ");
            numberString = numberInput.inputNumber();

            while (!numberInput.isNumber(numberString)) {
                System.out.print("숫자 " + i + " : ");
                numberString = numberInput.inputNumber();
            }
            if (Float.parseFloat(numberString) == 0f) break;
            numbers.add(numberInput.removeDotIfInt(numberString));
            i++;
        }

        System.out.println("결과 : " + numbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
