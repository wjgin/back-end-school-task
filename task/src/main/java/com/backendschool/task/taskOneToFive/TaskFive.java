package com.backendschool.task.taskOneToFive;

import java.util.ArrayList;

public class TaskFive {

    public static void main(String[] args) {
        ArrayList<String> primeNumbers = new ArrayList<>();
        NumberInput numberInput = new NumberInput();

        String numberString;
        int i = 1;
        System.out.println("0을 입력하시면 입력이 종료 됩니다.");
        while (true) {
            System.out.print("숫자 " + i + " : ");
            numberString = numberInput.inputNumber();
            if (!numberInput.isNumber(numberString)) continue;
            if (Float.parseFloat(numberString) == 0f) break;

            if (numberInput.isInt(numberString)) {
                numberString = numberInput.removeDotIfInt(numberString);
                if (numberInput.isPrime(Integer.parseInt(numberString))) {
                    if (primeNumbers.contains(numberString)) {
                        System.out.println("[입력오류] : 이미 입력된 숫자 입니다.");
                        continue;
                    }
                    else primeNumbers.add(numberString);
                }
            }
            i++;
        }
        System.out.println("결과 : " + primeNumbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
